package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.soap.Text;

@RestController
public class HelloWorld {

    @RequestMapping
    public String index() {
        return "Hello World!";
    }
}
