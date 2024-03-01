package Arrays;
public class Sum {
    public static void main(String[] args) {
        // Sample array
        int[] arr = {1, 2, 3, 4, 5};

        // Calculate sum of elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Print the sum
        System.out.println("Sum of array elements: " + sum);
    }
}
