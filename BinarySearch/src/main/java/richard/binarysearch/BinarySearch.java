/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package richard.binarysearch;

/**
 *
 * @author CSXRP
 */
public class BinarySearch {
    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = -1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis 
    //The time analysis is O(log_2(n))
    // Space analysis in this algorithm is O(n)

    
    public static void main(String[] args) {
     int[]array={1,2,3,4,5,6,7,8,9,10};   
      int index = runBinarySearchIteratively(array, 3, 0, 9);
      System.out.println(index);
      int index2 = runBinarySearchIteratively(array, 12, 0, 9);
      System.out.println(index2);

    }
    
}
