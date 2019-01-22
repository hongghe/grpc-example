package com.hongghe.server.domain;

/**
 * @author: hongghe @date: 2019-01-22 16:36
 */
public enum  ResultConstant {

    ERROR(-1, "ERROR"),
    SUCCESS(1, "SUCCESS");

    private Integer code;
    private String message;

    ResultConstant(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
