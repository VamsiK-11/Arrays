package Arrays;

public class count_even {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int count = 0;
        for (int i:arr) {
            if(i%2==0){
                count+=1;
            }
        }
        System.out.println("There are "+count+" even elements in the array");
    }
}


