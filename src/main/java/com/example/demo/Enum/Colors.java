package com.example.demo.Enum;

/**
 * @Author: WangJian
 * @Date: 2018/10/12 10:57
 */
public enum Colors implements Behaviour {

    RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);

    private String name;
    private int index;

    private  Colors(String name, int index) {
        this.name = name;
        this.index = index;
    }

    @Override
    public void print() {
        System.out.println(this.index+":"+this.name);
    }

    @Override
    public String getInfo() {
        return this.name;
    }
}
