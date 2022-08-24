package ss15_exception_handling_debug;

import java.util.Scanner;

public class Triangle {
    int a;
    int b;
    int c;
    Scanner kb = new Scanner(System.in);

    public void input() {
        System.out.println("Enter a : ");
        a = kb.nextInt();
        System.out.println("Enter b : ");
        b = kb.nextInt();
        System.out.println("Enter c : ");
        c = kb.nextInt();
    }

    public boolean checkTriangle() throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Canh khong the nho hon hoac bang 0.");
        }
        if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException("Tong 2 canh phai lon hon canh con lai");
        }
        return true;
    }

    public void checkException() {
        while (true) {
            try {
                if (checkTriangle()) {
                    break;
                }
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui long nhap lai");
                input();
            }
        }
    }

    public void output() {
        System.out.println("3 canh tam giac : " + a + " " + b + " " + c);
    }

    public static void main(String[] args) {
        Triangle illegalTriangleException = new Triangle();
        illegalTriangleException.input();
        illegalTriangleException.checkException();
        illegalTriangleException.output();
    }
}
