package com.wzl.mapper;

import com.wzl.entity.Book;

import java.util.List;

public interface AdminMapper {

    int getBookPassed(int id);

    int getBookBanned(int id);

    int opUser(int id);

    int deOpUser(int id);

    List<Book> getBannedBooks();

    int addRole(int id);

    int banBook(int id);
}
