
package day5;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[5];

        System.out.println("Enter 5 names:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.next();
        }

        System.out.println("You entered:");

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}