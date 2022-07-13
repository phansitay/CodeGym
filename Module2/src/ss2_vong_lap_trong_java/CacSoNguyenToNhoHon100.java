package ss2_vong_lap_trong_java;

import java.util.Scanner;

public class CacSoNguyenToNhoHon100 {
    static int isPrime(int n) {
        if (n < 2) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.printf("Bạn muốn hiện các số nguyên tố nhỏ hơn số mấy : ");
        int number = kb.nextInt();
        for (int i = 2; i < number; i++) {
            if (isPrime(i) == 1) {
                System.out.printf(i + " ");
            }
        }

    }
}
