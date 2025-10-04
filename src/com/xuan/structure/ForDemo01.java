package com.xuan.structure;

public class ForDemo01 {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        for (int a=1;a<=100;a+=2){
            x=x+a;
            y=y+a;
            y=y+1;

        }
        System.out.println("0到100奇数和为"+x);
        System.out.println("0到100偶数和为"+y);
        for(int b=15;b<=1000;b+=15){
            x=b-10;
            y=b-5;
                System.out.print(x+"\t"+y+"\t"+b+"\t");
                System.out.print("\n");


            }
        for(int m=1;m<=9;m++){
            for(int n=1;n<=9;n++){
                if(n<=m){
                    System.out.print(m+"*"+n+"="+m*n+"\t");
                }
                if(n==m){
                    System.out.print("\n");
                }
            }
        }
        }
    }


