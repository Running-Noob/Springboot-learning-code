package com.f.springboot.controller;

import com.f.springboot.pojo.Web;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fzy
 * @date 2024/3/2 13:40
 */
@RestController
@RequestMapping("/web")
public class WebController {
    //@GetMapping
    //public String get() {
    //    System.out.println("get request...");
    //    return "springboot";
    //}

    @GetMapping
    public Web get() {
        System.out.println("get request...");
        return new Web("www.baidu.com", "搜索网址");
    }
}
