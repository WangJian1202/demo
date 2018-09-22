package com.example.demo.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

/**
 * @Author: WangJian
 * @Date: 2018/9/22 19:53
 * 结束处理
 */
public class demo03 {
    //迭代
    @Test
    public void test01() {
        Stream.of("a", "b", "c").forEach(System.out::print);
    }

    @Test
    public void test02() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 0, -1, -20, -2, -6);
        boolean b = Stream.of(1, 2, 3, 4, 0, -1, -20, -2, -6).allMatch(x -> Math.abs(x) > 10);
        System.out.println(b);
        boolean b1 = stream.noneMatch(x -> x > 100);
        System.out.println(b1);
        //若使用同一个stream会那报错，因为match是结束操作
        Stream<Integer> stream001 = Stream.of(1, 2, 3, 4, 0, -1, -20, -2, -6);
        boolean b2 = stream001.anyMatch(x -> x > 1);
        System.out.println(b2);
    }

    @Test
    public void test03() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 0, -1, -20, -2, -6);
//        System.out.println(stream.findFirst().orElse(0));
//        System.out.println(stream.findAny().filter(x->x>1));
        System.out.println(stream.findAny().get());
    }

    @Test
    public void test04() {

    }

    @Test
    public void test05() {

    }

    @Test
    public void test06() {

    }

    @Test
    public void test07() {

    }
}
