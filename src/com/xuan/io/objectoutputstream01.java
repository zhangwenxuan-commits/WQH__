package com.xuan.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class objectoutputstream01 {
    public static void main(String[] args) throws IOException {
    student stud = new student("zwx",18);
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
    oos.writeObject(stud);
    oos.close();
    }
}
