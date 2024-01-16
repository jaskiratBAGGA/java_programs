import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  
        int [][] arr = {
                {2,3,4},
                {5,6},
                {7,8,9}
        };
        for(int row = 0; row<arr.length; row++){
            for(int col=0; col<arr[row].length;col++){
                arr[row][col] = in.nextInt();

            }
        }
    }

}
