package ss3_Arrays_and_methods_in_Java;

import java.util.Scanner;

public class SumDiagonalLineInArray {
    int m;
    int[][] arrA;
    Scanner kb = new Scanner(System.in);

    public void input() {
        System.out.printf("Nhập số cạnh của ma trận vuông : ");
        m = kb.nextInt();
        arrA = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arrA[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public void output() {
        System.out.println("Ma trận vuông là là : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf(arrA[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void sumLine(){
        int sum=0;
        for (int i=0;i<m;i++){
            sum+=arrA[i][i];
        }
        System.out.println("Tổng của đường chéo chính của ma trận vuông là : "+sum);
    }
    public static void main(String[] args) {
        SumDiagonalLineInArray s= new SumDiagonalLineInArray();
        s.input();
        s.output();
        s.sumLine();

    }
}
