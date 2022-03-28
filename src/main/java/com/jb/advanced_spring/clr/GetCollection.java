package com.jb.advanced_spring.clr;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.jb.advanced_spring.beans.Mishtaken;
import com.jb.advanced_spring.util.TablePrinter;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.json.JSONParser;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
@Order(2)
@RequiredArgsConstructor
public class GetCollection implements CommandLineRunner {
    private final ObjectMapper objectMapper;
    private final RestTemplate restTemplate;
    private final String url = "https://data.gov.il/api/3/action/datastore_search?resource_id=7c8255d0-49ef-49db-8904-4cf917586031&q=1216";

    @Override
    public void run(String... args) throws Exception {

        String data = restTemplate.getForObject(url,String.class);
        Mishtaken[] records = objectMapper.readValue(url,Mishtaken[].class);
        TablePrinter.print(records);


    }
}
