package com.jb.serviceA.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class MyController {

    private final RestTemplate restTemplate;

    @GetMapping("service/a")
    @HystrixCommand(fallbackMethod = "bazinga")
    public String hello(){
        String b = restTemplate.getForObject("http://service-B/service/b",String.class);
        return "this is a... calling to .... "+b;
    }

    public String bazinga(Throwable th){
        return "Service A: FALLBACK message - cannot call service - B";
    }
}
