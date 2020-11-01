package com.example.shibakenapp;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api")
public class ShibakenApiController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/")
    public String show() {
        return "Hello world";
    }

    @GetMapping("/shibaken")
    public List<String> getShibaken() {

        String url = "http://shibe.online/api/shibes";

        String[] strings = restTemplate.getForObject(url, String[].class);

        return Arrays.asList(strings);
    }

    @GetMapping("/cat")
    public Object getCat() {

        String url = "https://aws.random.cat/meow";

        Object objects = restTemplate.getForObject(url, Object.class);

        return Arrays.asList(objects);
    }
}
