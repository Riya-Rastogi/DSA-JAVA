package com.Queue;

import com.LinkedList.DLL;
import com.LinkedList.LL;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------");
        System.out.println("Singly Linked List");
        System.out.println("--------------------");

        LL list = new LL();
        list.insertFirst(33);
        list.insertFirst(22);
        list.insertFirst(35);
        list.insertFirst(23);
        list.insertLast(37);
        list.insert(44,3);
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        System.out.println(list.delete(2));
        list.display();

        System.out.println("--------------------");
        System.out.println("Doubly Linked List");
        System.out.println("--------------------");

        DLL list1 = new DLL();
        list1.insertFirst(23);
        list1.insertFirst(24);
        list1.insertFirst(25);
        list1.insertFirst(26);
        list1.insertLast(68);
        list1.insert(26,44);
        list1.display();


        //        CLL list = new CLL();
//        list.insert(23);
//        list.insert(3);
//        list.insert(19);
//        list.insert(75);
//        list.display();
//        list.delete(19);
//        list.display();


    }
}
