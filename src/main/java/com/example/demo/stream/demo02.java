package com.example.demo.stream;


import com.sun.deploy.util.StringUtils;
import org.junit.jupiter.api.Test;


import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: WangJian
 * @Date: 2018/9/22 9:58
 * 中间处理
 */
public class demo02 {

    @Test
    public void test01() {
        Stream<Integer> stream = Stream.of(1, 2, -1, 3, 0, 2, 4, -2);
        stream.filter(x -> x > 0).forEach(System.out::print);
    }

    @Test
    public void test02() {
        Stream<Integer> stream = Stream.iterate(0, x -> x + 2);
        stream.limit(10).forEach(System.out::print);
    }

    @Test
    public void test03() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        stream.skip(3).forEach(x-> System.out.println(x));
        stream.skip(3).forEach(System.out::print);
    }

    @Test
    public void test04() {
        Stream<? extends Serializable> abc = Stream.of("abc", 1, "ab", 1, "dg", "a", "b", 2, "dg");
        List<? extends Serializable> collect = abc.distinct().collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void test05() {
        List<Integer> collect = Stream.of(1, 5, 2, 4, 3, 1, 4, 5, 7, 9, 0, 7, 6, 55, 4, 3).sorted().collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void test06() {
        List<Integer> collect = Stream.of(1, 5, 2, 4, 3, 1, 4, 5, 7, 9, 0, 7, 6, 55, 4, 3).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect);
        String join = StringUtils.join(collect.stream().map(Object::toString).collect(Collectors.toList()), ",");
        System.out.println(join);

    }

    @Test
    public void test07() {
        Stream.of(2,1,4,2,5,6).map(x->String.format("第%d名",x)).forEach(System.out::print);
    }

    @Test
    public void test08() {
    Stream.of("abc","def","ghi").flatMap(x->x.chars().boxed()).forEach(System.out::print);
    }


}
