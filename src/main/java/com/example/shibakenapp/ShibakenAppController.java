package com.example.shibakenapp;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShibakenAppController {

    private RestTemplate restTemplate;

    public void MyService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }
    
	public TestResponseResource someRestCall(String name) {
		return this.restTemplate.getForObject("/api/details", TestResponseResource.class);
	}

    @GetMapping("/")
    public String show() {
        return "Hello world";
    }
}
