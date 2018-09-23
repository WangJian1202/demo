package com.example.demo.optional;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Optional;

/**
 * @Author: WangJian
 * @Date: 2018/9/22 22:00
 * Optional 常用Api
 * https://blog.csdn.net/zknxx/article/details/78586799
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
//    如果创建的Optional中的值存在返回此值，如果不存在，抛NoSuchelementException
    @Test
    public void test02() {
        Optional<String> hadoop = Optional.ofNullable("Hadoop");
        String s = hadoop.get();
        System.out.println(s);
    }
//    orElse 如果创建的Optional值存在，返回此值，否则返回一个默认的值
    @Test
    public void test03() {
        Optional<String> dogOptional = Optional.of("旺财");
        Optional<Object> empty = Optional.empty();
        System.out.println(dogOptional.orElse("wangcai"));
        System.out.println(empty.orElse("空的"));
    }
//    orElseGet,如果Optional中的值存在，返回此值，否则返回一个由Supplier接口生成的值
    @Test
    public void test04(){
        Optional<String> laifu = Optional.of("来福");
        System.out.println(laifu.orElseGet(()->"orElseGet"));
        Optional<Object> empty = Optional.empty();
        System.out.println(empty.orElseGet(()->"orElseGet"));
    }
//    orElsethrow 如果创建的Optional的值存在，返回此值，抛一个由指定Supplier接口生成的异常
    @Test
    public void test05(){
        Optional<String> myun = Optional.of("马云");
        System.out.println(myun.orElseThrow(CustomException::new));
        Optional<Object> empty = Optional.empty();
        System.out.println(empty.orElseThrow(CustomException::new));
    }
//    如果创建的Optional中的值满足filter中的条件，则返回包含该值得Optional对象，否则返回一个空的Optional对象
    @Test
    public void test06(){
        Optional<String> zhangsan = Optional.of("zhangsan");
        System.out.println(zhangsan.filter(e->e.length()>5).orElse("王五"));
        zhangsan = Optional.empty();
        System.out.println(zhangsan.filter(x->x.length()>5).orElse("lisi"));
    }
//    如果创建的map值存在，对该值执行Function函数调用
    @Test
    public void test07(){
        Optional<String> zhangsan = Optional.of("zhangsan");
        System.out.println(zhangsan.map(String :: toUpperCase).orElse("失败"));
        zhangsan = Optional.empty();
        System.out.println(zhangsan.map(e -> e.toUpperCase()).orElse("失败"));
    }
    /*
    *   map方法中的lambda表达式返回值可以使任意类型，在map函数返回之前包装为Optional
    *   但，flatMap方法中的lambda表达式返回值必须是Optional实例
    * */
    @Test
    public void test08(){
        Optional<String> zhangsan = Optional.of("zhangsan");
        System.out.println(zhangsan.flatMap(e->Optional.of("lisi")).orElse("失败"));
        zhangsan = Optional.empty();
        System.out.println(zhangsan.flatMap(e->Optional.empty()).orElse("失败"));
    }
    @Test
    public void test09(){
        Optional<String> zhangsan = Optional.of("zhangsan");
        zhangsan.ifPresent(e-> System.out.println("被处理:"+e));
    }

}
