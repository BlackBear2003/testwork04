package com.wzl.mapper;

import com.wzl.entity.Book;

import java.util.ArrayList;
import java.util.List;

public interface BookMapper {

    int addBook(Book book);

    int deleteBook(int id);

    List<Book> getBooksByName(String bookname);

    Book getBookById(int id);

    int updateBook(Book book);

    ArrayList<Book> getBookIdByType(int type_id);


    List<Book> getBooks();


    void addClicktime(int id);

    List<Book> getRank();

}
