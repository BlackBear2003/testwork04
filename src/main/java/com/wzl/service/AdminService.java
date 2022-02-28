package com.wzl.service;

import com.wzl.entity.Book;
import com.wzl.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface AdminService {

    int getBookPassed(int id);

    int getBookBanned(int id);

    int opUser(int id);

    int deOpUser(int id);

    List<Book> getBannedBooks();

    int addRole(int id);

    int banBook(int id);

}
