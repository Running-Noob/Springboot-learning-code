package com.f.springboot.mapper;

import com.f.springboot.pojo.Book;
import org.springframework.stereotype.Repository;

/**
 * @author fzy
 * @date 2024/2/22 21:43
 */
@Repository
public interface BookMapper {
    // 根据id查询图书信息
    Book getById(Integer id);
}