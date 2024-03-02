package com.f.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author fzy
 * @date 2024/3/2 13:11
 */
@Configuration
public class MsgConfig {
    @Bean
    public String msg() {
        return "Bean msg...";
    }
}
