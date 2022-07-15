package ss3_Arrays_and_methods_in_Java;

import java.util.Scanner;

public class AddElementInArray {
    int[] arrNumber1;
    int n;
    public void input(){
        Scanner kb= new Scanner(System.in);
        System.out.printf("Nhập số phần tử của mảng : ");
        n=kb.nextInt();
        arrNumber1=new int[n];
        for (int i=0;i<n;i++)
        {
            arrNumber1[i]=(int)(Math.random()*10);
        }
    }
    public void output()
    {
        for (int i=0;i<n;i++){
            System.out.printf(arrNumber1[i]+" ");
        }
    }
    public void add()
    {
        Scanner kb= new Scanner(System.in);
        System.out.printf("Nhập phần tử cần chèn : ");
        int x=kb.nextInt();
        System.out.printf("Nhập vị trí cần chèn : ");
        int vt=kb.nextInt();
        int i=0;n=arrNumber1.length;
        int[] arrNumber2;
        arrNumber2=new int[n+1];
        if(vt<0||vt>n){
            System.out.printf("Không chèn được");
        }else {

            for(i=0;i<vt-1;i++)
                arrNumber2[i]=arrNumber1[i];
            for(i=n;i>=vt-1;i--)
                arrNumber2[i]=arrNumber1[i-1];
            arrNumber2[vt-1]=x;//bo gia trị x vào vị trý k
            arrNumber1=arrNumber2;
        }
    }
    public static void main(String[] args) {
        AddElementInArray tp= new AddElementInArray();
        tp.input();
        tp.output();
        tp.add();
        tp.output();
    }
}
