package com.al.blog.controller;

import com.al.blog.pojo.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)

    public String helloWorld() {
        System.out.println("hello world");
        return "hello";
    }
    
    @GetMapping("test-json")
    public User testJson() {
        User user = new User("al", 20, "male");
        return user;
    }
}
