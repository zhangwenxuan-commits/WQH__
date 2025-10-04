package com.xuan.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        //从键盘接收数据
        Scanner input = new Scanner(System.in);
        System.out.println("请输入");
        String str=input.nextLine();
        System.out.println("输出的内容为："+str);
        input.close();
    }

}
