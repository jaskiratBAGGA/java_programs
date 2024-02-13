import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr = {-1, 7, -32, 89};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[]arr){
        boolean swapped;
        //run the steps n-1 time
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }

            }
//if u did not stop for a particular i then that means that array is sorted
            if(!swapped){
                break;
            }
        }
    }
}
