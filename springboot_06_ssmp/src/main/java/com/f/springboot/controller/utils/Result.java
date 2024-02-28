package com.f.springboot.controller.utils;

import lombok.Data;

/**
 * @author fzy
 * @date 2024/2/28 14:09
 */
@Data
public class Result {
    private Boolean flag;   // 表示操作是否成功
    private Object data;    // 后端返回的数据

    public Result() {
    }

    public Result(Boolean flag) {
        this.flag = flag;
    }

    public Result(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }
}
