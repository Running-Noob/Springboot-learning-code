package com.f.springboot.controller;

import com.f.springboot.pojo.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fzy
 * @date 2024/2/22 15:53
 */
@RestController
@RequestMapping("/yaml")
public class YamlController {
    // 4. 使用@Autowired自动装配
    @Autowired
    private DataSource dataSource;

    @GetMapping("/datasource")
    public DataSource getDataSource() {
        return dataSource;
    }
}
