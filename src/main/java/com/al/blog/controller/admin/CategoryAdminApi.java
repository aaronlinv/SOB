package com.al.blog.controller.admin;

import com.al.blog.pojo.Category;
import com.al.blog.response.ResponseResult;
import org.springframework.web.bind.annotation.*;

/**
 * 管理中心 分类
 */
@RestController
@RequestMapping("/admin/category")
public class CategoryAdminApi {
    /**
     * 增加分类
     *
     * @param category
     * @return
     */
    @PostMapping
    public ResponseResult addCategory(@RequestBody Category category) {
        return null;
    }

    /**
     * 删除分类
     *
     * @param categoryId
     * @return
     */
    @DeleteMapping("/{categoryId}")
    public ResponseResult deleteCategory(@PathVariable String categoryId) {
        return null;
    }

    /**
     * 修改分类
     *
     * @param categoryId
     * @return
     */
    @PutMapping("/{categoryId}")
    public ResponseResult updateCategory(@PathVariable String categoryId) {
        return null;
    }

    /**
     * 获取分类
     * @param categoryId 
     * @param category
     * @return
     */
    @GetMapping("/{categoryId}")
    public ResponseResult getCategory(@PathVariable String categoryId, Category category) {
        return null;
    }

    /**
     * 获取分类集合
     * @param page 
     * @param size
     * @return
     */
    @GetMapping("/list")
    public ResponseResult listCategory(@RequestParam("page") int page, @RequestParam("size") int size) {

        return null;
    }


}
