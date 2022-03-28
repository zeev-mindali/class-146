package com.jb.advanced_spring.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jb.advanced_spring.beans.Mishtaken;
import com.jb.advanced_spring.controller.MishtakenController;
import com.jb.advanced_spring.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MishtakenService {
    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;
    private final String url = "https://data.gov.il/api/3/action/datastore_search?resource_id=7c8255d0-49ef-49db-8904-4cf917586031&q=";
    private final List<Mishtaken> results;
    private final String filter="בתהליכי הגרלה";
    private final String full="היתר מלא";

    public List<Mishtaken> getByCity(String city) throws JsonProcessingException, NotFoundException {
        results.clear();
        String data = restTemplate.getForObject(url+city+" "+filter+" "+full, String.class);
        JSONArray records = new JSONObject(data).getJSONObject("result")
                .getJSONArray("records");
        for (Object item : records) {
            results.add(objectMapper.readValue(item.toString(), Mishtaken.class));
        }
        System.out.println("city:"+city);
        //results.remove(0);
        if (results.isEmpty()){
            throw new NotFoundException("לא נמצאו הגרלות, אבל אצל גולן באשקלון תמיד יש");
        }
        System.out.println("Total found:"+results.size());
        return results;
    }

    public Mishtaken getById(int id) throws JsonProcessingException {
        results.clear();
        String data = restTemplate.getForObject(url+id,String.class);
        JSONArray records = new JSONObject(data).getJSONObject("result")
                .getJSONArray("records");
        for (Object item : records) {
            results.add(objectMapper.readValue(item.toString(), Mishtaken.class));
        }
        return results.stream().filter(item->item.getLotteryId()==id).collect(Collectors.toList()).get(0);
    }
}
