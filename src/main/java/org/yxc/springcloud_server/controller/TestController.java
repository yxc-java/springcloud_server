package org.yxc.springcloud_server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello world!");
        return  "hello world";
    }

}
