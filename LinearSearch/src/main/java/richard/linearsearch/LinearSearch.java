/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package richard.linearsearch;

/**
 *
 * @author CSXRP
 */
public class LinearSearch {
    
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        // Todo 01: - complete the implementation of linear search and test your code  
         //         - prvoide asymptotic analysis of the developed solution
         // This is a loop going through the array making it a
         //linear search so it's O(n).
         for(int i = 0; i<n; i++){
             if (arr[i]== x){
                 return i;
             }
             
         }
       return -1;  
    }
    

    public static void main(String[] args) {
       int[]array={1, 10, 7, 9, 15, 2, 6, 4};
       int index = search(array, 6);
       if (index != -1){
           System.out.println("Found at index "+ index);
       }
       else{
           System.out.println("Not found.");
       }
       int index2 = search(array, 8);
       if (index2 != -1){
           System.out.println("Found at index "+ index2);
       }
       else{
           System.out.println("Not found.");
       }
    }
    
}
