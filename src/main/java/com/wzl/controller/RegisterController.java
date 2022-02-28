package com.wzl.controller;

import com.wzl.service.Impl.AdminServiceImpl;
import com.wzl.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLException;

@Controller
public class RegisterController {

    @Autowired
    private UserServiceImpl userService;
    private AdminServiceImpl adminService;

    @GetMapping(value = {"/register"})
    public String register(){
        return "register";
    }


    @PostMapping(value = {"/register"})
    public String register(String username,String password ) throws SQLException {

        int n = userService.addUser(username, password);
        adminService.addRole(n);

        System.out.println(n);
        return "successful";
    }




}
