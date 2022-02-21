/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author Mohamed Abu Jalhoum
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int arr [] = {232,32,20,2,0,35,6};
       sort(arr);
        
    }
    
     public static void sort(int arr[])
        {
        for(int i =0; i<arr.length-1;i++)
        {
          for(int j =0;j<arr.length-i-1;j++)
          {
          
          if(arr[j] > arr[j+1]){
           int time = arr[j];
           arr[j] = arr[j+1];    
           arr[j+1] = time;
          }
              
              
          }
            
            
            
            
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
                
        }
        
        
    
}
