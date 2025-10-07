package com.oop;

import com.oop.demo01.Student;
import com.oop.demo02.A;
import com.oop.demo02.B;

public class application {
    public static void main(String[] args) {
        Student s1= new Student();
        A a=new A();
        a.test();
        //父类的引用指向了子类
        B b=new A();
        b.test();
    }
    public  void say(){
        System.out.println("Hello World");
    }
}
