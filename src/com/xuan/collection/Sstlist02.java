package com.xuan.collection;
//增加泛型，数组扩容
public class Sstlist02 <E>{
    private Object[] elementData;
    private  int size;
    public static final int DEFAULT_CAPACITY=10;
    public Sstlist02(int size){
        elementData=new Object[size];
    }
    public Sstlist02(){
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

    public void add(E element){
        //何时扩容
        if(size==elementData.length){
            Object[] temp=new Object[elementData.length+(elementData.length>>1)];
            System.arraycopy(elementData,0,temp,0,elementData.length);
            elementData=temp;
        }
        elementData[size++]=element;
    }
    public static void main(String[] args) {
        Sstlist02 s=new Sstlist02(20);
      for(int i=0;i<40;i++){
          s.add("zwx"+i);
      }
        System.out.println(s);
    }
}
