package com.wzl.controller;

import com.wzl.entity.Book;
import com.wzl.service.Impl.ShelfServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/bookshelf")
public class BookShelfController {

    @Autowired
    private ShelfServiceImpl shelfService;



    @GetMapping(value = "",
            consumes = "application/json;charset=UTF-8",
            produces = "application/json;charset=UTF-8")
    @ResponseBody
    public List<Book> shelf(int uid){
        return shelfService.getShelfByUid(uid);
    }

    @PostMapping(value = "/add")
    public String add(int uid, int book_id){
        shelfService.addToShelf(uid, book_id);

        return "successful";
    }

    @DeleteMapping(value = "/delete")
    public String delete(int uid, int book_id){
        shelfService.dropFromShelf(uid, book_id);
        return "successful";
    }


}
