package com.xuan.io.myprintstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class printstream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream("a.txt") );
        ps.println(97);
        ps.print(true);
        ps.printf("%s爱上了%s","zwx","wqh");
        ps.close();
    }
}
