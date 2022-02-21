/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author Mohamed Abu Jalhoum
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        int arr[] = {2,8,10,22,23,50};
        System.out.println(BinarySearch(arr,10));
    }
   static int BinarySearch(int arr[],int key){
     
        int l = 0;
        int h = arr.length-1;
        int su = -1 ;
        while(l<=h){
        int m = (h+l)/2;
        if(key == arr[m]){
          su = m;
        }
        else if(key > arr[m]){
          h = m-1;
        }
        else 
        {
         l = m+1;
        }
        
    }
        return su;
   }
    
}
