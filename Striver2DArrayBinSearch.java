import java.util.Arrays;

public class Striver2DArrayBinSearch {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(searchMatrix(arr, 6)));
    }
    static int[] searchMatrix(int [][]arr, int target){
        int n = arr.length;
        int m = arr[0].length;
        int low = 0;
        int high = n * m -  1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            int row = mid / m;
            int col = mid % m;
            if(arr[row][col] == target){
                return new int[]{row, col};
            }
            if(arr[row][col] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}
