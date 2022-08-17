package ss11_dsa_stack_queue;

import java.util.*;

public class PalindromeUsingQueue {
    Deque<Character> queue = new LinkedList<>();
    Stack<Character> stack = new Stack<>();
    String string;

    public void input() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter strings : ");
        string = kb.nextLine();
    }

    public void output() {
        System.out.println("String is : " + string);
    }

    public void pushStack() {
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }
    }

    public void pushQueue() {
        for (int i = 0; i < string.length(); i++) {
            queue.add(string.charAt(i));
        }
    }

    public void printQueue() {
        while (!queue.isEmpty()) {
            System.out.printf(" " + queue.poll());
        }
    }

    public void printStack() {
        while (!stack.isEmpty()) {
            System.out.printf(" " + stack.pop());
        }
    }

    public void testPalindrome() {
        int count = 0;
        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (stack.pop() == queue.poll()) {
                count++;
            }
        }
        if (count == string.length()) {
            System.out.println("This is the palindrome sequence");
        } else {
            System.out.println("This is not a palindrome series");
        }
    }

    public static void main(String[] args) {
        PalindromeUsingQueue palindromeUsingQueue = new PalindromeUsingQueue();
        palindromeUsingQueue.input();
        palindromeUsingQueue.output();
        palindromeUsingQueue.pushStack();
//        System.out.printf("Stack is : ");
//        palindromeUsingQueue.printStack();
//        System.out.println();
        palindromeUsingQueue.pushQueue();
//        System.out.printf("Queue is : ");
//        palindromeUsingQueue.printQueue();
//        System.out.println();
        palindromeUsingQueue.testPalindrome();
    }
}
