package com.al.blog.controller;

import com.al.blog.pojo.TestUser;
import com.al.blog.response.ResponseResult;
import com.al.blog.response.ResponseState;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)

    public ResponseResult helloWorld() {
        System.out.println("hello world");
        ResponseResult responseResult = new ResponseResult(ResponseState.SUCCESS).setData("hello");


        return responseResult;
    }
    
    /*@GetMapping("test-json")
    public User testJson() {
        User user = new User("al", 20, "male");
        return user;
    }*/

    @PostMapping("/test-login")
    public ResponseResult testLogin(@RequestBody TestUser user) {
        System.out.println("user name= >" + user.getUserName());
        System.out.println("user password= >" + user.getPassword());
        
        
        return ResponseResult.SUCCESS("登录成功").setData(user);
    }
}
