package ss11_dsa_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class StackReverse {
    Stack<Integer> stack = new java.util.Stack<Integer>();
    int n;
    int[] arrNumber;
    Scanner kb = new Scanner(System.in);

    public void inputArr() {
        System.out.println("Nhap so phan tu cua mang : ");
        n = kb.nextInt();
        arrNumber = new int[n];
        for (int i = 0; i < n; i++) {

            arrNumber[i] = (int) (Math.random() * 10);
        }
    }

    public void output() {
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu thu " + (i + 1) + " = " + arrNumber[i]);
        }
    }

    public void putIntoStack() {
        for (int i = 0; i < n; i++) {
            stack.push(arrNumber[i]);
        }
    }

    public void reverseArr() {
        for (int i = 0; i < n; i++) {
            arrNumber[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        StackReverse stackReverse = new StackReverse();
        stackReverse.inputArr();
        stackReverse.output();
        stackReverse.putIntoStack();
        System.out.println("Sau khi bỏ vào stack : ");
        stackReverse.output();
        stackReverse.reverseArr();
        System.out.println("Mang sau khi dao nguoc : ");
        stackReverse.output();
    }
}
