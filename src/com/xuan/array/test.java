package com.xuan.array;

public class test {
    public static void main(String[] args) {
        //创建一个二维数组11*11 0；没有棋子，1：黑棋 2：白棋
        int[][]a=new int[11][11];
        a[1][2]=1;
        a[2][3]=1;
        a[6][4]=2;
        for(int j=0;j<a.length;j++){
            for(int k=0;k<a[j].length;k++){
                System.out.print(a[j][k]+"\t");
            }System.out.println();
        }
        //转化为稀疏数组保存
        int sum=0;
        int[] a1=new int[121];
        int[] a2=new int[121];
        int[] a3=new int[121];
        for(int j=0;j<a.length;j++){
            for(int k=0;k<a[j].length;k++){
                if(a[j][k]!=0){
                    sum++;
                    a1[sum]=j+1;
                    a2[sum]=k+1;
                    a3[sum]=a[j][k];
                }
            }
        }
        int[][]b=new int[3][sum];
        for(int m=0;m<sum;m++){
            b[m][0]=a1[m+1];
            b[m][1]=a2[m+1];
            b[m][2]=a3[m+1];
        }
        for(int j=0;j<b.length;j++){
            for(int k=0;k<b[j].length;k++){
                System.out.print(b[j][k]+"\t");
            }System.out.println();
        }
    }
}
