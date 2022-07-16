package ss3_Arrays_and_methods_in_Java;

import java.util.Scanner;

public class CountOutputOfCharacterInString {
    Scanner kb= new Scanner(System.in);
    String  stringA;
    public void input(){
        System.out.printf("Nhập chuỗi muốn nhập : ");
        stringA=kb.nextLine();
    }
    public void output(){
        System.out.println("Chuỗi là : "+stringA);
    }
    public void search(){
        System.out.printf("Nhập kí tự bạn muốn đếm số lượng : ");
        char x=kb.next().charAt(0);
        int dem=0;
        for (int i=0;i<stringA.length();i++){
            if(stringA.charAt(i)==x)
            {
                dem++;
            }
        }
        System.out.println("Số lần xuất hiện của chữ "+x+" là : "+dem);
    }
    public static void main(String[] args) {
        CountOutputOfCharacterInString c=new CountOutputOfCharacterInString();
        c.input();
        c.output();
        c.search();
    }
}
