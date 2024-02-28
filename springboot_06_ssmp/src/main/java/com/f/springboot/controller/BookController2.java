package com.f.springboot.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.f.springboot.controller.utils.Result;
import com.f.springboot.pojo.Book;
import com.f.springboot.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author fzy
 * @date 2024/2/28 14:12
 */
@RestController
@RequestMapping("/books")
public class BookController2 {
    @Autowired
    private IBookService bookService;

    // 查所有
    @GetMapping
    public Result getAll() {
        return new Result(true, bookService.list());
    }

    // 根据id查询
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        return new Result(true, bookService.getById(id));
    }

    // 分页查询
    @GetMapping("/{currentPage}/{pageSize}")
    public Result getByPage(@PathVariable Integer currentPage,
                            @PathVariable Integer pageSize) {
        IPage page = new Page(currentPage, pageSize);
        bookService.page(page);
        return new Result(true, page.getRecords());
    }

    @PostMapping
    public Result save(@RequestBody Book book) {
        // Result result = new Result();
        // boolean flag = bookService.save(book);
        // result.setFlag(flag);
        // return result;
        return new Result(bookService.save(book));
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        return new Result(bookService.removeById(id));
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        return new Result(bookService.updateById(book));
    }
}
