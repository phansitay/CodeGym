package loop_in_java;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.printf("Enter the number of primes to print : ");
        int number = kb.nextInt();
        int count = 0;
        int n = 2;
        while (count != number) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(n + " ");
                count++;
            }
            n++;
        }
    }
}
