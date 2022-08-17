package ss11_dsa_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracketsUsingStack {
    Stack<Character> stack = new Stack<Character>();
    String string;

    public void input() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter String : ");
        string = kb.nextLine();
    }

    public void output() {
        System.out.println("String is : " + string);
    }

    public boolean checkBrackets() {
        char sym;
        for (int i = 0; i < string.length(); i++) {
            sym = string.charAt(i);
            if (sym == '(') {
                stack.push(sym);
            } else {
                if (sym == ')') {
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        char left;
                        left = stack.pop();
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        CheckBracketsUsingStack checkBracketsUsingStack = new CheckBracketsUsingStack();
        checkBracketsUsingStack.input();
        checkBracketsUsingStack.output();
        System.out.println(checkBracketsUsingStack.checkBrackets());
    }
}
