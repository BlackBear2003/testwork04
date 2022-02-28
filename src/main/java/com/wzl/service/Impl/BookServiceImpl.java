package com.wzl.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wzl.entity.Book;
import com.wzl.entity.Type;
import com.wzl.mapper.BookMapper;
import com.wzl.mapper.HistoryMapper;
import com.wzl.mapper.TypeMapper;
import com.wzl.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;
    private TypeMapper typeMapper;
    private HistoryMapper historyMapper;


    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    @Override
    public List<Book> getBooksByName(String bookname) {
        return bookMapper.getBooksByName(bookname);
    }

    @Override
    public Book getBookById(int id) {
        return bookMapper.getBookById(id);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public List<Book> getBookByType(int type_id) {

        return bookMapper.getBookIdByType(type_id);
    }

    @Override
    public PageInfo getBooksByPage(int pageNum, int pageSize) {

        PageHelper.startPage(pageNum, pageSize);
        List<Book> list=bookMapper.getBooks();
        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;

    }

    @Override
    public void addClicktime(int id) {
        bookMapper.addClicktime(id);
    }

    @Override
    public List<Book> getRank() {
        return bookMapper.getRank();
    }

    @Override
    public List<Type> getTypes() {
        return typeMapper.getTypes();
    }

    @Override
    public List<Book> getHistory(int uid) {
        return historyMapper.getHistory(uid);
    }

    @Override
    public int addToHistory(int uid, int book_id) {
        return historyMapper.addToHistory(uid, book_id);
    }
}
