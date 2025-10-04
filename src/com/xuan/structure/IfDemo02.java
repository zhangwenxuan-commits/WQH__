package com.xuan.structure;

import java.util.Scanner;

public class IfDemo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入成绩");
        int score=input.nextInt();
        if(score==100){
            System.out.println("满分");
        }else if(score<100&&score>90){
            System.out.println("优秀");
        }else if(score<=90&&score>60){
            System.out.println("良好");
        }else if(score<=60&&score>=0){
            System.out.println("不及格");
        }else {
            System.out.println("重新输入");
        }
        input.close();
    }
}
