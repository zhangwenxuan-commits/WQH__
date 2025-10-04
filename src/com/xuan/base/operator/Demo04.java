package com.xuan.operator;

public class Demo04 {
    public static void main(String[] args) {
        int a = 10;
        int c = 10;
        boolean b=(a>20)&&(a++>11);
        System.out.println(b);
        System.out.println(a);
        System.out.println(""+a+c);
        System.out.println(a+c+"");
    }
}
