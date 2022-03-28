package com.jb.advanced_spring.clr;

import com.jb.advanced_spring.beans.Mishtaken;
import com.jb.advanced_spring.util.TablePrinter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
@Order(1)
@RequiredArgsConstructor
public class GetPojo implements CommandLineRunner {
    //we are working on single item....
    private final RestTemplate restTemplate;
    private final String url = "https://data.gov.il/api/3/action/datastore_search?resource_id=7c8255d0-49ef-49db-8904-4cf917586031&q=1216";

    @Override
    public void run(String... args) throws Exception {

        //plain text
        String result = restTemplate.getForObject(url, String.class);
        System.out.println(result);

        //component with data (pojo) - not working :(
        //when we check the string, the records field, is an array
        Mishtaken data = restTemplate.getForObject(url, Mishtaken.class);
        TablePrinter.print(data);

        System.out.println();
    }
}
