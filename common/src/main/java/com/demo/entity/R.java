package com.demo.entity;

import lombok.Data;

/**
 * @author dings
 * @since 2024/3/7 11:22
 */
@Data
public class R {
    private int code;
    private String msg;
    private Object data;

    public R() {
    }

    public R(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public R(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public R ok(Object data) {
        return new R(200, "success", data);
    }

    public R error(String msg) {
        return new R(-1, msg);
    }
}
