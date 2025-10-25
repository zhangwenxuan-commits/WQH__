package com.xuan.file;

import java.io.File;
import java.io.IOException;

public class TestFile01 {
    public static void main(String[] args) throws IOException {
        File f=new File("C:/a.txt");
        System.out.println(f);
       f.renameTo(new File("C:/bb.txt"));
        System.out.println(System.getProperty("user.dir"));
          /*
          file文件是否存在；.exist(),存在返回true
          file文件是否是目录.is Directory()
          file文件是否是文件.isFile()
          file最后修改时间.lastModified()方法返回long类型时间
          file文件大小。length()
          file文件名.getName()
          目录路径。getAbsolutePath()
          * */
        File f3=new File("C:/电影/华语/大陆");
        f3.mkdirs();
    }
}
