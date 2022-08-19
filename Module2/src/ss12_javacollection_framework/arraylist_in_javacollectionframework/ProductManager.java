package ss12_javacollection_framework.arraylist_in_javacollectionframework;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    int size = 0;
    ArrayList<Product> arrayList = new ArrayList<>();
    Scanner kb = new Scanner(System.in);

    public void addProduct() {
        System.out.println("Ban muon them bao nhieu san pham : ");
        int n = kb.nextInt();
        size = size + n;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap san pham them thu " + (i + 1) + " la : ");
            Product product = new Product();
            product.input();
            arrayList.add(product);
        }
    }

    //sửa thông tin sản phẩm theo id
    public void repairProduct() {
        int idRepair;
        String name;
        double price;
        int count = 0;
        System.out.println("Nhap id ma ban can sua thong tin ");
        idRepair = kb.nextInt();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == idRepair) {
                kb.nextLine();
                System.out.println("Nhap ten can sua ");
                name = kb.nextLine();
                System.out.println("Nhap gia can thay doi");
                price = kb.nextDouble();
                arrayList.get(i).setNameProduct(name);
                arrayList.get(i).setPrice(price);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Khong tim thay id ! ");
        }
    }

    //Xóa sản phẩm theo id
    public void deleteProduct() {
        int idDelete;
        int count = 0;
        System.out.println("Nhap id ma ban muon xoa san pham :");
        idDelete = kb.nextInt();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == idDelete) {
                arrayList.remove(i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Khong tim thay id muon xoa ");
        }
    }

    //Tìm kiếm sản phẩm theo tên
    public void searchProduct() {
        String nameProduct = "";
        int count = 0;
        kb.nextLine();
        System.out.println("Nhap ten san pham can tim : ");
        nameProduct = kb.nextLine();
        System.out.println("-------------Sau khi search---------------");
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getNameProduct().equals(nameProduct)) {
                System.out.println(arrayList.get(i).output());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Khong tim thay san pham ");
        }
    }

    //sắp xếp sản phẩm theo giá tăng dần
    public void sortUpAscendingPriceProduct() {
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = 0; j < arrayList.size() - 1 - i; j++) {
                if (arrayList.get(j).getPrice() > arrayList.get(j + 1).getPrice()) {
                    Product temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                }
            }
        }
    }

    //sắp xếp sản phẩm theo giá giảm dần
    public void sortDescendingPriceProduct() {
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = 0; j < arrayList.size() - 1 - i; j++) {
                if (arrayList.get(j).getPrice() < arrayList.get(j + 1).getPrice()) {
                    Product temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                }
            }
        }
    }

    public void outputProduct() {
        System.out.println("---------------Danh sach san pham----------------");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("San pham thu " + (i + 1) + arrayList.get(i).output() + "\n");
        }
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
//        productManager.addProduct();
//        productManager.outputProduct();
//        System.out.println("Size = " + productManager.size());
//        productManager.searchProduct();
//        productManager.deleteProduct();
//        System.out.println("------Sau khi xóa------");
//        productManager.outputProduct();
//        productManager.sortUpAscendingPriceProduct();
//        System.out.println("--------Sau khi sort tăng dần---------");
//        productManager.outputProduct();
//        productManager.sortDescendingPriceProduct();
//        System.out.println("--------Sau khi sort giảm dần---------");
//        productManager.outputProduct();
//        productManager.repairProduct();
//        System.out.println("Sau khi sửa ");
//        productManager.outputProduct();
        int choose = 0;
        do {
            System.out.println("-------------------MENU-------------------");
            System.out.println("1. Them san pham" + "\n2. Sua thong tin san pham theo id "
                    + "\n3. Xoa san pham theo id " + "\n4. Hien thi danh sach san pham"
                    + "\n5. Tim kiem san pham theo ten" + "\n6. Sap xep san pham theo gia tang dan"
                    + "\n7. Sap xep san pham theo gia giam dan" + "\n0. Thoat");
            System.out.println("---Vui long chon so---");
            Scanner kb = new Scanner(System.in);
            choose = kb.nextInt();
            if (choose == 1) {
                productManager.addProduct();
                productManager.outputProduct();
            } else {
                if (choose == 2) {
                    productManager.repairProduct();
                    System.out.println("----------Sau khi sua----------");
                    productManager.outputProduct();
                } else {
                    if (choose == 3) {
                        productManager.deleteProduct();
                        System.out.println("---------------Sau khi xoa --------------");
                    } else {
                        if (choose == 4) {
                            System.out.println("--------------Danh sach san pham--------------");
                            productManager.outputProduct();
                        } else {
                            if (choose == 5) {
                                productManager.searchProduct();
                            } else {
                                if (choose == 6) {
                                    productManager.sortUpAscendingPriceProduct();
                                    System.out.println("-----------Sap xep tang dan theo gia----------");
                                    productManager.outputProduct();
                                } else {
                                    if (choose == 7) {
                                        productManager.sortDescendingPriceProduct();
                                        System.out.println("---------Sap xep giam dan theo gia---------");
                                        productManager.outputProduct();
                                    } else {
                                        if (choose == 0) {
                                            System.exit(1);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } while (choose != 0 || choose < 0 || choose > 7);
    }
}
