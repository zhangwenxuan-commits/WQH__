package com.xuan.scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        //可以输入多个数字，求其总和与平均数，每输入一个数字用回车确认，通过输入非数字来结束输入并输出执行结果：
        Scanner input = new Scanner(System.in);
        //和
        double sum=0;
        //计算输入了多少个数字
        int m=0;
        //循环判断是否还有输入，并在里面对每一次进行求和统计
        while(input.hasNextDouble()){
            double x=input.nextDouble();
            m++;
            sum=sum+x;
        }
        System.out.println(m+"个数的和为"+sum);
        System.out.println(m+"个数的平均数为"+sum/m);
        input.close();
    }
}
