package com.xuan.structure;
//画一个三角形
public class TestDemo01 {
    public static void main(String[] args) {
        int a=5;
        for (int i = 1; i <=5; i++) {
           for(int n=1;n<=9;n++){
              if(n<=(a-i)){System.out.print(" ");}
              else if(n<(a+i)&&n>(a-i)){System.out.print("*");}
              else {System.out.print("\t");}
           }
           System.out.println();

        }
    }
}
