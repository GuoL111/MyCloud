package com.example.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

//cloudproduct是product服务的ID，也就是服务名（在yml中配置的）feign会自动把接口注入到工厂中，使用@Autowired调用
@FeignClient("cloudproduct")
public interface ProductClient {
    /**
     * 使用openfeign远程调用商品服务
     * @return
     */
    @GetMapping("/product/getProductList")
    String getProductList();
}
