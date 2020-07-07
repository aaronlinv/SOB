package com.al.blog;

import com.al.blog.utils.SnowflakeIdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

    @Bean
    public SnowflakeIdWorker createIdWorker() {
        return new SnowflakeIdWorker(0, 0);
    }

}
