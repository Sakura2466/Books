package com.wh.service;

import com.wh.dao.BookDao;
import com.wh.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author Wang Hao
 * @since 2023/2/26 23:38
 */
@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public ArrayList<Book> findAll(){
        return bookDao.findAll();
    }
}
