import java.util.Scanner;

public class CaeCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");

        char ch = sc.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lowercase");
        }

        else {
            System.out.println("uppercase");
        }
    }
}
