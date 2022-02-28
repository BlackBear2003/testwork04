package com.wzl.controller;

import com.wzl.entity.Book;
import com.wzl.entity.Type;
import com.wzl.service.BookService;
import com.wzl.service.Impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/bookapi")
public class BookApiController {

    @Autowired
    private BookServiceImpl bookService;

    @GetMapping(value = "/allbooks")
    public List<Book> getBookByPage(int pageNum,int pageSize){
            return bookService.getBooksByPage(pageNum, pageSize).getList();
    }

    @GetMapping(value = "/profile")
    public Book getBookProfile(int uid,int book_id){
        bookService.addClicktime(book_id);
        bookService.addToHistory(uid, book_id);
        return bookService.getBookById(book_id);
    }

    @GetMapping(value = "/rank")
    public List<Book> getBookRank(){
        return bookService.getRank();
    }

    @GetMapping(value = "/recommend")
    public List<Book> getRecommend(){

        return bookService.getRank();
    }


    @GetMapping(value = "/type")
    public List<Type> getTypes(){
        return bookService.getTypes();
    }

    @GetMapping(value = "/history")
    public List<Book> getHistory(int uid){
        return bookService.getHistory(uid);
    }


}
