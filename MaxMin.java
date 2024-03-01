package Arrays;

public class MaxMin {
    public static void main(String[] args) {
        // Sample array
        int[] arr = {5, 2, 9, 1, 7, 3};

        // Initialize variables to hold maximum and minimum values
        int max = arr[0];
        int min = arr[0];

        // Iterate through the array to find maximum and minimum elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Print the maximum and minimum elements
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
