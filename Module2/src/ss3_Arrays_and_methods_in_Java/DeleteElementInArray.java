package ss3_Arrays_and_methods_in_Java;

import java.util.Scanner;

public class DeleteElementInArray {
    Scanner kb= new Scanner(System.in);
    int[] arrA;
    int n;
    public void input()
    {
        System.out.printf("Nhập số phần tử của mảng : ");
        n=kb.nextInt();
        arrA = new int[n];
        for (int i=0;i<n;i++) {
            arrA[i] = (int) (Math.random() * 10);
        }
    }
    public void output()
    {
        for(int i=0;i<n;i++){
            System.out.printf(arrA[i]+" ");
        }
    }
    public void delete()
    {
        System.out.printf("Nhập phần tử cần xóa : ");
        int x = kb.nextInt();
        int index=-1;
        for (int i=0;i<n;i++){
            if(arrA[i]==x){
                index=i;
            }
        }
        for(int i=index;i<n-1;i++){
            arrA[i]=arrA[i+1];
        }
        for (int i=0;i<n-1;i++)
        {
            System.out.printf(arrA[i]+" ");
        }
    }
    public static void main(String[] args) {
        DeleteElementInArray xp = new DeleteElementInArray();
        xp.input();
        xp.output();
        xp.delete();

    }
}
