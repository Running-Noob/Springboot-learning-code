package com.f.springboot.dao.impl;

import com.f.springboot.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author fzy
 * @date 2024/2/22 16:22
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("正在保存图书信息...");
    }
}
