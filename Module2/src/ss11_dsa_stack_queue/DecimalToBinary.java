package ss11_dsa_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    Stack<Integer> stack = new Stack<>();
    private int decimal;

    public int getDecimal() {
        return decimal;
    }

    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }

    public void input() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter decimal : ");
        decimal = kb.nextInt();
    }

    public void transfer() {
        while (decimal !=0) {
            int residual = decimal%2;
            stack.push(residual);
            decimal=decimal/2;
        }
        stack.push(decimal);
    }

    public void output() {
        while (!stack.isEmpty()) {
            System.out.printf(" " + stack.pop());
        }
    }

    public static void main(String[] args) {
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        decimalToBinary.input();
        decimalToBinary.transfer();
        System.out.println("After decimal to binary : ");
        decimalToBinary.output();

    }
}
