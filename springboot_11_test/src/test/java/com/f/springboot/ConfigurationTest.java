package com.f.springboot;

import com.f.springboot.config.MsgConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

/**
 * @author fzy
 * @date 2024/3/2 13:12
 */
@SpringBootTest
// 使用@Import注解加载测试专用配置
@Import({MsgConfig.class})
public class ConfigurationTest {
    @Autowired
    private String msg;

    @Test
    public void testConfiguration() {
        System.out.println(msg);
    }
}
