package com.example.demo.lambda;

import org.junit.jupiter.api.Test;

/**
 * @Author: WangJian
 * @Date: 2018/9/22 10:16
 */
public class demo01 {

    public static void main(String[] args) {
        FunctionInterface t1 = new FunctionInterface() {
            @Override
            public void test() {
                System.out.println("匿名内部类，实现函数式接口");
            }
        };
        t1.test();
    }


    @Test
    public void test01() {
        FunctionInterface t2 = () -> {
            System.out.println("Lambda 表达式不带参数");
        };
        t2.test();
    }


    @Test
    public void test03() {
        FunctionInterface t3 = () -> System.out.println("代码只有一行，省略大括号{}的lambda表达式");
        t3.test();
    }

    @Test
    public void test04() {
        FunctionInterface01 t1 = (x) -> System.out.println("Lambda 表达式带一个参数:" + x);
        t1.test(10);
    }

    @Test
    public void test05() {
        FunctionInterface01 t2 = x -> System.out.println("Lambda 表达式只带一个参数:" + x + "省略()");
        t2.test(1000);
    }

    @Test
    public void test06() {
        FunctionInterface02 t1 = (a, b) -> System.out.println("a+b=" + (a + b));
        t1.test(2, 3);
    }
//    有返回值
    @Test
    public void test07() {
        FunctionInterface03 t1 = (x, y) -> {
            return x + y;
        };
        int test = t1.test(10, 20);
        System.out.println(test);

    }
//    有参数,除了return只有一句话可省略{}
    @Test
    public void test08() {
    FunctionInterface03 t1 =(x,y)->x*y;
        int test = t1.test(2, 3);
        System.out.println(test);
    }

    @Test
    public void test09() {
//    Interface t1 =x-> System.out.println(x);
//        不能使用lambda表达式，因为不是函数式接口
    }



}
