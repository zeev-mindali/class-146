package com.jb.advanced_spring.clr;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jb.advanced_spring.beans.Mishtaken;
import com.jb.advanced_spring.util.TablePrinter;
import lombok.RequiredArgsConstructor;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Component
@Order(3)
@RequiredArgsConstructor
public class GetCollection implements CommandLineRunner {
    private final String url = "https://data.gov.il/api/3/action/datastore_search?resource_id=7c8255d0-49ef-49db-8904-4cf917586031&q=1216";
    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;
    private final List<Mishtaken> results;

    @Override
    public void run(String... args) throws Exception {
        String data = restTemplate.getForObject(url, String.class);
        JSONArray records = new JSONObject(data).getJSONObject("result")
                .getJSONArray("records");
        /*
        for (int counter=0;counter<records.length();counter++){
            //String singleItem = records.get(counter).toString();
            //System.out.println(singleItem);
            //Mishtaken singleMishtaken = objectMapper.readValue(singleItem,Mishtaken.class);
            //results.add(singleMishtaken);
            results.add(objectMapper.readValue(records.get(counter).toString(),Mishtaken.class));
        }
        */
        for (Object item : records) {
            results.add(objectMapper.readValue(item.toString(), Mishtaken.class));
        }
        TablePrinter.print(results);
    }
}
