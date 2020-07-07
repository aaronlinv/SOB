package com.al.blog.controller.portal;

import com.al.blog.response.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/portal/web_site_info")
public class WebSiteInfoApi {
    
    // 获取所有分类
    @GetMapping("/categories")
    public ResponseResult getCategories() {
        return null;
    }


    @GetMapping("/title")
    public ResponseResult getWebSiteTitle() {
        return null;
    }

    @GetMapping("/view_count")
    public ResponseResult getWebSiteViewCount() {
        return null;
    }

    // 获取seo
    @GetMapping("/seo")
    public ResponseResult getSeo() {
        return null;
    }

    @GetMapping("/loop")
    public ResponseResult getLoops() {
        return null;
    }

    @GetMapping("/friend_link")
    public ResponseResult getLinks() {
        return null;
    }
}
