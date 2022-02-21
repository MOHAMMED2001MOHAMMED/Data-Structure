/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Mohamed Abu Jalhoum
 */
public class Tester {
    public static void main(String[] args) {
        
        Linkedlist s1 = new Linkedlist();
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        s1.insertFirst(n0);
        s1.insertLast(n1);
        s1.insertLast(n2);
        s1.insertLast(n3);
        //s1.insertLast(n4);
        //s1.insertAfter(n2, n4);
       // s1.insertFirst(n1);
        /* s1.insertFirst(n2);*/
        s1.display();
        
    }
}
