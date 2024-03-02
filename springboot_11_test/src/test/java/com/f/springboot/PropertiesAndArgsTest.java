package com.f.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author fzy
 * @date 2024/3/2 12:51
 */
// properties属性可以为当前测试用例添加临时的属性配置
//@SpringBootTest(properties = {"test.prop=testValue_properties"})
// args属性可以为当前测试用例添加临时的命令行参数
//@SpringBootTest(args = {"--test.prop=testValue_args"})
@SpringBootTest(properties = {"test.prop=testValue_properties"}, args = {"--test.prop=testValue_args"})
public class PropertiesAndArgsTest {
    @Value("${test.prop}")
    private String msg;

    @Test
    public void testPropertiesAndArgs() {
        System.out.println(msg);
    }
}