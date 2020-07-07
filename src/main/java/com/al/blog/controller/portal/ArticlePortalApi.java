package com.al.blog.controller.portal;

import com.al.blog.response.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/portal/article")
public class ArticlePortalApi {

    @GetMapping("/list/{page}/{size}")
    public ResponseResult listArticle(@PathVariable("page") int page, @PathVariable("size") int size) {
        return null;
    }
    // 获取指定分类文章列表
    @GetMapping("/list/{categoryId}/{page}/{size}")
    public ResponseResult listArticle(@PathVariable("categoryId") int category,
                                      @PathVariable("page") int page,
                                      @PathVariable("size") int size) {
        return null;
    }

    @GetMapping("/{articleId}")
    public ResponseResult getArticleDetail(@PathVariable("articleId") String id) {
        return null;
    }


    @GetMapping("/recommend/{articleId}")
    public ResponseResult getRecommendArticle(@PathVariable("articleId") String id) {
        return null;
        
    }

}
