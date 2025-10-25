package com.xuan.string;

public class TestString3 {
    public static void main(String[] args) {
        String str1="Hello" +"World";
        String str2="HelloWorld";
        System.out.println(str1==str2);
        String str3="Hello";
        String str4="World";
        String str5=str3+str4;
        System.out.println(str5==str2);//使用equals而不是==
    }
}
