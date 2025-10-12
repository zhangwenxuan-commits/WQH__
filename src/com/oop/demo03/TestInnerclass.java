package com.oop.demo03;

public class TestInnerclass {
    public static void main(String[] args) {

        //创建内部类对象
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}
class Outer{
    private int age=10;
            public void testOuter(){
                System.out.println(this.age);
    }
    class Inner{//独立的类，生成独立的class文件，但可直接访问外部类的方法属性
        public void show(){
            System.out.println("外部类的成员变量"+Outer.this.age);

        }
    }
}
