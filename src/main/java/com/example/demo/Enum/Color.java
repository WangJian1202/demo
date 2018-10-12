package com.example.demo.Enum;

/**
 * @Author: WangJian
 * @Date: 2018/10/12 10:46
 * 用法3:向枚举中添加新方法;
 * 用法4:覆盖枚举的方法
 */
public enum Color {
    RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);
    private String name;
    private int index;

    private  Color(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return this.index+"_"+this.name;
    }
}
