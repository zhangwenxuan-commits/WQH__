package com.xuan.io.Zipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class myzipstream02 {
    public static void main(String[] args) throws IOException {
        // 1. 源文件：确保a.txt存在于项目根目录（或修改路径为实际位置）
        File src = new File("a.txt");
        if (!src.exists()) {
            throw new FileNotFoundException("源文件 a.txt 不存在，请检查路径！");
        }

        // 2. 目标目录：指定一个存在的目录（这里示例为项目下的 zipDemo 目录，也可改到其他可访问路径）
        File destDir = new File("zipDemo");
        if (!destDir.exists()) {
            destDir.mkdirs(); // 自动创建多级目录
        }

        tozip(src, destDir);
    }

    public static void tozip(File src, File destDir) throws IOException {
        // 目标压缩包：destDir 目录下的 a.zip
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(destDir, "a.zip")));
        ZipEntry ze = new ZipEntry("a.txt");
        zos.putNextEntry(ze);

        // 写入文件内容
        FileInputStream fis = new FileInputStream(src);
        int b;
        while ((b = fis.read()) != -1) {
            zos.write(b);
        }

        // 关闭资源
        fis.close();
        zos.closeEntry();
        zos.close();
    }
}