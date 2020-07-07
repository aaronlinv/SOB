package com.al.blog.controller.user;

import com.al.blog.pojo.SobUser;
import com.al.blog.response.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserApi {
    /**
     * 初始化管理员账号
     *
     * @return
     */
    @PostMapping("/admin_account")
    public ResponseResult initManagerAccount(@RequestBody SobUser user) {
        log.info("username == > " + user.getUserName());
        log.info("password == > " + user.getPassword());
        log.info("email == > " + user.getEmail());
        return ResponseResult.SUCCESS();
    }

    /**
     * 注册
     *
     * @return
     */
    @PostMapping
    public ResponseResult register(@RequestBody SobUser user) {
        return null;
    }

    /**
     * 登录sign in
     *
     * @param captcha
     * @param user
     * @return
     */
    @PostMapping("/{captcha}")
    public ResponseResult login(@PathVariable("captcha") String captcha, @RequestBody SobUser user) {
        return null;
    }

    /**
     * 获取验证码
     *
     * @return
     */
    @GetMapping("/captcha")
    public ResponseResult getCaptcha() {
        return null;
    }

    /**
     * 发送Email
     *
     * @param emailAddress
     * @return
     */
    @GetMapping("/verify_code")
    public ResponseResult sendVerifyCode(@RequestParam("email") String emailAddress) {
        log.info("email == > " + emailAddress);
        return ResponseResult.SUCCESS();
    }

    /**
     * 修改密码
     *
     * @param sobUser
     * @return
     */
    @PutMapping("/password/{userId}")
    public ResponseResult updatePassword(@PathVariable("userId") String userId, @RequestBody SobUser sobUser) {
        return null;
    }

    /**
     * 获取用户信息
     *
     * @return
     */
    @GetMapping("/{userId}")
    public ResponseResult getUserInfo(@PathVariable String userId) {

        return null;
    }

    /**
     * 修改用户
     *
     * @param sobUser
     * @return
     */
    @PutMapping("/{userId}")
    public ResponseResult updateUserInfo(@PathVariable String userId, @RequestBody SobUser sobUser) {
        return null;
    }

    /**
     * 获取用户列表
     *
     * @param page
     * @param size
     * @return
     */
    @GetMapping("/list")
    public ResponseResult listUser(@RequestParam("page") int page, @RequestParam("size") int size) {
        return null;
    }

    /**
     * 删除用户
     *
     * @param userId
     * @return
     */
    @DeleteMapping("/{userId}")
    public ResponseResult deleteUser(@PathVariable String userId) {
        return null;
    }
    
}
