package case_study.services;

import case_study.model.Customer;
import case_study.model.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    ArrayList<Employee> arrayList = new ArrayList<>();
    Scanner kb = new Scanner(System.in);
    int size = 0;

    //hàm thêm nhân viên
    public void addEmployee() {
        int numberEmployee;
        System.out.println("Nhap so nhan vien can them : ");
        numberEmployee = kb.nextInt();
        size = size + numberEmployee;
        for (int i = 0; i < numberEmployee; i++) {
            System.out.println("Nhap thong tin nhan vien can them thu " + (i + 1) + " : ");
            Employee employee = new Employee();
            employee.input();
            arrayList.add(employee);
        }
    }

    //Sua thong tin nhan vien theo id
    public void repairEmployee() {
        Employee employee = new Employee();
        int idRepair;
        String nameRepair;
        String dateRepair;
        String sexRepair;
        int cmndRepair;
        int phoneRepair;
        String emailRepair;
        double salaryRepair;
        int count = 0;
        System.out.println("Nhap id cua nhan vien can sua : ");
        idRepair = kb.nextInt();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getNameId() == idRepair) {
                int choose;
                do {
                    System.out.println("Ban muon sua thong tin gi cua khach hang : " +
                            "\n1. Ten nhan vien" +
                            "\n2. Ngay sinh nhan vien" +
                            "\n3. Gioi tinh nhan vien" +
                            "\n4. Cmnd nhan vien" +
                            "\n5. Sdt nhan vien" +
                            "\n6. Email nhan vien" +
                            "\n7. Trinh do nhan vien" +
                            "\n8. Vi tri nhan vien" +
                            "\n9. Luong nhan vien" +
                            "\n10. Exit");

                    System.out.println("Moi ban nhap so tuong ung voi thong tin khach hang ban muon sua : ");
                    choose = kb.nextInt();
                    kb.nextLine();
                    if (choose == 1) {
                        System.out.println("Moi ban nhap ten moi cua khach hang : ");
                        nameRepair = kb.nextLine();
                        arrayList.get(i).setName(nameRepair);
                    } else {
                        if (choose == 2) {
                            System.out.println("Moi ban nhap ngay sinh moi cua khach hang : ");
                            dateRepair = kb.nextLine();
                            arrayList.get(i).setDate(dateRepair);
                        } else {
                            if (choose == 3) {
                                System.out.println("Moi ban nhap gioi tinh moi cua khach hang : ");
                                sexRepair = kb.nextLine();
                                arrayList.get(i).setSex(sexRepair);
                            } else {
                                if (choose == 4) {
                                    System.out.println("Moi ban nhap so chung minh nhan dan moi cua khach hang : ");
                                    cmndRepair = kb.nextInt();
                                    arrayList.get(i).setCmnd(cmndRepair);
                                } else {
                                    if (choose == 5) {
                                        System.out.println("Moi ban nhap so dien thoai moi cua khach hang : ");
                                        phoneRepair = kb.nextInt();
                                        kb.nextLine();
                                        arrayList.get(i).setPhone(phoneRepair);
                                    } else {
                                        if (choose == 6) {
                                            System.out.println("Moi ban nhap email moi cua khach hang : ");
                                            emailRepair = kb.nextLine();
                                            arrayList.get(i).setEmail(emailRepair);
                                        } else {
                                            if (choose == 7) {
                                                employee.level();
                                                arrayList.get(i).setLevel(employee.getLevel());
                                            } else {
                                                if (choose == 8) {
                                                    employee.location();
                                                    arrayList.get(i).setLocation(employee.getLocation());
                                                } else {
                                                    if (choose == 9) {
                                                        System.out.println("Moi ban nhap luong moi cua nhan vien : ");
                                                        salaryRepair = kb.nextDouble();
                                                        arrayList.get(i).setSalary(salaryRepair);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } while (choose != 10 || choose < 1 || choose > 10);
                count++;
            }
            if (count == 0) {
                System.out.println("Khong tim thay id nay!");
            }
        }
    }

    // hàm hiển thi danh sách nhân viên
    public void print() {
        System.out.println("----------------Danh sach nhan vien------------------");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("\nNhan vien thu " + (i + 1) + " la : \n" + arrayList.get(i).output());
            System.out.println("--------------------------------------------");
        }
        System.out.println("---------------------$$$$$$$-----------------------");
    }

    public static void main(String[] args) {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        employeeService.addEmployee();
        employeeService.print();
        employeeService.repairEmployee();
        employeeService.print();
    }
}
