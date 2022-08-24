package ss14_sort_algorithm;

import java.util.Scanner;

public class IllustrationInsertionSort {
    int n;
    int arr[];

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang : ");
        n = scanner.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }

    public void output() {
        System.out.println("\n-----------Mảng------------");
        for (int i = 0; i < n; i++) {
            System.out.printf(" " + arr[i]);
        }
    }

    public void insertionSort() {
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
            System.out.println("\nBước thứ " + (i) + " : ");
            output();
        }
    }

    public static void main(String[] args) {
        IllustrationInsertionSort illustrationInsertionSort = new IllustrationInsertionSort();
        illustrationInsertionSort.input();
        illustrationInsertionSort.output();
        illustrationInsertionSort.insertionSort();
    }
}
