package com.xuan.structure;

public class DoWhileDemo01 {
    public static void main(String[] args) {
        int a=0;
        int sum=0;
        do{sum+=a;
            a++;
        }
        while(a<=100);
        System.out.println("sum="+sum);
    }
}
