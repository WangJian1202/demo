package com.example.demo.Enum;

/**
 * @Author: WangJian
 * @Date: 2018/10/12 10:41
 * 用法二 switch
 */
public class TrafficLight {
    Signal color=Signal.RED;
    public void change(){
        switch (color){
            case RED:
                color =Signal.GREEN;
                break;
            case YELLOW:
                color=Signal.RED;
                break;
            case GREEN:
                color=Signal.YELLOW;
                break;
        }
    }
}
