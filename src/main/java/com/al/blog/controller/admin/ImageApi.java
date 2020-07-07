package com.al.blog.controller.admin;

import com.al.blog.response.ResponseResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/image")
public class ImageApi {

    @PostMapping
    public ResponseResult uploadImage() {
        return null;
    }

    @DeleteMapping("/{imageId}")
    public ResponseResult delImage(@PathVariable String imageId) {
        return null;
    }

    @PutMapping("/{imageId}")
    public ResponseResult updateImage(@PathVariable String imageId) {
        return null;
    }

    @GetMapping("/{imageId}")
    public ResponseResult getImage(@PathVariable String imageId) {
        return null;
    }

    @GetMapping("/list")
    public ResponseResult listImage(@RequestParam("page") int page, @RequestParam("size") int size) {
        return null;
    }


}
