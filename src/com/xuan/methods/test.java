package com.xuan.methods;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("简易计算器：依次输入【第一个数】【运算符】【第二个数】；输入 q 退出。");

        while (true) {
            Double a = null, b = null;
            String op = null;

            // 读第一个数或 q
            System.out.print("第一个数: ");
            if (!sc.hasNext()) break;
            if (sc.hasNextDouble()) {
                a = sc.nextDouble();
            } else {
                String t = sc.next();
                if (t.equalsIgnoreCase("q")) break;
                System.out.println("输入错误：请先输入数字或 q 退出。");
                continue;
            }

            // 读运算符或 q
            System.out.print("运算符(+ - * /): ");
            if (!sc.hasNext()) break;
            op = sc.next();
            if (op.equalsIgnoreCase("q")) break;
            if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")) {
                System.out.println("输入错误：只支持 + - * /。");
                continue;
            }

            // 读第二个数或 q
            System.out.print("第二个数: ");
            if (!sc.hasNext()) break;
            if (sc.hasNextDouble()) {
                b = sc.nextDouble();
            } else {
                String t = sc.next();
                if (t.equalsIgnoreCase("q")) break;
                System.out.println("输入错误：请在这里输入数字。");
                continue;
            }

            // 计算
            double result;
            if (op.equals("+"))       result = a + b;
            else if (op.equals("-"))  result = a - b;
            else if (op.equals("*"))  result = a * b;
            else { // "/"
                if (b == 0.0) {
                    System.out.println("错误：除数不能为 0");
                    continue;
                }
                result = a / b;
            }

            System.out.println("= " + result);
        }

        sc.close();
        System.out.println("已退出。");
    }
}
