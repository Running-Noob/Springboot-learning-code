package com.f.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fzy
 * @date 2024/2/21 22:11
 */
@RestController
@RequestMapping("/books")
public class BookController {
    // 读取单一属性
    // string: HelloWorld
    @Value("${string}")
    private String str;

    /**
     * 读取属性的属性
     * enterprise:
     *   name: itcast
     *   age: 16
     *   subject:
     *     - Java
     *     - 前端
     *     - 大数据
     */
    @Value("${enterprise.name}")
    private String enterpriseName;

    /**
     * 读取数组数据
     * likes2:
     *   - sing
     *   - dance
     */
    @Value("${likes2[0]}")
    private String like;

    @Value("${center.dataDir}")
    private String dir;

    // 使用自动装配将所有的数据封装到一个Environment对象中
    @Autowired
    private Environment env;

    @GetMapping
    public String get() {
        return "springboot...";
    }

    // 读取yaml数据中的单一数据
    @GetMapping("/yaml/single")
    public String getYamlSingle() {
        return str + "<br/>" + enterpriseName + "<br/>" + like + "<br/>" + dir;
    }

    // 读取yaml数据中的所有数据
    @GetMapping("/yaml/all")
    public String getYamlAll() {
        // 使用getProperty方法获取数据
        return env.getProperty("enterprise.name");
    }
}
