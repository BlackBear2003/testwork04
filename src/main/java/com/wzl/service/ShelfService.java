package com.wzl.service;

import com.wzl.entity.Book;

import java.util.List;

public interface ShelfService {

    int addToShelf(int uid,int book_id);

    List<Book> getShelfByUid(int uid);

    int dropFromShelf(int uid,int book_id);

}
