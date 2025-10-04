package com.xuan.structure;

import java.util.Scanner;

public class BreakDemo {
    public static void main(String[] args) {
        int n=1;
        while(n<=100){
            n++;
            System.out.println(n);
            if(n==15){break;}
        }
    }
}
