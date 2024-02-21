import java.util.Scanner;


public class PrefixSumSection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the 2D array
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns:");
        int columns = scanner.nextInt();

        // Input the elements of the 2D array
        System.out.println("Enter the elements of the array:");
        int[][] array = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int[][] cumu_arr = new int[rows][columns];
        cumu_arr[0][0] = array[0][0];

        for (int cj = 1; cj < columns; cj++) {
            cumu_arr[0][cj] = cumu_arr[0][cj - 1] + array[0][cj];
        }
        for (int ci = 1; ci < rows; ci++) {
            cumu_arr[ci][0] = cumu_arr[ci - 1][0] + array[ci][0];
        }
        for (int ci = 1; ci < rows; ci++) {
            for (int cj = 1; cj < columns; cj++) {
                cumu_arr[ci][cj] = cumu_arr[ci][cj - 1] + cumu_arr[ci - 1][cj] - cumu_arr[ci - 1][cj - 1] + array[ci][cj];
            }
        }
        System.out.println("Enter start row:");
        int startrow = scanner.nextInt();

        System.out.println("Enter start column:");
        int startcolumn = scanner.nextInt();

        System.out.println("Enter end row:");
        int endrow = scanner.nextInt();

        System.out.println("Enter end column:");
        int endcolumn = scanner.nextInt();

        if(startrow==0 && startcolumn==0){
            System.out.println(cumu_arr[endrow][endcolumn]);
        }
        if(startrow==0){
            System.out.println(cumu_arr[endrow][endcolumn] - cumu_arr[endrow][startcolumn-1]);
        }
        if(startcolumn==0){
            System.out.println(cumu_arr[endrow][endcolumn] - cumu_arr[startrow-1][endcolumn]);
        }
        else{
            System.out.println(cumu_arr[endrow][endcolumn] -
                    cumu_arr[endrow][startcolumn-1]-
                    cumu_arr[startrow-1][endcolumn]+
                    cumu_arr[startrow-1][startcolumn-1]);
        }
    }
}