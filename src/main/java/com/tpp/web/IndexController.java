package com.tpp.web;

import com.tpp.NotFoundException;
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
        String blog = null;
        if (blog == null) { 
            throw new NotFoundException("博客不存在");
        }
        return "index";
    }
}