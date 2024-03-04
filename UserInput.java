package Arrays;
import java.util.*;
public class UserInput{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int d = s.nextInt();
        int num[] = new int[d];
        for(int i=0;i<d;i++){
            System.out.print("Enter the element at "+i+" array: ");
            int g = s.nextInt();
            num[i] = g;
        }
        Arrays.sort(num);
        System.out.println("The elements in the array are: "+Arrays.toString(num));
    }

}