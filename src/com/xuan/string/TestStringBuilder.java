package com.xuan.string;

public class TestStringBuilder {
    public static void main(String[] args) {
        String str;
        //StringBuilder线程不安全效率高；StringBuffer线程安全，效率低。
        StringBuilder sb=new StringBuilder("ahfkjf");
        System.out.println(Integer.toHexString(sb.hashCode()));
        System.out.println(sb);
        sb.setCharAt(2,'m');
        System.out.println(Integer.toHexString(sb.hashCode()));
        System.out.println(sb);
    }
}
