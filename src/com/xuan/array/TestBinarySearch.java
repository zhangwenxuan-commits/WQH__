package com.xuan.array;

import java.util.Arrays;

//二分法查找
public class TestBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,24,3,4,645,6,7,8,25,132};
        Arrays.sort(arr);
        int value=8;
        System.out.println(Arrays.toString(arr));
        System.out.println(mybinarySearch(arr,8));

    }
    public static int mybinarySearch(int[] arr,int value){
        int lower=0;
        int high=arr.length-1;
        while(lower<=high){
            int mid=(lower+high)/2;
            if(arr[mid]==value){
                return mid;
            }
            if(arr[mid]>value){

                high=mid-1;
            }
            if(arr[mid]<value){
                lower=mid+1;
            }
        }return -1;
    }
}
