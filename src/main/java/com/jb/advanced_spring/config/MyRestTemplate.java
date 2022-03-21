package com.jb.advanced_spring.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class MyRestTemplate {
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder
                //set connection timeout for 3 sec.
                .setConnectTimeout(Duration.ofMillis(3_000))
                //set read timeout for 3 sec.
                .setReadTimeout(Duration.ofMillis(3_000))
                .build();
    }


}
