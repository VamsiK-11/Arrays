package Arrays;
import java.util.Scanner;
public class Exist{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int arr[] = {2,1,4,3,6,5,8,7,10,9};
        for(int i = 0; i<arr.length;i++){
            if(num==arr[i]){
                System.out.println("The elements exists in the array");
            }
        }
    }
}