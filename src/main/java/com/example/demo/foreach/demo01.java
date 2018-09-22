package com.example.demo.foreach;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * @Author: WangJian
 * @Date: 2018/9/22 10:56
 */
public class demo01 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
      list.forEach(System.out:: print);

    }
}
