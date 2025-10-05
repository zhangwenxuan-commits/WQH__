package com.xuan.methods;

public class Demo04 {
    public static void main(String[] args) {
    System.out.println(f(6));
    }
    public static int f(int n) {
        if (n == 0) return 0;
        if (n == 1) {
            return 1;
        } else  return f(n-1)*n;
    }
}
