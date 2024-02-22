package com.f.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.f.springboot.mapper")
public class Springboot04MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot04MybatisApplication.class, args);
    }

}
