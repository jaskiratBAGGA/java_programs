import java.util.Scanner;

public class revnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        while(n > 0) {
            int rem = n % 10;
            n /= 10;
            s = s*10 + rem;

        }
        System.out.println(s);
    }
}
