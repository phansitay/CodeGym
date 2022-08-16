package ss11_dsa_stack_queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeUsingQueue {
    Queue<Character> queue = new PriorityQueue<Character>();
    Stack<Character>stack=new Stack<>();
    String string;
    public void input(){
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter strings : ");
        string=kb.nextLine();
    }
    public void output(){
        System.out.println("String is : "+string);
    }
    public void pushQueueStack(){
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }
    }
    public void pushQueue(){
        for (int i = 0; i < string.length(); i++) {
            queue.add(string.charAt(i));
        }
    }
    public void test(){
        String[]arrStack = new String[string.length()];
        String[]arrQueue = new String[string.length()];
        for (int i = 0; i < string.length(); i++) {
            arrStack[i]= String.valueOf(stack.pop());
            arrQueue[i]= String.valueOf(queue.peek());
        }
        for (int i = 0; i < string.length(); i++) {
            if(arrStack[i]==arrQueue[i]){
                System.out.println("This is the palindrome sequence");
            }
            else {
                System.out.println("This is not a palindrome series");
            }
        }

    }
    public void printQueue(){
        while (!queue.isEmpty()){
            System.out.println(queue.poll()+"-");
        }
    }
    public void printStack(){
        while (!stack.isEmpty()){
            System.out.println(stack.pop()+" ");
        }
    }
    public static void main(String[] args) {
        PalindromeUsingQueue palindromeUsingQueue=new PalindromeUsingQueue();
        palindromeUsingQueue.input();
        palindromeUsingQueue.output();

        //palindromeUsingQueue.pushQueueStack();
        palindromeUsingQueue.pushQueue();
//        palindromeUsingQueue.printStack();
        palindromeUsingQueue.printQueue();

    }
}
