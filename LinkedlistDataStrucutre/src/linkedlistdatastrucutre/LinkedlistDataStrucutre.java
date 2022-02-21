/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistdatastrucutre;

/**
 *
 * @author Mohamed Abu Jalhoum
 */
public class LinkedlistDataStrucutre {

    Node hade = null;
    Node taile = null;
    int size = 0;

    static class Node {

        int date;
        Node next;

        public Node(int date) {
            this.date = date;
        }

    }

    public void add(Node newNode) {
        if (size == 0) {
            hade = newNode;
            taile = newNode;
        } else {
            taile.next = newNode;
            taile = newNode;
        }
        size++;
    }

    public void display() {
        Node dis = hade;
        while (dis != null) {
            System.out.println(dis.date);
            dis = dis.next;
        }
    }

    public void Delete(Node delete) {
        Node n = hade;
        Node d = delete;
        if (size == 0) {
            System.err.println("Null");
        } else if (d == hade) {
            hade = hade.next;
        }
        else if(d == taile){
           Node de = hade ;
         while(de.next.next != null){
         de = de.next ;
         }
         de.next = null ;
         taile = de ;
        }
        
        else {

            Node de = hade;
            while (de != null) {
                if (de.next == delete) {
                    de.next = delete.next;
                }
                de = de.next;
            }
        }
        size--;
    }
    
    void Sort(){
      
        for (int i = 0; i <size; i++) {
            Node h = hade ; 
            Node p = hade.next;
            for (int j = 0; j <size; j++) {
                if(p!=null && h!=null){
                 if(h.date > p.date ){
                    int t = h.date ;
                    h.date = p.date ;
                    p.date = t ;
                 }
                 h= h.next;
                 p= p.next;
            }
        }
        }
    }

    public static void main(String[] args) {
        LinkedlistDataStrucutre s = new LinkedlistDataStrucutre();
        Node n = new Node(54848);
        Node n1 = new Node(10);
        Node n2 = new Node(58400);
        Node n3 = new Node(50585);
        Node n4 = new Node(41150);
        Node n5 = new Node(5252520);
        s.add(n);
        s.add(n1);
        s.add(n2);
        s.add(n3);
        s.add(n4);
        s.add(n5);
        s.Sort();
     //   s.Delete(n3);
        s.display();
        

    }

}
