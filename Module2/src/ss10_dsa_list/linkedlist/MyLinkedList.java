package ss10_dsa_list.linkedlist;

import org.w3c.dom.Node;

import java.util.Objects;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList() {
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void addFirst(E element) {
        Node newNode = new Node(element);
        numNodes++;
        newNode.next = head;
        head = newNode;
    }

    public void addLast(E element) {
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++)
            temp = temp.next;
        Node newNode = new Node(element);
        temp.next = newNode;
        numNodes++;
    }
    public void checkIndex(int index){
        if (numNodes <= index || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index khong hop le");
        }
    }
    public void add(int index, E element) {
        checkIndex(index);
        if (index == 0) {
            addFirst(element);
            return;
        }

        Node newNode = new Node(element);
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        numNodes++;
    }

    public E remove(int index){
        checkIndex(index);
        Node temp=head;
        if(index==0){
            head=temp.next;
            return (E) temp.getData();
        }
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        E value = (E) temp.next.getData();
        temp.next = temp.next.next;
        numNodes--;
        return value;
    }
    public boolean removeO(Object element){
        Node temp = head;
        if (Objects.equals(temp.data, element)) {
            head = temp.next;
            numNodes--;
            return true;
        }
        while (temp.next != null) {
            if (Objects.equals(temp.data, element)) {
                temp.next = temp.next.next;
                numNodes--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public int size(){
        return numNodes;
    }
    public E clone(){
        MyLinkedList newList = new MyLinkedList();
        newList.numNodes = this.numNodes;
        Node temp = head;
        Node newNode = null;
        for(int i = 0; i < numNodes; i++) {
            if (i == 0) {
                newNode = new Node(temp.data);
                newList.head = newNode;
            } else {
                newNode.next = new Node(temp.data);
                newNode = newNode.next;
            }
            temp = temp.next;
        }
        return (E) newList;
    }
    public boolean contains(E o){
        Node temp =head;
        while (temp!=null){
            if(o.equals(temp.data)){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public int indexOf(E o){
        Node temp = head;
        int i=0;
        while (temp!=null){
            if (o.equals(temp.data)){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public E get(int i){
        Node temp =head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
            if(count==i){
                return (E) temp.data;
            }
        }
        return null;
    }
    public E getFirst(){
        Node temp=head;
        return (E) temp.data;
    }
    public E getLast(){
        Node temp=head;
        while (temp!=null){
            if(head.next==null){
                return (E) head.data;
            }
            head=head.next;
        }
        return null;
    }
    public void clear(){
        Node temp=head;
        head=null;
        numNodes=0;
    }
    public void output() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("Tong so not = "+numNodes);
    }
}
