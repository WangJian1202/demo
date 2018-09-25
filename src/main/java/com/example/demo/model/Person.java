package com.example.demo.model;

/**
 * @Author: WangJian
 * @Date: 2018/9/25 10:19
 */
public class Person {

    String name;
    Integer type;

    public Person(String name, Integer type) {
        this.name = name;
        this.type = type;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
