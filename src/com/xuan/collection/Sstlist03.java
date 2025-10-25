package com.xuan.collection;
//增加泛型，数组扩容
//增加set() get(),数组边界的检查
public class Sstlist03 <E>{
    private Object[] elementData;
    private  int size;
    public static final int DEFAULT_CAPACITY=10;
    public Sstlist03(int size){
        if(size<0){
            throw new IllegalArgumentException("Size cannot be less than zero");
        }else if(size==0){
            elementData=new Object[DEFAULT_CAPACITY];
        }else
        { elementData=new Object[size];}
    }
    public Sstlist03(){
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
    public E get(int index){
        checkIndex(index);
        return (E)elementData[index];
    }
    public void set(int index,E element){
       checkIndex(index);
        elementData[index]=element;
    }
    public void checkIndex(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }
    public static void main(String[] args) {
        Sstlist03 s=new Sstlist03(20);
        for(int i=0;i<40;i++){
            s.add("zwx"+i);
        }
        System.out.println(s);
        System.out.println(s.get(1));
    }
}
