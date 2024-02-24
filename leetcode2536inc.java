import java.util.Arrays;
public class leetcode2536inc{
    public static void main(String[] args) {
        int n = 2;
        int[][] queries = {{0, 0, 1, 1}};
        int[][] result = rangeAddQueries(n, queries);

        // Print the content of the result array
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=0;
            }
        }
        for(int i = 0; i < queries.length; i++) {
            int[] samp = new int[4];
            for (int j = 0; j < queries[i].length; j++) {
                samp[j] = queries[i][j];
            }
            int r1 = samp[0];
            int c1 = samp[1];
            int r2 = samp[2];
            int c2 = samp[3];

            for (int ci = r1; ci <= r2; ci++) {
                for (int cj = c1; cj <= c2; cj++) {
                    arr[ci][cj] += 1;
                }
            }
        }
        return arr;
    }
}
