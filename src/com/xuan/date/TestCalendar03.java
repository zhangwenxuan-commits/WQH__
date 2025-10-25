package com.xuan.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//可视化日历程序
public class TestCalendar03 {
    public static void main(String[] args) throws ParseException {
        String str="2020-2-10";//
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        Date d1=df.parse(str);
        Calendar c=new GregorianCalendar();
        c.setTime(d1);
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        c.set(Calendar.DAY_OF_MONTH,1);
        for(int i=0;i<c.get(Calendar.DAY_OF_WEEK)-1;i++){
            System.out.print("\t");
        }
        int days=c.getActualMaximum(Calendar.DATE);
        for(int i=1;i<= days;i++){
            System.out.print(c.get(Calendar.DAY_OF_MONTH)+"\t");
            if(c.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY){
                System.out.println();
            }//1-7对应周日到周六
            c.add(Calendar.DAY_OF_MONTH,1);
        }
    }
}
