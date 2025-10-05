package com.xuan.methods;

public class Demo01 {
    public static void main(String[] args) {
        int sum = add(2, 4);
        System.out.println(sum);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double b, double a){
            return (int) (a + b);
    }
}
