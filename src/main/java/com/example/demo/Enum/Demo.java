package com.example.demo.Enum;

import org.junit.jupiter.api.Test;

/**
 * @Author: WangJian
 * @Date: 2018/10/12 11:01
 */
public class Demo {
    @Test
    public void test01(){
        System.out.println(Food.Coffee.BLACK_COFFEE);
    }

    @Test
    public void test02(){
        int targetCode=10000;
        CommonRetCodeEnum[] values = CommonRetCodeEnum.values();
        for (CommonRetCodeEnum e:values) {
            if (e.getErrorCode()==targetCode){
                System.out.println(e.getErrorMsg());
            }
        }
        CommonRetCodeEnum.BANK_DISABLE.getErrorMsg();
    }

}
