package com.xuan.array;

import java.util.Arrays;

public class ArrayDemo05 {
    public static void main(String[] args) {
    //冒泡排序：比较数组中相邻的两个元素，如果第二个数比第一个大，交换他们的位置
        // 每次产生一个最大或最小的数字
        int[]a={1,34,35,43,6,32};
        sort(a);
        System.out.println(Arrays.toString(a));

    }
    public static void sort(int[] arr){
        //外层循环，判断多少次排序
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
