package com.f.springboot.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.f.springboot.pojo.Book;
import com.f.springboot.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author fzy
 * @date 2024/2/28 10:32
 */
//@RestController
//@RequestMapping("/books")
public class BookController {
    //@Autowired
    private IBookService bookService;

    // 查所有
    @GetMapping
    public List<Book> getAll() {
        return bookService.list();
    }

    // 根据id查询
    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id) {
        return bookService.getById(id);
    }

    // 分页查询
    @GetMapping("/{currentPage}/{pageSize}")
    public List<Book> getByPage(@PathVariable Integer currentPage,
                                @PathVariable Integer pageSize) {
        IPage page = new Page(currentPage, pageSize);
        bookService.page(page);
        return page.getRecords();
    }

    @PostMapping
    public Boolean save(@RequestBody Book book) {
        return bookService.save(book);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id) {
        return bookService.removeById(id);
    }

    @PutMapping
    public Boolean update(@RequestBody Book book) {
        return bookService.updateById(book);
    }
}