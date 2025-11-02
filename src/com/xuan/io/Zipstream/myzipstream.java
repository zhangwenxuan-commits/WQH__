package com.xuan.io.Zipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class myzipstream {
    public static void main(String[] args) throws IOException {
        //创建一个file表示要解压的压缩包
        File file1 = new File("C:\\Users\\52202\\Desktop\\aaa.zip");
        //创建一个File表示解压的目的地
        File dest= new  File("C:\\Users\\52202");
        unzip(file1,dest);
    }
    //定义一个方法来解压
    public static void unzip(File zipfile,File dest) throws IOException {
        ZipInputStream zis = new ZipInputStream(new FileInputStream(zipfile));
      ZipEntry ze;
      while ((ze = zis.getNextEntry()) != null) {
          System.out.println(ze);
          if (ze.isDirectory()) {
              File f=new File(dest,ze.toString());
              f.mkdirs();
          }else{
              FileOutputStream fos = new FileOutputStream(new File(dest,ze.toString()));
              int b;
              while((b=zis.read())!=-1){
                  fos.write(b);
              }
              fos.close();
              zis.closeEntry();
          }
      }
          zis.close();

    }
}
