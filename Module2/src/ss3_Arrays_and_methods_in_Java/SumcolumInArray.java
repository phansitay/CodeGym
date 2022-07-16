package ss3_Arrays_and_methods_in_Java;

import java.util.Scanner;

public class SumcolumInArray {
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

    public void sumCoLum() {
        System.out.printf("Nhập cột mà bạn muốn tính tổng : ");
        int x = kb.nextInt();
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += arrA[i][x];
        }
        System.out.println("Tổng của cột " + x + " là : " + sum);
    }

    public static void main(String[] args) {
        SumcolumInArray sum = new SumcolumInArray();
        sum.input();
        sum.output();
        sum.sumCoLum();
    }
}
