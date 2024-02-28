package com.f.springboot.pojo;

import lombok.*;

/**
 * @author fzy
 * @date 2024/2/27 20:30
 */
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}