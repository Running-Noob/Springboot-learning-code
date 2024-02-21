package com.f.springboot.controller;

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
    @GetMapping
    public String get() {
        return "springboot...";
    }
}
