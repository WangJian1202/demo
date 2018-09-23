package com.example.demo.stream;

import com.sun.deploy.util.StringUtils;
import org.junit.jupiter.api.Test;


import java.util.*;
import java.util.stream.Collectors;
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
    /*
    * findFirst查找Stream中的元素，返回Optional类型
    * 通常与filter一起使用，
    * findAny 查找任意一个元素，在并行流(parallelStream)中性能提升比较明显
    * */
    @Test
    public void test03() {
        Stream<Integer> stream = Stream.of(1, -2, -3, -4, 0, -1, -20, -2, -6);
//        System.out.println(stream.findFirst().orElse(0));
        System.out.println(stream.findAny().filter(x->x<=0).orElse(10));
//        System.out.println(stream.findFirst().filter(x->x>2).orElse(10));
    }
//    统计
    @Test
    public void test04() {
        System.out.println(Stream.of(1,2,3,4,-3,-9,0).count());
        System.out.println(Stream.of(1,2,4,0,-3,-5).min(Comparator.comparing(v->v)).orElse(0));
        System.out.println(Stream.of(1,2,4,0,-3,-5).max((v1,v2)->v1.compareTo(v2)).orElse(0));
    }
    /*
    *   归约(reduce)
    *   将Stream中的每一个元素进行指定的叠加处理
    * */
    @Test
    public void test05() {
//        Stream<String> stream = Stream.of("abc", "def", "ghi");
//        System.out.println(stream.reduce("",String::concat));
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 10, 6);
        System.out.println(integerStream.reduce(000,Integer::compare));
        int compare = Integer.compare(5, 6);
        System.out.println(compare);
    }
    /*
    * 收集(collect)
    * "1,2,3,4,5,7"
    * */
    @Test
    public void test06() {
//        收集List,Set等Collection类型
        List<String> collect = Stream.of("abc", "def", "ghi").collect(Collectors.toList());
        Set<String> collect1 = Stream.of("abc", "def", "ghi").collect(Collectors.toSet());
        LinkedList<String> collect2 = Stream.of("abc", "def", "ghi").collect(Collectors.toCollection(LinkedList::new));
    }

    @Test
    public void test07(){

    }

















    @Test
    public void demo() {
    String str ="";
    int sum =0;
        for (int i = 1; i <=10 ; i++) {
            if(i==1){
                str+=i+"+";
                continue;
            }
            for (int j = 1; j <=i ; j++) {
                sum+=j;
                if(j!=10){
                    if(j==1){
                       str+="(";
                    }
                    if(j==i){
                        str+=j+")"+"+";
                        continue;
                    }
                    str+=j+"+";
                }else{
                    str+=j+")"+"=";
                }
            }
        }
        System.out.println(str+sum);
    }
}
