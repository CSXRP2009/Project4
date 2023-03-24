/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package richard.bubblesort;

/**
 *
 * @author CSXRP
 */
public class BubbleSort {


    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                //ToDo 3: complete this algorithm, test it, provide its time complexity
                // Time Complexity of this is O(n^2)
                if(a[inner]>a[inner+1]){
                    temp=a[inner];
                    a[inner]= a[inner+1];
                    a[inner+1]= temp;
                }
            
            }
        }
    }
    
    

    public static void main(String[] args) {
        int []array= {1,8,4,9,7};
        bubbleSort(array, array.length );
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
