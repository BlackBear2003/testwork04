package com.wzl.service.Impl;

import com.wzl.entity.Book;
import com.wzl.mapper.AdminMapper;
import com.wzl.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;


    @Override
    public int getBookPassed(int id) {
        return adminMapper.getBookPassed(id);
    }

    @Override
    public int getBookBanned(int id) {
        return adminMapper.getBookPassed(id);
    }

    @Override
    public int opUser(int id) {
        return adminMapper.opUser(id);
    }

    @Override
    public int deOpUser(int id) {
        return adminMapper.deOpUser(id);
    }

    @Override
    public List<Book> getBannedBooks() {
        return adminMapper.getBannedBooks();
    }

    @Override
    public int addRole(int id) {
        return adminMapper.addRole(id);
    }

    @Override
    public int banBook(int id) {
        return adminMapper.banBook(id);
    }
}
