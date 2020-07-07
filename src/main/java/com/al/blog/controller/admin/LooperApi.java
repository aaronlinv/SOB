package com.al.blog.controller.admin;

import com.al.blog.pojo.Looper;
import com.al.blog.response.ResponseResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/loop")
public class LooperApi {

    @PostMapping
    public ResponseResult addLoop(@RequestBody Looper looper) {
        return null;
    }

    @DeleteMapping("/{loopId}")
    public ResponseResult delLoop(@PathVariable String loopId) {
        return null;
    }

    @PutMapping("/{loopId}")
    public ResponseResult updateLoop(@PathVariable String loopId) {
        return null;
    }

    @GetMapping("/{loopId}")
    public ResponseResult getLoop(@PathVariable String loopId) {
        return null;
    }

    @GetMapping("/list")
    public ResponseResult listLoop(@RequestParam("page") int page, @RequestParam("size") int size) {
        return null;
    }
}
