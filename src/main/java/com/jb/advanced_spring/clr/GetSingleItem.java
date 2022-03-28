package com.jb.advanced_spring.clr;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jb.advanced_spring.beans.Mishtaken;
import com.jb.advanced_spring.util.TablePrinter;
import lombok.RequiredArgsConstructor;

import org.json.JSONObject;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Order(2)
@RequiredArgsConstructor
public class GetSingleItem implements CommandLineRunner {
    private final String url = "https://data.gov.il/api/3/action/datastore_search?resource_id=7c8255d0-49ef-49db-8904-4cf917586031&q=1216";
    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;

    @Override
    public void run(String... args) throws Exception {
        String data = restTemplate.getForObject(url,String.class);
        System.out.println(data);
        String record = new JSONObject(data).getJSONObject("result")
                .getJSONArray("records").get(0).toString();
        System.out.println(record);
        Mishtaken single = objectMapper.readValue(record,Mishtaken.class);
        TablePrinter.print(single);
    }
}
