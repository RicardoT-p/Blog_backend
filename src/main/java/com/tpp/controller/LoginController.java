package com.tpp.controller;

import com.tpp.entity.User;
import com.tpp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

/**
 * @ProjectName: blog_backend
 * @Package: com.tpp.controller
 * @ClassName: LoginController
 * @Author: ptang
 * @Date: 2021/8/2 11:00 下午
 */
@Controller
@RequestMapping("/admin")
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String loginPage(){
        return "admin/login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        HttpSession session,
                        RedirectAttributes attributes){
        if (userService.checkUsername(username)){
            User user = userService.checkUser(username,password);
            if (user != null){
                user.setPassword(null);
                session.setAttribute("user",user);
                return "admin/index";
            }else{
                attributes.addFlashAttribute("message","用户名或者密码错误！");
                return "redirect:";
            }
        }else {
            attributes.addFlashAttribute("message","用户名不存在！");
            return "redirect:";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/admin";
    }
}