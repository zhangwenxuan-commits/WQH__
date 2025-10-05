package com.xuan.array;

public class ArrayDemo01 {

    public static void main(String[] args) {
    int[] nums;//声明数组
    nums=new int[10];//创建数组，预留空间
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        nums[3]=4;
        nums[4]=5;
        nums[5]=6;
        nums[6]=7;
        nums[7]=8;
        //nums[8]=9;
        nums[9]=10;
        System.out.println(nums[8]);
        System.out.println(nums.length);
    }
}
