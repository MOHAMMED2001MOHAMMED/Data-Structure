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
public class Linkedlist {

    Node hade = null;
    Node tail = null;
    int size = 0;

    /**
     * @return the hade
     */
    public Node getHade() {
        return hade;
    }

    /**
     * @return the tail
     */
    public Node getTail() {
        return tail;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    public void insertFirst(Node newNode) {
        if (size == 0) {
            hade = newNode;
            tail = newNode;
        } else {
            hade = newNode;
            newNode.next = hade;
        }
        size++;

    }
    public void insertLast(Node newNode) {
        if (size == 0) {
            hade = newNode;
            tail = newNode;
        } else {
            tail.next = newNode ; 
            tail = newNode ;
        }
        size++;

    }
    
    
    public void insertAfter(Node currenter , Node newNode){
       if(size ==0){
        hade = newNode ;
        tail = newNode ;
       }
       newNode.next = currenter.next;
       currenter.next = newNode ;
       
    }
    
     
    
   public void display(){
   Node custemer = hade ;
  
   while(custemer != null){
      
       System.out.println("The Data : "+custemer.data + " ");
        custemer = custemer.next;
  }
      
   
   }
    
    

}
