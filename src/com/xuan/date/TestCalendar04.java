package com.xuan.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
 
//可视化日历程序版本2
public class TestCalendar04 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入信息(格式；2020-9-10)");
        Scanner sc = new Scanner(System.in);

        String str=sc.nextLine();//
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        Date d1=df.parse(str);
        Calendar c=new GregorianCalendar();
        c.setTime(d1);
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        int day=c.get(Calendar.DATE);
        c.set(Calendar.DAY_OF_MONTH,1);
        for(int i=0;i<c.get(Calendar.DAY_OF_WEEK)-1;i++){
            System.out.print("\t");
        }

        int days=c.getActualMaximum(Calendar.DATE);
        for(int i=1;i<= days;i++){
            if(i==day){
                System.out.print(c.get(Calendar.DAY_OF_MONTH)+"\t"+"*");
            }else System.out.print(c.get(Calendar.DAY_OF_MONTH)+"\t");
            if(c.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY){
                System.out.println();
            }//1-7对应周日到周六
            c.add(Calendar.DAY_OF_MONTH,1);
        }
    }
}
