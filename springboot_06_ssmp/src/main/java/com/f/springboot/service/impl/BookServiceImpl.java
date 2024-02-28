package com.f.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.f.springboot.mapper.BookMapper;
import com.f.springboot.pojo.Book;
import com.f.springboot.service.IBookService;
import org.springframework.stereotype.Service;

/**
 * @author fzy
 * @date 2024/2/28 10:09
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {
    // 可以根据需要自己再添加业务方法
}