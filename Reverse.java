package Arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int yo[] ={1,2,3};
        int d[] = new int[3];
        int[] reverse = new int[yo.length];
        for(int i = (yo.length-1),j=0;i>=0;i--,j++){
            reverse[j] = yo[i];
        }
        System.out.println(Arrays.toString(reverse));
        
    }
    
}
