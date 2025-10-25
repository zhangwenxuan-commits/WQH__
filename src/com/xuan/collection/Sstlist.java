package com.xuan.collection;

public class Sstlist {
    private Object[] elementData;
    private  int size;
    public static final int DEFAULT_CAPACITY=10;
    public Sstlist(int size){
        elementData=new Object[size];
    }
   public Sstlist(){
       elementData = new Object[DEFAULT_CAPACITY];
   }

    @Override
    public String toString() {
        StringBuilder s=new StringBuilder();
        s.append("[");
        for(int i=0;i<size;i++){
            s.append(elementData[i]+",");
        }
        s.setCharAt(s.length()-1,']');
        return s.toString();
    }

    public void add(Object obj){
        elementData[size++]=obj;
   }
    public static void main(String[] args) {
        Sstlist s=new Sstlist(20);
        s.add("aa");
        s.add("bb");
        System.out.println(s);
    }
}
