package ss10_dsa_list.arraylist;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();

        listInteger.add(0, 4);
        listInteger.add(1, 3);
        listInteger.add(2, 5);
        listInteger.add(5, 6);
        listInteger.output();
        System.out.println("\nSize là : " + listInteger.size());
        listInteger.add(2, 5);
        System.out.println("Sau khi add");
        listInteger.output();
        System.out.println("\nSize là : " + listInteger.size());

        listInteger.remove(1);
        System.out.println("\nSau khi remove");
        listInteger.output();
        System.out.println("\nSize là : " + listInteger.size());
        System.out.println("\nSau khi add");
        listInteger.add(9, 6);
        listInteger.add(8, 8);
        listInteger.output();
        System.out.println("\nSize là : " + listInteger.size());
        System.out.println("\nSau khi clone");
        listInteger.clone();
        listInteger.output();
        System.out.println("\nSize là : " + listInteger.size());
        System.out.println("\nSau kho contains : " + listInteger.contains(8));
        System.out.println("\nVi tri dau tien cua phan tu can tim trong mang : " + listInteger.indexOf(0));
        System.out.println("\nVi tri dau tien cua phan tu can tim trong mang : " + listInteger.indexOf(6));
        System.out.println("\nsau khi add " + listInteger.add(30));
        System.out.println("Mang sau khi duoc add vao cuoi cung : ");
        listInteger.output();
        System.out.println("\nSize là : " + listInteger.size());
        System.out.printf("\nSize moi cua mang sau khi them la ");
        listInteger.ensureCapacity(20);
        System.out.println("\nmang moi ");
        listInteger.output();
        System.out.println("\nPhan tu tai vi tri can tim la : " + listInteger.get(2));
        listInteger.clear();
        System.out.println("\nSau khi clear : ");
        listInteger.output();
    }
}
