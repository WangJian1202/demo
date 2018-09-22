package com.example.demo.optional;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Optional;

/**
 * @Author: WangJian
 * @Date: 2018/9/22 22:00
 */
public class demo01 {

    @Test
    public void test01() {
        //会报空指针异常
        try {
            Optional<Object> o = Optional.of(null);
        } catch (Exception e) {
            System.out.println(e);
        }
        //返回一个空的Optional对象
        Optional<Object> empty = Optional.empty();
        //把指定的值封装为Optional对象，如果指定的值为null，则创建一个空的Optional,不管为不为null都不会报错
        Optional<Object> o1 = Optional.ofNullable(null);
        // 如果创建的Optional中有值存在，则返回此值，否则抛NoSuchElementException
        ArrayList<Object> list = new ArrayList<>();
        list.add("2");
        ArrayList<Object> objects = Optional.of(list).get();
        System.out.println(objects);
    }

    @Test
    public void test02() {
        Optional<String> hadoop = Optional.ofNullable("Hadoop");
        String s = hadoop.get();
        System.out.println(s);
    }

    @Test
    public void test03() {

        Optional<String> dogOptional = Optional.of("旺财");
        Optional<Object> empty = Optional.empty();
        System.out.println(dogOptional.orElse("wangcai"));
        System.out.println(empty.orElse("空的"));
    }

    @Test
    public void test04(){

    }
}
