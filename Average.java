package Arrays;

public class Average {
    public static void main(String[] args) {
        // Sample array
        int[] arr = {5, 2, 9, 1, 7, 3};

        // Calculate sum of elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Calculate average
        double average = (double) sum / arr.length;

        // Print the average
        System.out.println("Average of array elements: " + average);
    }
}
