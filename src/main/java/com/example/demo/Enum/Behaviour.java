package com.example.demo.Enum;

/**
 * @Author: WangJian
 * @Date: 2018/10/12 10:55
 * 用法5 实现接口
 * 所有枚举都继承自java.lang.Enum类，Java不支持多继承
 */
public interface Behaviour {
    void print();
    String getInfo();
}
