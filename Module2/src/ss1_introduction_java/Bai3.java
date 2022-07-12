package ss1_introduction_java;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        double vnd=23000;
        double usd;
        Scanner kb= new Scanner(System.in);
        System.out.printf("Bạn muốn quy đổi bao nhiêu USD : ");
        usd = kb.nextDouble();
        double doi=usd*vnd;
        System.out.printf("Sau khi quy đổi thì "+usd+" USD thành :  "+doi+" VND");
    }
}
