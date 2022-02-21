/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oueue.in.data.structures;

/**
 *
 * @author Mohamed Abu Jalhoum
 */
public class OueueInDataStructures {
    int size = 3 ;
    int Q[] = new int[size];
    int numitem = 0 ;
    int Rear = 0 ;
    int Front = 0 ;
    
    public void enqueu(int val){
      if(numitem == size){
          System.out.println("this the queu fall");
      }
      else {
        Q[Rear] = val ;
        Rear = (Rear +1) % size ;
        numitem++;
      }
      }
    public void dequeu(){
        
         if(numitem == 0){
             System.out.println("this the queu Empty");
         }
         else {
            int x = Q[Front] ;
            Front = (Front +1)%size;
            numitem--;
         }
        
    
    }
    public static void main(String[] args) {
       int t =3 ;
        System.out.println(1%3);
        System.out.println(2%3);
        System.out.println(3%3);
        System.out.println(4%3);
        System.out.println(5%3);
    }
    
    
}
