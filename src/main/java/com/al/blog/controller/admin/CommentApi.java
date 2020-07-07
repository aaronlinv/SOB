package com.al.blog.controller.admin;

import com.al.blog.pojo.Comment;
import com.al.blog.response.ResponseResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/comment")
public class CommentApi {


    @DeleteMapping("/{looperId}")
    public ResponseResult delComment(@PathVariable String commentId) {
        return null;
    }
    

    @GetMapping("/list")
    public ResponseResult listComment(@RequestParam("page") int page, @RequestParam("size") int size) {
        return null;
    }

    // 置顶
    @PutMapping("/top/{comment}")
    public ResponseResult topComment(@PathVariable("comment") Comment comment) {
        return null;
    }

}
