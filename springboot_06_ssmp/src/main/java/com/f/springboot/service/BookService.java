package com.f.springboot.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.f.springboot.pojo.Book;

import java.util.List;

/**
 * @author fzy
 * @date 2024/2/27 22:25
 */
public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getAll();
    IPage<Book> getPage(Integer currentPage, Integer pageSize);
}
