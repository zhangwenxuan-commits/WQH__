package com.xuan.operator;

public class Demo03 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d=c%b;
        System.out.println(a>b);
        System.out.println(d);
        int e=a++;//先赋值，再自增
        int f=++a;//先自增，再幅值
        System.out.println(e);
        System.out.println(f);
        final double pow = Math.pow(2, 3);
        System.out.println(pow);
    }
}
