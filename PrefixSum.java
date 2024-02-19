import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculate prefix sum
        int[] prefixSum = calculatePrefixSum(array);

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int sum;
            if (start == 0) {
                sum = prefixSum[end];
            } else {
                sum = prefixSum[end] - prefixSum[start - 1];
            }
            System.out.println(sum);
        }
    }

    public static int[] calculatePrefixSum(int[] array) {
        int n = array.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = array[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + array[i];
        }
        return prefixSum;
    }
}
