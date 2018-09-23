package com.example.demo.comparator;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: WangJian
 * @Date: 2018/9/23 18:38
 * Comparable 接口:
 * 该接口对实现它的类的对象加强了排序规则,该规则称之为自然排序(natural ordering)
 * 方法public int compare(T t)是自然排序的方法
 * Comparator  接口 通过比较两个入参得到顺序
 * 1 入参一大于入参二
 * 0 入参相等
 * -1入参一小于入参二
 *
 * 1、comparator 是比较器，可以直接执行。采用了策略模式，一个实体对象根据需要设计可以设计多个比较器。隔离性好，方便。
 * 2、comparable 通过比较实体对象来调用的。但是一个实体只能实现一个接口，所以扩展性不是很好，跟类绑定了。
 *
 */
public class demo01 {
    @Test
    public void test01() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("abc");
        list.add("ABD");
//      Collections.sort(list);
        Collections.sort(list,(x,y)->x.compareTo(y));
        list.forEach(System.out::print);
//      list.stream().sorted().collect(Collectors.toList()).forEach(System.out::print);

    }

}
