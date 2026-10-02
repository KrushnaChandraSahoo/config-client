package com.configclient.config_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${company.name}")
    private String companyName;

    @RequestMapping("/")
    public String home() {
        return companyName;
    }
}
