package ss1_introduction_java;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter name : ");
        String name =kb.nextLine();
        System.out.println("Hello : "+name);
    }
}
