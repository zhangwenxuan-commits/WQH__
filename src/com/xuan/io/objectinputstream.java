package com.xuan.io;

import com.oop.demo01.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class objectinputstream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        student  ste= (student)ois.readObject();
        System.out.println(ste);
        ois.close();
    }

}
