package com.al.blog.controller.admin;

import com.al.blog.pojo.FriendLink;
import com.al.blog.response.ResponseResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/friend_link")
public class FriendLinkApi {
    @PostMapping
    public ResponseResult addFriendLink(@RequestBody FriendLink friendLink) {
        return null;
    }

    @DeleteMapping("/{friendLinkId}")
    public ResponseResult delFriendLink(@PathVariable String friendLinkId) {
        return null;
    }

    @PutMapping("/{friendLinkId}")
    public ResponseResult updateFriendLink(@PathVariable String friendLinkId) {
        return null;
    }

    @GetMapping("/{friendLinkId}")
    public ResponseResult getFriendLink(@PathVariable String friendLinkId) {
        return null;
    }

    @GetMapping("/list")
    public ResponseResult listFriendLink(@RequestParam("page") int page, @RequestParam("size") int size) {
        return null;
    }
}
