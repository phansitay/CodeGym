package ss12_javacollection_framework.arraylist_in_javacollectionframework;

import java.util.Scanner;

public class Product {
    private int id;
    private String nameProduct;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void input() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter id of product is : ");
        id = kb.nextInt();
        while (id < 0) {
            System.out.println("Invalid id please re-enter ");
            id = kb.nextInt();
        }
        kb.nextLine();
        System.out.println("Enter name product : ");
        nameProduct = kb.nextLine();
        System.out.println("Enter price of product : ");
        price = kb.nextDouble();
    }

    public String output() {
        String stringProduct;
        stringProduct = "\nId = " + this.id + "\nName Product = " + this.nameProduct + "\nPrice = " + this.price + " vnd";
        return stringProduct;
    }

    public static void main(String[] args) {
    }
}
