package com.mizhi.demo.product.bo.product.DemoProdcut.app.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.mizhi.demo.api.product.api.ProductService;
import com.mizhi.demo.api.product.bo.product.DemoProdcut;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Reference(loadbalance = "Hash ConsistentHash LoadBalance")
    private ProductService productServiceImpl;

    @GetMapping("test")
    public String test() {
        DemoProdcut one = productServiceImpl.findOne(1);
        return  JSONObject.toJSONString(one);
    }

}
