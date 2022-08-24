package ss14_sort_algorithm;

import java.util.Scanner;

public class InstallInsertionSort {
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

    public void insertionSortAscending() {
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }else
                {
                    break;
                }
            }
        }
    }

    public void insertionSortDecrease() {
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        InstallInsertionSort installInsertionSort = new InstallInsertionSort();
        installInsertionSort.input();
        installInsertionSort.output();
        installInsertionSort.insertionSortAscending();
        System.out.println("\nSau khi sắp xếp tăng");
        installInsertionSort.output();
        System.out.println();
        installInsertionSort.insertionSortDecrease();
        System.out.println("\nSau khi sắp xếp giảm ");
        installInsertionSort.output();

    }
}
