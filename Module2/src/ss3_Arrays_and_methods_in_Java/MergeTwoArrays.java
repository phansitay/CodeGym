package ss3_Arrays_and_methods_in_Java;

import java.util.Scanner;

public class MergeTwoArrays {
    Scanner  kb=new Scanner(System.in);
    int[] arrA ;
    int[] arrB ;
    int m,n;
    public void input(){
        System.out.printf("Nhập số phần tử của mảng A : ");
        m=kb.nextInt();
        System.out.printf("Nhập số phần tử của mảng B : ");
        n=kb.nextInt();
        arrA = new int[m];
        arrB=new int[n];
        for (int i=0;i<m;i++){
            arrA[i]=(int)(Math.random()*10);
        }
        for (int j=0;j<n;j++){
            arrB[j]=(int)(Math.random()*10);
        }
    }
    public  void output(){
        System.out.printf("Mảng a là : ");
        for (int i=0;i<m;i++){
            System.out.printf(arrA[i]+" ");
        }
        System.out.println();
        System.out.printf("Mảng b là : ");
        for (int i=0;i<n;i++){
            System.out.print(arrB[i]+" ");
        }
    }
    public void gopMang(){
        int[] arrC;
        arrC = new int[m+n];
        System.out.println("\nChiều dài mảng c : "+ arrC.length+" ");

        for (int i=0;i<arrA.length;i++){
            arrC[i]=arrA[i];
        }
        for (int j=0;j<arrB.length;j++){
            arrC[arrA.length+j]=arrB[j];
        }
        System.out.printf("Sau khi nối mảng thì mảng C là : ");
        for (int i=0;i<arrC.length;i++){
            System.out.printf(arrC[i]+" ");
        }
    }
    public static void main(String[] args) {
        MergeTwoArrays gm= new MergeTwoArrays();
        gm.input();
        gm.output();
        gm.gopMang();

    }
}
