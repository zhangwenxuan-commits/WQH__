package com.xuan.array;

import java.util.Arrays;

public class TestArrayCopy1 {
    public static void main(String[] args) {
        String []s1={"abc","a","b","c"};
        String []s2=new String[10];
        System.arraycopy(s1,0,s2,3,4);
        System.out.println(Arrays.toString(s2));
        removeElment(s1,2);
    }
    //测试从数组中删除某个元素还是数组的拷贝
    public static String [] removeElment(String [] s,int index){
        System.arraycopy(s,index+1,s,index,s.length-index-1);
        s[s.length-1]=null;
        System.out.println(Arrays.toString(s));
        return s;
    }
    //数组的扩容本质上是先定义一个更大的数组，然后将原数组原封不动拷贝到新数组中
    public static void extendRange(){
        String[]s1={"abc","a","b","c"};
        String[]s2=new String[s1.length+4];
        System.arraycopy(s1,0,s2,0,s1.length);
        System.out.println(Arrays.toString(s2));
    }
}
