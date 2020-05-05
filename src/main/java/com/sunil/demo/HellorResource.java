package com.sunil.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HellorResource {

    @GetMapping
    public String hello(){
        return "Hello World";
    }
}
