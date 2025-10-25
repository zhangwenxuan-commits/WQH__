package com.xuan.collection;
//自定义一个链表add 与get方法

public class Linkedlist {
    private Node head;
    private Node tail;
    private int size;
    //
    public void add(Object obj){
        Node node = new Node(obj);
        if(head == null){

            head = node;
            tail = node;
        }else{node.previous=tail;
            tail.next = node;
            node.next=null;
            tail=node;

        }size++;
    }
    public Object get(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.element;
    }
    public String toString(){
      StringBuilder builder = new StringBuilder("[");
       Node temp=head;
       while(temp!=null){
           builder.append(temp.element+",");
           temp=temp.next;
       }builder.setCharAt(builder.length()-1,']');
       return builder.toString();
    }

    public static void main(String[] args) {
        Linkedlist linkedlist = new Linkedlist();
        linkedlist.add("a");
        linkedlist.add("b");
        System.out.println(linkedlist);
        System.out.println(linkedlist.get(0));
    }
}
