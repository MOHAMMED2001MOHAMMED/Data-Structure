/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.in.data.structures;

/**
 *
 * @author Mohamed Abu Jalhoum
 */
public class ArrayInDataStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Array[] = {88 , 66 , 3 , 6659 , 9};
       
        int sum =Array[0]; 
        for(int i=0; i<Array.length ; i++){
          
          if(Array[i] < sum){
          sum = Array[i];
          }
            
            
        }
        
        
        
         int max = 0; 
        for(int i=0; i<Array.length ; i++){
          
          if(Array[i] > max){
          max = Array[i];
          }
            
            
        }
        System.out.println(sum);
        System.out.println(max);
    }
    
}
