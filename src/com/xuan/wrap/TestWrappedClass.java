package com.xuan.wrap;
//测试包装类 Integer类的使用
public class TestWrappedClass {
    public static void main(String[] args) {
       //基本数据类型转为包装类对象
        Integer arr=new Integer(3);
        Integer b=Integer.valueOf(30);
      //包装类对象转为基本数据类型
        int c=b.intValue();
        double d=b.doubleValue();
        //把字符串转成包装类对象
        Integer e=new Integer("9999");
        Integer f=Integer.parseInt("9999");
        //把包装类对象转成字符串
        String str=f.toString();

    }
}
