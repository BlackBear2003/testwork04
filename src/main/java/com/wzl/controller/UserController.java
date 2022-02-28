package com.wzl.controller;

import com.wzl.entity.User;
import com.wzl.service.Impl.UserServiceImpl;
import com.wzl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController

public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/user/{id}")
    public User user(@PathVariable("id") int id) throws Exception {
        return userService.getUserById(id);
    }

    @GetMapping(value = "/user")
    public User user1(int id) throws Exception {
        return userService.getUserById(id);
    }




}
