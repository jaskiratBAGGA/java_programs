import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        int sum = 0;
        int d = n;
        int m = 0;
        while(d != 0){
            m = d%10;
            d = d/10;
            sum = sum + (m*m*m);
        }
        if(sum == n){
            System.out.println(n+" is an armstrong number");
        }
        else{
            System.out.println(n+" is not an armstrong number");
        }
    }
}
