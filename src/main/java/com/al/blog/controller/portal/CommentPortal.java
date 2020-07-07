package com.al.blog.controller.portal;

import com.al.blog.pojo.Comment;
import com.al.blog.response.ResponseResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/portal")
public class CommentPortal {
    @PostMapping
    public ResponseResult postComment(@RequestBody Comment comment) {
        return null;
    }


    @DeleteMapping("/{looperId}")
    public ResponseResult delComment(@PathVariable String commentId) {
        return null;
    }
}
