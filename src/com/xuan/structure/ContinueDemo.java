package com.xuan.structure;

public class ContinueDemo {
    public static void main(String[] args) {
        int a=10;
        while(a<100){
            a++;
            if(a==50){
                continue;
            }
            System.out.println(a);//没有输出50
        }
    }
}
