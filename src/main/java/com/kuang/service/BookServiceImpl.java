package com.kuang.service;

import com.kuang.dao.BookMapper;
import com.kuang.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService{

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books book) {
        return 0;
    }

    @Override
    public int deleteBookById(int id) {
        return 0;
    }

    @Override
    public int updateBook(Books books) {
        return 0;
    }

    @Override
    public Books queryBookById(int id) {
        return null;
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
