package com.tpp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ProjectName: blog_backend
 * @Package: com.tpp.web
 * @ClassName: IndexController
 * @Author: ptang
 * @Date: 2021/7/23 12:33 上午
 */

@Controller
public class IndexController {

    @GetMapping("/")
    public String getIndex(){
        System.out.println("------index------");
        return "index";
    }

    @GetMapping("/blog")
    public String blog(){
        System.out.println("------index------");
        return "blog";
    }
}