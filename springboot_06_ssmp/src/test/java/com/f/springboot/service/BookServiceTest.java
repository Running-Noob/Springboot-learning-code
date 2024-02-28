package com.f.springboot.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.f.springboot.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author fzy
 * @date 2024/2/28 9:41
 */
@SpringBootTest
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    public void testGetById() {
        Book book = bookService.getById(2);
        System.out.println(book);
    }

    @Test
    public void testGetAll() {
        List<Book> books = bookService.getAll();
        books.forEach(book -> {
            System.out.println(book);
        });
    }

    @Test
    public void testSave() {
        Book book = new Book();
        book.setType("测试");
        book.setName("测试");
        book.setDescription("测试");
        bookService.save(book);
    }

    @Test
    public void testDeleteById() {
        bookService.delete(1);
    }

    @Test
    public void testUpdate() {
        Book book = new Book();
        book.setId(2);
        book.setType("测试");
        book.setName("测试");
        book.setDescription("测试");
        bookService.update(book);
    }

    @Test
    public void testGetPage() {
        IPage<Book> page = bookService.getPage(2, 5);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println(page.getRecords());
    }
}
