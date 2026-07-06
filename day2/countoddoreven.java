package day2;
import java.util.Scanner;
public class countoddoreven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int even = 0;
        int odd = 0;

        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even count = " + even);
        System.out.println("Odd count = " + odd);

        sc.close();
    }
}