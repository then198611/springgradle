package com.h.user.model.wrapper;

/**
 * Created by huangshuaihui on 16/9/14.
 */
public class BaseWrapper<T> {
    private int code;
    private String message;
    private T data;

    public BaseWrapper() {
    }

    public BaseWrapper(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public BaseWrapper(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
