package ss3_Arrays_and_methods_in_Java;

import java.util.Scanner;

public class MinInTheArray {
    int[] arrNumber1;
    int n;

    public void input() {
        Scanner kb = new Scanner(System.in);
        System.out.printf("Nhập số phần tử của mảng : ");
        n = kb.nextInt();
        arrNumber1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Mời bạn nhập phần tử thứ " + (i + 1) + " : ");
            arrNumber1[i] = kb.nextInt();
        }
    }

    public void output() {
        for (int i = 0; i < n; i++) {
            System.out.printf(arrNumber1[i] + " ");
        }
    }

    public void minArray() {
        int min = arrNumber1[0];
        for (int i = 0; i < n; i++) {
            if (arrNumber1[i] < min) {
                min = arrNumber1[i];
            }
        }
        System.out.println("Phần tử bé nhất trong mảng là : " + min);
    }

    public static void main(String[] args) {
        MinInTheArray min = new MinInTheArray();
        min.input();
        min.output();
        min.minArray();

    }
}
