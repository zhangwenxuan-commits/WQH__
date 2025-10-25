package com.xuan.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar01 {
    public static void main(String[] args) {
        Calendar calendar=new GregorianCalendar(2999,10,9,22,10,50);
        int year=calendar.get(Calendar.YEAR);
        int month=calendar.get(Calendar.MONTH)+1;
        System.out.println(month);//0-11表示对应的月份，
        int weekday=calendar.get(Calendar.DAY_OF_WEEK);//周几1-7
        Calendar c2=new GregorianCalendar();//默认今天
        c2.set(Calendar.YEAR,2025);
        System.out.println(c2.get(Calendar.YEAR));
        c2.add(Calendar.DAY_OF_MONTH,100);
        Date d3=c2.getTime();
        System.out.println(d3);
Calendar c3=new GregorianCalendar();
c3.setTime(new Date());
    }
}
