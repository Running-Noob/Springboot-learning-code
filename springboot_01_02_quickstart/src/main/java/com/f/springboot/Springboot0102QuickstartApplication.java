package com.f.springboot;

import com.f.springboot.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot0102QuickstartApplication {
    public static void main(String[] args) {
        // SpringApplication.run的返回值就是ApplicationContext，就是一个spring容器
        // 所以下面这行代码就是启动了一个spring容器
        ConfigurableApplicationContext context = SpringApplication.run(Springboot0102QuickstartApplication.class, args);
        BookController bookController = context.getBean(BookController.class);
        System.out.println(bookController);
    }
}
