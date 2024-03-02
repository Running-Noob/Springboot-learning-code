package com.f.springboot.pojo;

import lombok.Data;

/**
 * @author fzy
 * @date 2024/3/2 14:58
 */
@Data
public class Web {
    private String domain;
    private String content;

    public Web(String domain, String content) {
        this.domain = domain;
        this.content = content;
    }
}
