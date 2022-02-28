package com.wzl.controller;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {



    @GetMapping(value= {"/","/login"})
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(String username,String password) {
        //使用 shiro 登录验证
        //1 认证的核心组件：获取 Subject 对象
        Subject subject = SecurityUtils.getSubject();
        //2 将登陆表单封装成 token 对象
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
            //3 让 shiro 框架进行登录验证：
            subject.login(token);
        } catch (Exception e) {
            e.printStackTrace();
            return "loginError";
        }
        return "authorized";
    }



}
