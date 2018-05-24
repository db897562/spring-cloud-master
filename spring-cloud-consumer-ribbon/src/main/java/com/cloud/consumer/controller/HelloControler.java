package com.cloud.consumer.controller;

import com.cloud.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/name")
    public String hi(@RequestParam String name){
        //return "ok";
        return helloService.hiService(name);
    }


}