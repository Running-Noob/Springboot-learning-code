package com.f.springboot;

import com.f.springboot.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// 通过classes属性指定要测试的springboot启动类
@SpringBootTest(classes = Springboot03JunitApplication.class)
class Springboot03JunitApplicationTests {
    // 1.注入要测试的对象
    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        // 2.执行要测试的对象的对应方法
        bookDao.save();
    }
}