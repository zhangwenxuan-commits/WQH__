package com.xuan.structure;

import java.util.Scanner;

public class IfDemo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入");
        String s=input.nextLine();
        if(s.equals("hello")){
            System.out.println("hi");
        }
        input.close();
    }
}
