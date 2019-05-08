package com.example.demo.stream;

import org.junit.jupiter.api.Test;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * @Author: WangJian
 * @Date: 2018/9/21 16:20
 * 流的创建方式
 */
public class demo01 {

    @Test
    public void test01() {
        List<Integer> list = new <Integer>ArrayList();
//        由Collection直接创建
        List<Integer> collect = list.stream().filter(x -> x > 2).collect(Collectors.toList());
        System.out.println(collect);
        HashMap<String, String> map = new HashMap<>();
        Stream<Map.Entry<String, String>> stream = map.entrySet().stream();
        String[] arr = new String[5];
        //通过数组Arrays.stream静态方法创建
        Stream<String> stream1 = Arrays.stream(arr);
        //Stream.of静态方法
        Stream<String> a = Stream.of("a", "b", "c");
//        生成所有非负偶数流
        Stream.iterate(0, x -> +2);
//        生成无限多项的随机数
        Stream.generate(() -> Math.random());
    }

}
