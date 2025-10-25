package com.xuan.wrap;
//测试自动装箱自动拆箱
public class TestAutoBox {
    public static void main(String[] args) {
        Integer a=234;//自动装箱Integer a=Integer.valueOf(234)
        int b=a;//编译器修改为；int b=a.intValue();
        Integer c=null;
        if(c!=null){
        int d=c;}//自动拆箱，调用了c.intValue
        //缓存-128到127之间的数字，实际为系统初始时创建了一个-128到127之间的一个缓存数组
        //当调用valueOf的时候，首先检查是否在这数组内，如果在直接从缓存数组中拿出已经建好的对象
        Integer in1=Integer.valueOf("123");
        Integer in2=123;
        System.out.println(in1==in2);//123在缓存范围内
        System.out.println(in1.equals(in2));
        Integer in3=Integer.valueOf("1234");
        Integer in4=1234;
        System.out.println(in3==in4);//1234不在缓存范围内
        System.out.println(in3.equals(in4));
    }
}
