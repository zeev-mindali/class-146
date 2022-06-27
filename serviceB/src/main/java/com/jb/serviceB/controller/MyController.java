package com.jb.serviceB.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {
    @Value("${spring.cloud.consul.discovery.instanceId}")
    private String insId;

    @GetMapping("service/b")
    public String hello(){
        return "This is "+insId;
    }
}
