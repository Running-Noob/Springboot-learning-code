package com.f.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.f.springboot.pojo.Book;
import org.springframework.stereotype.Repository;

/**
 * @author fzy
 * @date 2024/2/27 20:46
 */
@Repository
public interface BookMapper extends BaseMapper<Book> {
    // 可以根据需要自己再添加复杂的sql语句接口，复杂的sql语句写在xml文件中
}
