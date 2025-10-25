package com.xuan.string;

public class TestStringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            char temp=(char)(i+'a');
            sb.append(temp);
        }
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.setCharAt(3,'高');
        System.out.println(sb);
        sb.insert(0,'我').insert(6,'爱');//链式调用，该方法使用return this返回了自己
        System.out.println(sb);
        sb.delete(20,23).delete(20,23);
        System.out.println(sb);
    }
}
