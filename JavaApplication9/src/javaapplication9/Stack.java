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
public class Stack {
    
    
    private  int size;
   private int a[];
    private int top ;
    
    
   public Stack(int s){
   a = new int[s];
   size=s;
    top = -1;
   }
    public void push(int val) {
        if (isfull()) {
            System.out.println("Stack is Full.");
        } else {
            top = top + 1;
            a[top] = val;
            System.out.println("The value is pushed in Stack = " + val);
        }
    }

    public int pop() {
        int x = 0;
        if (isempty()) {
            System.out.println("Empty!!");
        } else {
            x = a[top];
            top = top - 1;
           System.out.println("the pop value is:" + x);
        }
        return x;
    }

    public boolean isempty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isfull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Stack ss = new Stack(10);
        Stack s1 = new Stack(10);
        int i = 20;
        while (!ss.isfull()) {
                ss.push(i);
            i += 85;
        }
        System.out.println("============");
        while (!s1.isfull()) {
           s1.push(ss.pop());
        }
        System.out.println("----------------");
        while (! s1.isempty()) {
    
           s1.pop(); 
          
        }
    }
    
}
