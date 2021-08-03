package com.tpp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: blog_backend
 * @Package: com.tpp.controller
 * @ClassName: BlogController
 * @Author: ptang
 * @Date: 2021/8/3 9:20 下午
 */
@RequestMapping("/admin")
@Controller
public class BlogController {

    @GetMapping("/blogs")
    public String blogs() {
        return "admin/blogs";
    }
}