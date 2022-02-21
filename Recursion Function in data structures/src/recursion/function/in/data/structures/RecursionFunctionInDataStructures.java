/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion.function.in.data.structures;

/**
 *
 * @author Mohamed Abu Jalhoum
 */
public class RecursionFunctionInDataStructures {

    public static int Re(int a[], int sum,int y){
         
         
         if(y==6)
            return sum ;
         else 
           sum +=a[y];
           y++ ;
           return Re(a,sum,y);
         
        }
    
    public static int re(int a[] , int max , int y){
       
         if(y ==6 ){
            return max ;
         }
         else {
          if(max < a[y]){
            max = a[y];
          }
          y++;
          return re(a,max,y);
         }
        }
    
     public static int r(int a[] , int min , int y){
         int g = a[0];
         if(y ==6 ){
            return g ;
         }
         else {
             
          if(g > a[y]){
            g = a[y];
          }
          y++;
          return re(a,min,y);
         }
        }
     
     
     
     
     public static void m(int val){
         
        if(val==-1){
            System.out.println("stop");
        }
        else{
         for (int i = 0; i <=val; i++) {
               System.out.print("*");
         }
         System.out.println();
         m(val-1);
     
     }
     }
     
     
     public static void mn(int val){
         
        if(val==6){
            
            System.out.println("stop");
        }
        else{
         for (int i = 0; i <=val; i++) {
               System.out.print("*");
         }
         System.out.println();
         mn(val+1);
     
     }
     }
    public static void main(String[] args) {
        
        int s [] = {56,586,65855,6585,5832,358582};
        int sum= 0;
        int y = 0;
        int a = Re(s,sum,y);
        System.out.println(a);
        int o = 0;
        int ko = 0;
        int e = re(s,o,ko);
        System.out.println(e);
        int p =0 ;
        int po =0 ;
        int t = r(s,p,po);
        System.out.println(t);
        System.out.println("=========");
        System.out.println("=========");
        System.out.println("=========");
        System.out.println("=========");
        m(6);
        mn(0);
    }
      
  
    
}
