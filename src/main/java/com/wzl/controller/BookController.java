package com.wzl.controller;

import com.wzl.entity.Book;
import com.wzl.service.Impl.AdminServiceImpl;
import com.wzl.service.Impl.BookServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Api(value = "/book", tags = "书本的基础CRUD")
@Controller
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private BookServiceImpl bookService;
    private AdminServiceImpl adminService;

    @GetMapping(value = "")
    public String bookhome(){
        return "bookindex";//TODO
    }

    @PostMapping(value = "/add")
    public String addBook(String bookname,String author,String description,String image,int clicktime){
        Book book = new Book(0,bookname,author,description,image,clicktime);
        bookService.addBook(book);
        adminService.banBook(book.getId());
        return "successful";


    }

    @DeleteMapping(value = "/delete")
    public String deleteBook(int id){
        bookService.deleteBook(id);
        return "successful";
    }


    @PostMapping(value = "/update")
    public String updateBook(Book book){
        if(book!=null){
            bookService.updateBook(book);
            return "successful";
        }
        else return "error";
    }


}
