package com.oop.demo02;

public class test {
    {
        System.out.println("匿名代码块");
    }
    static{
        System.out.println("静态代码块");
    }

    public test() {
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        test test1=new test();
        System.out.println("\n");
        test test2=new test();
    }
}
