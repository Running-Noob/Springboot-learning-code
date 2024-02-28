package com.f.springboot.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.f.springboot.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author fzy
 * @date 2024/2/27 20:50
 */
@SpringBootTest
public class BookMapperTest {
    @Autowired
    private BookMapper bookMapper;

    @Test
    public void testGetById() {
        Book book = bookMapper.selectById(1);
        System.out.println(book);
    }

    @Test
    public void testGetAll() {
        List<Book> books = bookMapper.selectList(null);
        books.forEach(book -> {
            System.out.println(book);
        });
    }

    @Test
    public void testInsert() {
        Book book = new Book();
        book.setType("测试");
        book.setName("测试");
        book.setDescription("测试");
        bookMapper.insert(book);
    }

    @Test
    public void testDeleteById() {
        bookMapper.deleteById(1);
    }

    @Test
    public void testUpdate() {
        Book book = new Book();
        book.setId(2);
        book.setType("测试");
        book.setName("测试");
        book.setDescription("测试");
        bookMapper.updateById(book);
    }

    @Test
    public void testGetPage() {
        IPage page = new Page(
                // 第几页的数据
                2,
                // 这一页有几条数据
                5);
        bookMapper.selectPage(page, null);
    }

    @Test
    public void testGetByCondition() {
        QueryWrapper<Book> wrapper = new QueryWrapper<>();
        // 按条件查询，在wrapper中给定条件
        // 查询那些name列中含有Spring的数据
        String name = "Spring";
        wrapper.like(name != null, "name", name); // 只有当"name != null"时才会带上这个条件
        List<Book> books = bookMapper.selectList(wrapper);
        books.forEach(book -> {
            System.out.println(book);
        });
    }
}