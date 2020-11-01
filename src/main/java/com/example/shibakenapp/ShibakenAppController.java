package com.example.shibakenapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class ShibakenAppController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/shibaken")
    public String shibaken() {
        return "shibaken";
    }

    @GetMapping("/cat")
    public String cat() {
        return "cat";
    }

}
