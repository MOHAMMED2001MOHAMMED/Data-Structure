/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author Mohamed Abu Jalhoum
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
   
       
public static void main(String[] args) {
         int sum = 0;
         int t = 0 ;
          int r= factorial(1,sum);
          System.out.print("result of 5 factorial is:=" +r);
    }

    public  static int factorial(int x, int sum) {
	if (x ==500 )
		return sum;
        else 
              if(x %2 ==0){
                sum = x +1 ;   
                
                        }
		return factorial (x+1 , sum/=sum);
              
    }
    
    
}

    
    

