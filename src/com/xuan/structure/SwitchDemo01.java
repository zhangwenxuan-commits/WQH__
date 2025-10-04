package com.xuan.structure;

import java.util.Scanner;

public class SwitchDemo01 {
    public static void main(String[] args) {
        char grade ='B';
        //case穿透
       switch(grade){
           case 'A':System.out.println("优秀");
           break;
           case 'B':
               System.out.println("良好");
               break;
           case 'C':
               System.out.println("良");
               break;

       }
    }
}
