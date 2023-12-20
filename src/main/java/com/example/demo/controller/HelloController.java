package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author FengHengliang
 * @date 2023/12/19 15:50
 **/
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        String text = "你好，世界/Hello World";
        System.out.println(text);
        return text;
    }
}
