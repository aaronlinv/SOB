package com.al.blog.controller.admin;

import com.al.blog.response.ResponseResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/web_site_info")
public class WebsiteInfoApi {
    @GetMapping("/title")
    public ResponseResult getWebSiteTitle() {
        return null;
    }

    @PutMapping("/title")
    public ResponseResult updateWebSiteTitle(@RequestParam("title") String title) {
        return null;
    }

    @GetMapping("/seo")
    public ResponseResult getSeoInfo() {
        return null;
    }

    @PutMapping("/seo")
    public ResponseResult putSeoInfo(@RequestParam("keywords") String keywords,
                                     @RequestParam("description") String description) {
        return null;
    }

    @GetMapping("/view_count")
    public ResponseResult getWebSiteViewCount() {
        return null;
    }
}   
