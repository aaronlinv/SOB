package com.al.blog.dao;

import com.al.blog.pojo.SobUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

// 第二个参数是ID
public interface UserDao extends JpaRepository<SobUser,String>, JpaSpecificationExecutor<SobUser> {
    
    
}
