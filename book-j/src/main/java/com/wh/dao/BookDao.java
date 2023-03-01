package com.wh.dao;

import com.wh.model.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

/**
 * @author Wang Hao
 * @since 2023/2/26 23:28
 */
@Mapper
public interface BookDao {
    @Select("select * from book")
    ArrayList<Book> findAll();
}
