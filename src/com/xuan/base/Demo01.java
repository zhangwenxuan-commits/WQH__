package com.xuan.base;

public class Demo01 {
    public static void main(String[] args) {
        int i=128;
        byte b=(byte)i;//内存溢出
        double c=i;
        //强制转换（类型）变量名 高到低
        System.out.println(i);
        System.out.println(b);
        System.out.println(c);
        /*
        不能对布尔值进行转换
        不能把对象类型转换为不相干的类型
        在把高容量转换到低容量时，强制转换
        转换时可能存在内存溢出或精度问题
        */
        System.out.println("=============");
        System.out.println((int)23.7);
        System.out.println((int)-45.89f);
        System.out.println("=============");
        char d='a';
        int e=d+1;
        System.out.println((char)e);
    }
}
