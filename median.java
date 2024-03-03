package Arrays;

import java.util.Arrays;

public class median {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 2, 4}; // Odd number of elements
        int[] array2 = {1, 3, 5, 2, 4, 6}; // Even number of elements

        System.out.println("Median of array1: " + findMedian(array1));
        System.out.println("Median of array2: " + findMedian(array2));
    }

    public static double findMedian(int[] arr) {
        // Sort the array
        Arrays.sort(arr);
        
        int n = arr.length;
        // If the array has an odd number of elements, return the middle element
        if (n % 2 != 0) {
            return arr[n / 2];
        } else { // If the array has an even number of elements, return the average of the two middle elements
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
    }
}
