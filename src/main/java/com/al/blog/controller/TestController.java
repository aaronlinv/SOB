package com.al.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String helloWorld() {
        System.out.println("hello world");
        return "hello";
    }   

}