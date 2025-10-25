package com.xuan.collection;
//自定义一个链表add 与get方法
//02增加remove
public class Linkedlist02 {
    private Node head;
    private Node tail;
    private int size;
    //
//    public void remove(int index){
//     Node temp = getNode(index);
//     if(temp != null){
//         Node up=temp.previous;
//         Node down=temp.next;
//         up.next = down;
//         down.previous = up;
//     }size--;
//    }
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
       Node temp = getNode(index);
        return temp.element;
    }
    public Node getNode(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }return temp;
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
        Linkedlist02 linkedlist = new Linkedlist02();
        linkedlist.add("a");
        linkedlist.add("b");
        System.out.println(linkedlist);
        System.out.println(linkedlist.get(0));
//        System.out.println(linkedlist.remove(0));
    }
}

