package xml_json;

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

public class Tester {
    public static final String XML_URL = "https://www.boi.org.il/currency.xml";
    public static final String JSON_URL = "https://data.gov.il/api/3/action/datastore_search?resource_id=053cea08-09bc-40ec-8f7a-156f0677aff3&q=1113334";

    public static void main(String[] args) {
        Tester tester = new Tester();
        //System.out.println(tester.getURLdata(XML_URL));
        List<Currency> currencies = tester.readXML(tester.getURLdata(XML_URL));
        //currencies.forEach(System.out::println);
        currencies.stream()
                .filter(item->item.getChange()<0)
                .filter(item->item.getName().equals("Dollar"))
                .forEach(System.out::println);

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
