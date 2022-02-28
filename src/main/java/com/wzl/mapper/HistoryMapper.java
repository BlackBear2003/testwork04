package com.wzl.mapper;

import com.wzl.entity.Book;

import java.util.List;

public interface HistoryMapper {

    int addToHistory(int uid,int book_id);

    List<Book> getHistory(int uid);

}
