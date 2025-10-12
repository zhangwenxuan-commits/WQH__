package com.oop.demo03;

public class TestEncapsulation {
    public static void main(String[] args) {
      human h=new human();
      //h.age=13(private时仅同类可见)
        h.name="zwx";
    }
}
class human{
    private int age;
    String name;//默认修饰时使用范围不超出本包
    void sayAge(){
        System.out.println(age);
    }
}
class boy extends human{
    void sayBoy(){
        boy a=new boy();
        a.name="zxz";
       // System.out.println(age);子类无法使用父类的私有属性和方法
    }
}
/*
1.对于类的属性，一般私有（仅提供set与get方法）
2.
* */