package com.wzl.mapper;

import com.wzl.entity.Book;

import java.util.List;

public interface ShelfMapper {

    int addToShelf(int uid,int book_id);

    List<Book> getShelfByUid(int uid);

    int dropFromShelf(int uid,int book_id);

}
