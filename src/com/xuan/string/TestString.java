package com.xuan.string;

public class TestString {
    public static void main(String[] args) {
        String s1="core java";
        String s2="Core java";
        System.out.println(s1.charAt(3));
        System.out.println(s2.length());//字符串的长度
        System.out.println(s1.equalsIgnoreCase(s2));//比较两个字符串，忽略大小写
        System.out.println(s1.indexOf("java"));//字符串中是否包含java
        System.out.println(s2.indexOf("apple"));
        String s=s1.replace(' ','&');
    }
}
