package com.xuan.array;

public class ArrayDemo03 {
    public static void main(String[] args) {
        int [] array= {1,2,3,4,5};
        //打印全部数组元素
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        //计算所有元素和
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        System.out.println(sum);
        //查找最大元素
        int max=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);
    }
}
