package com.xuan.array;

public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5};
        for (int j : arrays) {
            System.out.println(j);
        }
        printArray(arrays);
       printArray(reverse(arrays));
    }
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }
    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        for (int i = array.length - 1; i >=0; i--) {
            result[i] = array[array.length - i - 1];
        }return result;
    }
}