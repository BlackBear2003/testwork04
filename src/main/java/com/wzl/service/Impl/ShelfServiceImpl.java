package com.wzl.service.Impl;

import com.wzl.entity.Book;
import com.wzl.mapper.ShelfMapper;
import com.wzl.service.ShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShelfServiceImpl implements ShelfService {

    @Autowired
    private ShelfMapper shelfMapper;

    @Override
    public int addToShelf(int uid, int book_id) {
        return shelfMapper.addToShelf(uid, book_id);
    }

    @Override
    public List<Book> getShelfByUid(int uid) {
        return shelfMapper.getShelfByUid(uid);
    }

    @Override
    public int dropFromShelf(int uid, int book_id) {
        return shelfMapper.dropFromShelf(uid, book_id);
    }
}
