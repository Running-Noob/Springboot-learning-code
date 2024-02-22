package com.f.springboot;

import com.f.springboot.mapper.BookMapper;
import com.f.springboot.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot04MybatisApplicationTests {
    @Autowired
    private BookMapper bookMapper;

    @Test
    void contextLoads() {
        Book book = bookMapper.getById(1);
        System.out.println(book);
    }

}
