package com.xuan.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*测试时间对象和字符串之间的互相转换
dateformat抽象类和simpledateformat实现类的使用
* */
public class TestDateformat {
    public static void main(String[] args) throws ParseException {
        //把时间对象按照格式字符串指定的格式转成字符串
        //df为具有时间字符与时间转化能力的对象，
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       String str= df.format(new Date());
        System.out.println(str);
        //把字符串按照格式字符串指定的格式转成对应的时间对象
        DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=df.parse("1983-05-10 02:23:23");
        System.out.println(date);
        //测试其他的格式字符
        DateFormat df3 = new SimpleDateFormat("D");
        String str2=df3.format(new Date());
        System.out.println(str2);
    }
}
