package com.f.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fzy
 * @date 2024/2/21 14:30
 */
// Rest模式
@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping
    public String get() {
        System.out.println("Springboot is running...");
        return "springboot";
    }
}