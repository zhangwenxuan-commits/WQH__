package com.oop.demo01;
//人
public class Person {
    //public int money=1000;
      private int Money=1000;

    public Person() {
        System.out.println("Person无参执行");
    }

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
    }

    public  void say() {
        System.out.println("Hello");
    }
}
