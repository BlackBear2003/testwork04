package com.wzl.service;

import com.github.pagehelper.PageInfo;
import com.wzl.entity.Book;
import com.wzl.entity.Type;

import java.util.List;

public interface BookService {

    int addBook(Book book);

    int deleteBook(int id);

    List<Book> getBooksByName(String bookname);

    Book getBookById(int id);

    int updateBook(Book book);

    List<Book> getBookByType(int type_id);

    public PageInfo getBooksByPage(int pageNum, int pageSize);

    void addClicktime(int id);

    List<Book> getRank();

    List<Type> getTypes();

    List<Book> getHistory(int uid);

    int addToHistory(int uid,int book_id);

}
