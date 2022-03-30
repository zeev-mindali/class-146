package com.jb.currency.clr;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

//@Component
@RequiredArgsConstructor
public class TestData implements CommandLineRunner {
    private final RestTemplate restTemplate;

    @Override
    public void run(String... args) throws Exception {
        String currencyCode = "ils";
        String url = "https://api.exchangerate-api.com/v4/latest/"+currencyCode;
        String result = restTemplate.getForObject(url,String.class);
        System.out.println(result);
        Map<String,Object> myMap = restTemplate.getForObject(url,Map.class);
        Map<String,Double> myCurr = (Map<String, Double>) myMap.get("rates");
        //System.out.println(myMap.get("rates"));
        System.out.println(myCurr);
    }
}
