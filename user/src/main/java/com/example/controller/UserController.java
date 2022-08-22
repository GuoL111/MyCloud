package com.example.controller;

import com.example.clients.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private ProductClient productClient;

    @Value("${server.port}")
    private String port;

    @GetMapping("/getUser")
    public String getUser(){
        return "nihaoa";
    }

    @GetMapping("/productClient")
    public String productClient(){
        return productClient.getProductList();
    }
}
