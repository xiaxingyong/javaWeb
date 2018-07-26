package com.example.demo.enums;

public enum ResultEnum {
    TYPEA(-1,"系统错误"),
    SUCCESS(0,"执行成功"),
    MIDDLESCHOOL(1,"error1"),;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
