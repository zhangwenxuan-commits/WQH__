package com.xuan.base;

public class Demo02 {
    //属性：变量
    //类变量 static
    static double salary=2500;
    //常量 (修饰符不区分先后)
    static final double PI=3.14;
    //实例变量，从属于对象，如不初始化，输出对应默认值(0  0.0 null false)
    String name;
    public static void main(String[] args) {
        String name = "zwx";
        Demo02 demo = new Demo02();
        System.out.println(demo.name);
        //局部变量name

    }
    //其他方法
}
