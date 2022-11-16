package com.labafive.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("")
public class MyFirstController {
    @GetMapping("/hello")
    String hello(@RequestParam String name){
        return String.format("HELLO %s", name);
    }

}
