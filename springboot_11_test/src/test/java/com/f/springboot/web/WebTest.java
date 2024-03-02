package com.f.springboot.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.ContentResultMatchers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

/**
 * @author fzy
 * @date 2024/3/2 13:23
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
// 1.开启虚拟mvc调用
@AutoConfigureMockMvc
public class WebTest {
    // 2.虚拟调用对象
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void tesRandomPort() {
    }

    @Test
    public void testWeb() throws Exception {
        // 3.创建RequestBuilder对象，用于发送虚拟请求(GET)
        RequestBuilder builder = MockMvcRequestBuilders.get("/web");
        //RequestBuilder builder = MockMvcRequestBuilders.post("/web");
        //RequestBuilder builder = MockMvcRequestBuilders.put("/web");
        //RequestBuilder builder = MockMvcRequestBuilders.delete("/web");
        // 4.虚拟调用对象执行虚拟请求
        mockMvc.perform(builder);
    }

    @Test
    public void testStatus() throws Exception {
        RequestBuilder builder = MockMvcRequestBuilders.get("/web");
        ResultActions action = mockMvc.perform(builder);
        // 判断测试是否通过：
        //      设定预期值，与测试值进行比较，相等则测试通过，否则测试失败
        // 定义执行状态匹配器
        StatusResultMatchers status = MockMvcResultMatchers.status();
        // 定义预期执行状态，这里定义为成功响应
        ResultMatcher ok = status.isOk();
        // 添加预计值到本次调用过程中，进行匹配
        action.andExpect(ok);
    }

    @Test
    public void testBody() throws Exception {
        RequestBuilder builder = MockMvcRequestBuilders.get("/web");
        ResultActions action = mockMvc.perform(builder);
        // 定义执行结果匹配器
        ContentResultMatchers content = MockMvcResultMatchers.content();
        // 定义预期执行结果
        ResultMatcher result = content.string("springboot");
        // 添加预计值到本次调用过程中，进行匹配
        action.andExpect(result);
    }

    @Test
    public void testJsonBody() throws Exception {
        RequestBuilder builder = MockMvcRequestBuilders.get("/web");
        ResultActions action = mockMvc.perform(builder);
        // 定义执行结果匹配器
        ContentResultMatchers content = MockMvcResultMatchers.content();
        // 定义预期执行结果（json格式）
        String jsonBody = "{\n" +
                "    \"domain\": \"www.baidu.com\",\n" +
                "    \"content\": \"搜索网址\"\n" +
                "}";
        ResultMatcher result = content.json(jsonBody);
        // 添加预计值到本次调用过程中，进行匹配
        action.andExpect(result);
    }
}
