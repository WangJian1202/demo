package com.example.demo.optional;

/**
 * @Author: WangJian
 * @Date: 2018/9/23 13:02
 */
public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
    public CustomException() {
        super("自定义异常");
    }
}
