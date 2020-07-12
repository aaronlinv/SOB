package com.al.blog.controller;

import com.al.blog.dao.LabelDao;
import com.al.blog.pojo.Label;
import com.al.blog.pojo.TestUser;
import com.al.blog.response.ResponseResult;
import com.al.blog.response.ResponseState;
import com.al.blog.utils.SnowflakeIdWorker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Date;

@Transactional
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private LabelDao labelDao;


    @Autowired
    private SnowflakeIdWorker idWorker;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)

    public ResponseResult helloWorld() {
        log.info("hello world");
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
        log.info("user name= >" + user.getUserName());
        log.info("user password= >" + user.getPassword());


        return ResponseResult.SUCCESS("登录成功").setData(user);
    }

    @PostMapping("/label")
    public ResponseResult addLabel(@RequestBody Label label) {
        // 判断数据是否有效

        // 补全数据
        label.setId(String.valueOf(idWorker.nextId()));
        // 保存数据
        label.setCreateTime(new Date());
        label.setUpdateTime(new Date());

        labelDao.save(label);
        return ResponseResult.SUCCESS("测试添加标签成功");
    }

    @DeleteMapping("/label/{deleteId}")
    public ResponseResult deleteLabel(@PathVariable String deleteId) {


        // int deleteResult = labelDao.deleteOneById(deleteId);
        int deleteResult = labelDao.customDeleteById(deleteId);
        log.info("deleteResult == >" + deleteResult);
        if (deleteResult > 0) {
            return ResponseResult.SUCCESS("删除标签成功");
        } else {
            return ResponseResult.FAILED("标签不存在");
        }
    }

    @PutMapping("/label/{updateId}")
    public ResponseResult updateLabel(@PathVariable String updateId, @RequestBody Label label) {
        Label dbLabel = labelDao.findOneById(updateId);
        if (dbLabel == null) {
            return ResponseResult.FAILED("标签不存在");
        }
        dbLabel.setCount(label.getCount());
        dbLabel.setName(label.getName());
        dbLabel.setUpdateTime(new Date());

        labelDao.save(dbLabel);
        return ResponseResult.SUCCESS("修改成功");
    }

    @GetMapping("/label/{labelId}")
    public ResponseResult getLabelById(@PathVariable String labelId) {
        Label dbLabel = labelDao.findOneById(labelId);
        if (dbLabel == null) {
            return ResponseResult.FAILED("标签不存在");
        }
        return ResponseResult.SUCCESS("查询成功").setData(dbLabel);
    }
}
