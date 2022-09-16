package case_study.services;

import case_study.model.Customer;
import case_study.model.Employee;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    LinkedList<Customer> linkedList = new LinkedList<>();
    Scanner kb = new Scanner(System.in);
    int size = 0;

    @Override
    public void addCustomer() {
        int numberCustomer;
        System.out.println("Nhap so luong khach hang can them vao : ");
        numberCustomer = kb.nextInt();
        size = size + numberCustomer;
        for (int i = 0; i < numberCustomer; i++) {
            System.out.println("Nhap thong tin cua khach hang can them thu " + (i + 1) + " :  ");
            Customer customer = new Customer();
            customer.input();
            linkedList.add(customer);
        }
    }

    @Override
    public void repairCustomer() {
        int idRepair;
        String nameRepair;
        String dateRepair;
        String sexRepair;
        int cmndRepair;
        int phoneRepair;
        String emailRepair;
        String addressRepair;
        int count=0;
        System.out.println("Moi ban nhap id cua khach hang can sua thong tin");
        idRepair = kb.nextInt();
        kb.nextLine();
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).getIdCustomer() == idRepair) {
                int choose;
                do {
                    System.out.println("Ban muon sua thong tin gi cua khach hang : " +
                            "\n1. Ten khach hang" +
                            "\n2. Ngay sinh khach hang" +
                            "\n3. Gioi tinh khach hang" +
                            "\n4. Cmnd khach hang" +
                            "\n5. Sdt khach hang" +
                            "\n6. Email khach hang" +
                            "\n7. Loai khach hang" +
                            "\n8. Dia chi khach hang"+
                            "\n9. Exit");

                    System.out.println("Moi ban nhap so tuong ung voi thong tin khach hang ban muon sua : ");
                    choose = kb.nextInt();
                    kb.nextLine();
                    if (choose == 1) {
                        System.out.println("Moi ban nhap ten moi cua khach hang : ");
                        nameRepair = kb.nextLine();
                        linkedList.get(i).setName(nameRepair);
                    } else {
                        if (choose == 2) {
                            System.out.println("Moi ban nhap ngay sinh moi cua khach hang : ");
                            dateRepair = kb.nextLine();
                            linkedList.get(i).setDate(dateRepair);
                        } else {
                            if (choose == 3) {
                                System.out.println("Moi ban nhap gioi tinh moi cua khach hang : ");
                                sexRepair = kb.nextLine();
                                linkedList.get(i).setSex(sexRepair);
                            } else {
                                if (choose == 4) {
                                    System.out.println("Moi ban nhap so chung minh nhan dan moi cua khach hang : ");
                                    cmndRepair = kb.nextInt();
                                    linkedList.get(i).setCmnd(cmndRepair);
                                } else {
                                    if (choose == 5) {
                                        System.out.println("Moi ban nhap so dien thoai moi cua khach hang : ");
                                        phoneRepair = kb.nextInt();
                                        kb.nextLine();
                                        linkedList.get(i).setPhone(phoneRepair);
                                    } else {
                                        if (choose == 6) {
                                            System.out.println("Moi ban nhap email moi cua khach hang : ");
                                            emailRepair = kb.nextLine();
                                            linkedList.get(i).setEmail(emailRepair);
                                        } else {
                                            if (choose == 7) {
                                                Customer customer = new Customer();
                                                customer.typeCustomer();
                                                linkedList.get(i).setTypeCustomer(customer.getTypeCustomer());
                                            } else {
                                                if (choose == 8) {
                                                    System.out.println("Nhap dia chi moi cua khach hang :");
                                                    addressRepair = kb.nextLine();
                                                    linkedList.get(i).setAddress(addressRepair);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } while (choose != 9 || choose < 1 || choose > 9);
                count++;
            }
        }
        if (count==0){
            System.out.println("Khong tim thay id !");
        }
    }

    @Override
    public void printCustomer() {
        System.out.println("----------------Danh sach San pham----------------");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("\nKhach hang thu " + (i + 1) + " : \n" + linkedList.get(i).output());
            System.out.println("-----------------------------------------------------------");
        }
        System.out.println("-----------------------END------------------------");
    }

    public static void main(String[] args) {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        customerService.addCustomer();
        customerService.printCustomer();
        customerService.repairCustomer();
        customerService.printCustomer();
    }


}
