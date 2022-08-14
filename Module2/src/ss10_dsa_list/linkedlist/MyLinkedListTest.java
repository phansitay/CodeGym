package ss10_dsa_list.linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        myLinkedList.addFirst(5);
        myLinkedList.addLast(10);
        myLinkedList.add(0,2);
        myLinkedList.add(1,3);
        myLinkedList.addLast(1);
        myLinkedList.addLast(3);

        System.out.println("Sau khi them");
        myLinkedList.output();
        System.out.println("Sau khi xóa ");
        myLinkedList.remove(1);
        myLinkedList.output();
        System.out.println("Sau khi xoa : "+myLinkedList.removeO(2));
        myLinkedList.output();
//        System.out.println("sau khi clone ");
//        myLinkedList.clone();
//        myLinkedList.output();
        System.out.println("Sau khi tim : "+myLinkedList.contains(10));
        System.out.println("Sau khi indexOf thi vi tri phan tu la : "+myLinkedList.indexOf(1));
        System.out.println("Phan tu tai vi tri can  tim la : "+myLinkedList.get(1));
        System.out.println("Phan tu dau tien : "+myLinkedList.getFirst());
        System.out.println("Phan tu cuoi cung la : "+myLinkedList.getLast());
        myLinkedList.clear();
        System.out.println("Sau khi clear : ");
        myLinkedList.output();
    }
}
