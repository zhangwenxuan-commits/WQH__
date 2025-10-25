package com.xuan.date;

import java.util.Date;
//测试date类的常见用法
/*@author zwx
* */
public class TestDate01 {
    public static void main(String[] args) {
        Date date=new Date(2000);
        System.out.println(date);
        System.out.println(date.getTime());
        Date date1=new Date();
        System.out.println(date1.getTime());
        System.out.println(date1.after(date));
    }
}
