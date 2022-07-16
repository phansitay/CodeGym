package ss3_Arrays_and_methods_in_Java;

import java.util.Scanner;

public class MaxInTheArray {
    int m, n;
    int[][] arrA;
    Scanner kb = new Scanner(System.in);

    public void input() {
        System.out.printf("Nhập số hàng : ");
        m = kb.nextInt();
        System.out.printf("Nhập số cột : ");
        n = kb.nextInt();
        arrA = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arrA[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public void output() {
        System.out.println("Mảng là : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf(arrA[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void maxArray() {
        int max = arrA[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arrA[i][j] > max) {
                    max = arrA[i][j];
                }
            }
        }
        System.out.println("Max cua mang 2 chieu la : " + max);
    }

    public static void main(String[] args) {
        MaxInTheArray max = new MaxInTheArray();
        max.input();
        max.output();
        max.maxArray();
    }
}
