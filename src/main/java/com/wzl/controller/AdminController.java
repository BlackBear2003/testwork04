package com.wzl.controller;

import com.wzl.entity.Book;
import com.wzl.service.Impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    private AdminServiceImpl adminService;

    @GetMapping(value = "/findBannedBooks",
            consumes = "application/json;charset=UTF-8",
            produces = "application/json;charset=UTF-8")
    @ResponseBody
    public List<Book> find(){
        return adminService.getBannedBooks();
    }

    @PostMapping(value = "/passBook")
    public int passBook(int id){
        return adminService.getBookPassed(id);
    }

    @PostMapping(value = "/banBook")
    public int banBook(int id){
        return adminService.getBookBanned(id);
    }

    @PostMapping(value = "/opUser")
    public int opUser(int id){
        return adminService.opUser(id);
    }

    @PostMapping(value = "/deOpUser")
    public int deOpUser(int id){
        return adminService.deOpUser(id);
    }

}
