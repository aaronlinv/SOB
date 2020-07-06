package com.al.blog.controller;

import com.al.blog.response.ResponseResult;
import com.al.blog.response.ResponseState;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)

    public ResponseResult helloWorld() {
        System.out.println("hello world");
        ResponseResult responseResult = new ResponseResult(ResponseState.SUCCESS);
        responseResult.setData("hello");

        return responseResult;
    }
    
    /*@GetMapping("test-json")
    public User testJson() {
        User user = new User("al", 20, "male");
        return user;
    }*/
}
