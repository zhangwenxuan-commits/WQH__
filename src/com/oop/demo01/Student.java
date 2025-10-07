package com.oop.demo01;
//java中，所有的类，都默认直接或间接继承Object类
//子类
public class Student extends Person {
//   public static void main(String[] args) {
//       Student s1= new Student();
//       s1.say();
//       System.out.println(s1.getMoney());//父类私有时无法继承
//   }

    public Student() {
        super();//调用父类的构造器，必须在子类构造器的第一行
        System.out.println("Student无参执行");
    }
}
