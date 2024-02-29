package com.f.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author fzy
 * @date 2024/2/21 15:30
 */
@RestController
@RequestMapping("/books")
@Slf4j
public class BookController {
    // 1.使用@Slf4j创建记录日志对象
    //private static final Logger log = LoggerFactory.getLogger(BookController.class);

    @GetMapping
    public String get() {
        // 2.手工记录日志
        log.trace("trace...");
        log.debug("debug...");
        log.info("info...");
        log.warn("warn...");
        log.error("error...");
        return "springboot2...";
    }
}