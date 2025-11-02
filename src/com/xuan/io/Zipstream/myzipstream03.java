package com.xuan.io.Zipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class myzipstream03 {
    public static void main(String[] args) throws IOException {
        //file 对象表示要压缩的文件夹
        File src=new File("C:\\Users\\52202\\Desktop\\bbb");
        //file对象表示压缩包所在路径
        File destparent=src.getParentFile();
        //创建file对象表示压缩包的路径
        File dest=new File(destparent,src.getName()+".zip");
        //创建压缩流关联压缩包
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(dest));
        //获取src里的每一个文件，变成entry对象，放入压缩包中
        tozip(src,zos,src.getName());
        //释放资源
        zos.close();
    }
    /*
     * 作用：获取src里的每一个文件，变成entry对象，放入压缩包中
     * 参数二：压缩流
     * 参数三：压缩流的路径
     * */
    public static void tozip(File zipfile,ZipOutputStream zos,String name) throws IOException{
        //1.进入src文件夹
        File[]files=zipfile.listFiles();
        //2.遍历数组
        for(File f:files){
            if(f.isFile()){
                ZipEntry entry=new ZipEntry(name+"\\"+f.getName());
                zos.putNextEntry(entry);//将entry对象放入压缩包
                FileInputStream fis=new FileInputStream(f);
                int b;
                while((b=fis.read())!=-1){
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();
            }else {
                tozip(f,zos,name+"\\"+f.getName());
            }
        }
    }
}
