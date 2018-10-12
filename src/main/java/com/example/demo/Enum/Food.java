package com.example.demo.Enum;

/**
 * @Author: WangJian
 * @Date: 2018/10/12 11:00
 * 用法6 使用接口组织枚举
 */
public interface Food {
    enum Coffee implements Food{
        BLACK_COFFEE,DECAF_COFFEE,LATTE,CAPPUCCINO
    }

    enum Dessert implements Food{
         FRUIT, CAKE, GELATO
    }
}
