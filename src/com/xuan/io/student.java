package com.xuan.io;

import java.io.Serial;
import java.io.Serializable;

public class student implements Serializable {
    @Serial
    private static final long serialVersionUID = 3847734575570362623L;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    private String email;

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}



