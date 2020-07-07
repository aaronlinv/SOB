package com.al.blog.controller.admin;

import com.al.blog.pojo.Article;
import com.al.blog.response.ResponseResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/article")
public class ArticleApi {
    @PostMapping
    public ResponseResult postArticle(@RequestBody Article article) {
        return null;
    }

    @DeleteMapping("/{articleId}")
    public ResponseResult delArticle(@PathVariable String articleId) {
        return null;
    }

    @PutMapping("/{articleId}")
    public ResponseResult updateArticle(@PathVariable String articleId) {
        return null;
    }

    @GetMapping("/{articleId}")
    public ResponseResult getArticle(@PathVariable String articleId) {
        return null;
    }

    @GetMapping("/list")
    public ResponseResult listArticle(@RequestParam("page") int page, @RequestParam("size") int size) {
        return null;
    }

    // -------------
    
    // 改变文章状态
    @PostMapping("/state/{articleId}/{state}")
    public ResponseResult updateArticleState(@PathVariable("articleId") String articleId, @PathVariable("state") String state) {
        return null;
    }

    // 置顶
    @PostMapping("/top/{articleId}")
    public ResponseResult topArticleState(@PathVariable("articleId") String articleId) {
        return null;
    }
}
