package com.al.blog.dao;

import com.al.blog.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface LabelDao extends JpaRepository<Label, String>, JpaSpecificationExecutor<Label> {

    @Modifying
    int deleteOneById(String id);


    @Modifying
    // 写sql
    @Query(value = "DELETE FROM `tb_labels` WHERE id = ?",nativeQuery = true)
    int customDeleteById(String id);
    
    Label findOneById(String id);
}
