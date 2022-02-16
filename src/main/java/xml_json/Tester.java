package xml_json;

//json object
import org.json.JSONException;
import org.json.JSONObject;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester {
    public static final String XML_URL = "https://www.boi.org.il/currency.xml";
    public static final String JSON_URL = "https://data.gov.il/api/3/action/datastore_search?resource_id=053cea08-09bc-40ec-8f7a-156f0677aff3&q=";
    public static final String JSON_BIKE_URL = "https://data.gov.il/api/3/action/datastore_search?resource_id=bf9df4e2-d90d-4c0a-a400-19e15af8e95f&q=";
    public static void main(String[] args) {
        Tester tester = new Tester();
        Scanner scanner = new Scanner(System.in);

        //System.out.println(tester.getURLdata(XML_URL));
        List<Currency> currencies = tester.readXML(tester.getURLdata(XML_URL));
        //currencies.forEach(System.out::println);
//        currencies.stream()
//                .filter(item->item.getChange()<0)
//                .filter(item->item.getName().equals("Dollar"))
//                .forEach(System.out::println);
        System.out.println("Please enter car plate number:");
        String carNumber = scanner.nextLine();
        //tester.readJSON(tester.getURLdata(JSON_URL+carNumber));
        tester.readJSON(tester.getURLdata(JSON_BIKE_URL+carNumber));
    }

    private void readJSON(String myJson){
        //convert our string to json object
        try {
            //convert our String to json object (don't forget to import sax.json
            var carData = new JSONObject(myJson);
            //getting our result from json object;
            var result = carData.getJSONObject("result");
            //get json array from result
            var carArry = result.getJSONArray("records");
            if (carArry.length()==0){
                System.out.println("Car not found");
                return;
            }
            //get a single car from the array
            var singleCar = (JSONObject) carArry.get(0);

            System.out.println("mispar rechev: "+singleCar.getInt("mispar_rechev"));
            System.out.println("manufactor: "+singleCar.getString("tozeret_nm"));
            System.out.println("model: "+singleCar.getString("kinuy_mishari"));
            System.out.println("test: "+singleCar.getString("tokef_dt").split("T")[0]);
            System.out.println("tzeva rechev: "+singleCar.getString("tzeva_rechev"));

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    private List<Currency> readXML(String xml) {
        //we will create a document builder that will allow us an easier access to our XML String
        List<Currency> currencies = new ArrayList<>();

        try {
            //create an object, so we can build a document by our needs
            var builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            //convert the string to xml format
            var dom = builder.parse(new InputSource(new StringReader(xml)));

            //mapped the item that i need from XML 
            var itemName = dom.getElementsByTagName("NAME");
            var itemUnit = dom.getElementsByTagName("UNIT");
            var itemCurrencyCode = dom.getElementsByTagName("CURRENCYCODE");
            var itemCountry = dom.getElementsByTagName("COUNTRY");
            var itemRate = dom.getElementsByTagName("RATE");
            var itemChange = dom.getElementsByTagName("CHANGE");

            for (int counter = 0; counter < itemName.getLength(); counter++) {
                currencies.add(new Currency(
                        itemName.item(counter).getTextContent(),
                        Integer.parseInt(itemUnit.item(counter).getTextContent()),
                        itemCurrencyCode.item(counter).getTextContent(),
                        itemCountry.item(counter).getTextContent(),
                        Double.parseDouble(itemRate.item(counter).getTextContent()),
                        Double.parseDouble(itemChange.item(counter).getTextContent())
                        ));
            }
        } catch (ParserConfigurationException | IOException | SAXException e) {
            System.out.println(e.getMessage());
        }
        return currencies;
    }

    private String getURLdata(String url) {
        //string builder for getting data that will not be immutable
        StringBuilder stringBuilder = new StringBuilder();
        //create instance of connection to the internet
        HttpURLConnection httpURLConnection = null;

        try {
            //open a connection to the internet
            httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
            //create buffer reader for getting data stream
            var buf = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String line;
            //while not getting null, read next line
            while ((line = buf.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            //close the connection
            httpURLConnection.disconnect();
        }

        return stringBuilder.toString();
    }
}
