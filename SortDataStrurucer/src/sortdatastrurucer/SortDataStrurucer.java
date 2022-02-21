/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortdatastrurucer;

/**
 *
 * @author Mohamed Abu Jalhoum
 */
public class SortDataStrurucer {

    /* void sort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
*/
    // Driver code to test above
    public static void main(String args[])
    {
        System.out.println("Mohammed Abo Jalhoom");
        int arr[] = {58020,105,1021,210,201,501,510,20,1200};
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = 0; j <arr.length-i-1; j++) {
                
                if(arr[j] > arr[j+1]){
                  int t  = arr[j+1];
                  arr[j+1] = arr[j];
                  arr[j] = t ;
                }
            }
        }
        
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
}
    

