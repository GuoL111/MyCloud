package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guol111
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Value("${server.port}")
    private String port;
    @GetMapping("/getProductList")
    public String getProduct(){
        System.out.println("进入商品服务" + port);
        return "hello, product";
    }

}
