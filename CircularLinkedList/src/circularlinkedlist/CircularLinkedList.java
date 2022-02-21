/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularlinkedlist;

/**
 *
 * @author Mohamed Abu Jalhoum
 */
public class CircularLinkedList {
   
    Node hade = null ; 
    Node taile = null ; 
    int size  = 0 ;
    
    static class Node{
        int date ; 
        Node next;
          public Node(int date){
            this.date = date;
          }
    }
    
   void add(Node newNode){
     if(size == 0){
        hade = newNode ;
        taile = newNode;
        taile.next = hade;
     }
     else{
       taile.next =newNode;
       taile = newNode ;
       taile.next = hade;
       
     }
     size++;
   }
   void display(){
     if(size == 0){
         System.out.println("The Circular Linked list is Empty");
      }
     else{
      Node C = hade ;
         for (int i = 0; i < size; i++) {
             System.out.println("The Circular Linked list is "+C.date);
             C =  C.next;
         }
     }
   }
    public static void main(String[] args) {
        CircularLinkedList s = new CircularLinkedList();
        Node n = new Node(5);
        Node n1 = new Node(50);
        Node n2 = new Node(500);
        Node n3 = new Node(5000);
        s.add(n);
        s.add(n1);
        s.add(n2);
        s.add(n3);
        s.display();
        System.out.println("The taile.next = : " +n3.next.date);
        
        
    }
    
}
