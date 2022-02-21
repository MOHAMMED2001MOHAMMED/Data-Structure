/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack.in.data.srtuctures;

/**
 *
 * @author Mohamed Abu Jalhoum
 */
public class Stack {
    int size = 5;
    int stack [] = new int[size];
    int top = -1 ; 
    
    public boolean isEmpty(){
        
        if(top == -1){
        return true ;
        }
        else{
         return false;
        }
    }
    
    
    
public boolean isFull(){
        
        if(top == size-1){
         return true ;
        }
        else{
        return false;
        }
        
    }






public void push(int val){
      if(isFull()){
          System.out.println("this Full the Stack ");
}
      else{
         top++;
         stack[top] = val ;
          System.out.println("The Value is Pushed in Stack " + val);
      }
}



public void pop(){
    int x ;
      if(isEmpty()){
          System.out.println("this Empty the Stack ");
}
      else{
          x = stack[top];
         top--;
          System.out.println("The Value is Pop in Stack " + x);
      }
}






}




    






