package com.al.blog.services.impl;

import com.al.blog.pojo.SobUser;
import com.al.blog.response.ResponseResult;
import com.al.blog.services.IUserService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

@Service
// 操作数据库，事务管理起来
@Transactional
public class UserServiceImpl implements IUserService {
    @Override
    public ResponseResult initManagerAccount(SobUser sobUser, HttpServletRequest request) {
        return null;
    }
}
