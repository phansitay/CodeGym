package ss11_dsa_stack_queue;

import java.util.Scanner;

public class SolutionQueue {
    private class Node{
        int data;
        Node link;

        public int getData() {
            return data;
        }
    }
    private static class Queue{
        SolutionQueue.Node front;
        SolutionQueue.Node rear;

        public SolutionQueue.Node getFront() {
            return front;
        }

        public void setFront(SolutionQueue.Node front) {
            this.front = front;
        }

        public SolutionQueue.Node getRear() {
            return rear;
        }

        public void setRear(SolutionQueue.Node rear) {
            this.rear = rear;
        }
    }
    public void enQueue(Queue queue){
        int value;
        Scanner kb=new Scanner(System.in);
        System.out.println("Nhập giá trị : ");
        value=kb.nextInt();
        Node temp = new Node();
        temp.data=value;
        if(queue.front==null){
            queue.front=temp;
        }else {
            queue.rear.link=temp;
        }
        queue.rear=temp;
        queue.rear.link=queue.front;

    }
    public void deQueue(Queue queue){
        if (queue .front ==  null)
        {
            System.out.printf ("Queue is empty");
        }
        int value;
        if (queue .front == queue .rear)
        {
            value = queue .front .data;
            queue .front =  null;
            queue .rear =  null;
        }
        else
        {
            Node  temp = queue .front;
            value = temp .data;
            queue .front = queue .front .link;
            queue .rear .link= queue .front;
        }

        System.out.println("\nGia tri lay ra vi tri front la : "+value);
    }
    public void displayQueue(Queue queue){
        Node  temp = queue .front;
        System.out.printf("Elements in Circular Queue are: ");
        while (temp .link != queue .front)
        {
            System.out.printf("%d ", temp .data);
            temp = temp .link;
        }
        System.out.printf("%d", temp .data);
    }
    public static void main(String[] args) {
        SolutionQueue solutionQueue=new SolutionQueue();
        Queue queue = new Queue();
        queue.front=queue.rear=null;
        solutionQueue.enQueue(queue);
        solutionQueue.enQueue(queue);
        solutionQueue.enQueue(queue);
        solutionQueue.displayQueue(queue);
        solutionQueue.deQueue(queue);
    }

}
