package com.example.shibakenapp;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShibakenAppController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/")
    public String show() {
        return "Hello world";
    }

    @GetMapping("/api/shibaken")
    public List<String> getShibaken() {

        String url = "http://shibe.online/api/shibes";

        String[] strings = restTemplate.getForObject(url, String[].class);

        return Arrays.asList(strings);
    }
}
