package com.xuan.methods;

public class Demo03 {
    public static void main(String[] args) {
       Demo03 demo03 = new Demo03();
       demo03.test(1);
       printMax(1,24,5,34,5547,345);
    }
    public static void test(int...i) {
        System.out.println(i[0]);
    }
    public static void printMax(int...a) {
        if (a.length == 0) {
            return;
        }
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }System.out.println(max);
    }
}
