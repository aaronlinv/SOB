package com.al.blog.services;

import com.al.blog.pojo.SobUser;
import com.al.blog.response.ResponseResult;

import javax.servlet.http.HttpServletRequest;

public interface IUserService {
    ResponseResult initManagerAccount(SobUser sobUser, HttpServletRequest request);
}
