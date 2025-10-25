package com.xuan.string;

public class TestStringBuilder3 {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("");//循环累加字符串，必须使用StringBuilder
        long num1=Runtime.getRuntime().freeMemory();//获取系统的剩余内存
        long time1=System.currentTimeMillis();//获取系统的当前时间
        for(int i=0;i<5000;i++){
            sb.append(i);
        }
    }
}
