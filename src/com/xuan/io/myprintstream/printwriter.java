package com.xuan.io.myprintstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class printwriter {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("a.txt"),true );
        pw.println("当着世界已经将我遗弃，像一个伤兵~");
        pw.close();
    }
}
