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
public class StackInDataSrtuctures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Stack S = new Stack();
       Stack S1 = new Stack();
       S.push(885);
       S.push(5);
       S.push(825);
       S.push(822);
       S.push(35);
       S.push(35);
       S1.push(S.pop());
       
       
    }
    
}
