package com.wh.controller;

import com.wh.model.Book;
import com.wh.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Wang Hao
 * @since 2023/2/26 23:41
 */
@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("all")
    public ArrayList<Book> findAll(){
       return bookService.findAll();
    }

}
