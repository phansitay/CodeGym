package case_study.controllers;

import case_study.model.Customer;
import case_study.services.CustomerServiceImpl;
import case_study.services.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    Scanner kb = new Scanner(System.in);
    EmployeeServiceImpl employeeService=new EmployeeServiceImpl();
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    public void displayMainMenus() {
        int choose;
        do {
            System.out.println("---------------MENU--------------");
            System.out.println("\n1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management \n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit\n");
            System.out.println("Please enter your choose : ");
            choose = kb.nextInt();
            if (choose == 1) {
                employeeManagement();
            } else {
                if (choose == 2) {
                    CustomerManagement();
                } else {
                    if (choose == 3) {
                        int chooseThree;
                        do {
                            System.out.println("1. Display list facility\n" +
                                    "2. Add new facility\n" +
                                    "3. Display list facility maintenance\n" +
                                    "4. Return main menu\n");
                            System.out.println("Please enter your choose Facility Management : ");
                            chooseThree = kb.nextInt();
                        } while (chooseThree != 4 || chooseThree < 1 || chooseThree > 4);
                    } else {
                        if (choose == 4) {
                            int chooseFour;
                            do {
                                System.out.println("1. Add new booking\n" +
                                        "2. Display list booking\n" +
                                        "3. Create new constracts\n" +
                                        "4. Display list contracts\n" +
                                        "5. Edit contracts\n" +
                                        "6. Return main menu\n");
                                System.out.println("Please enter your choose Booking Management : ");
                                chooseFour = kb.nextInt();
                            } while (chooseFour != 6 || chooseFour < 1 || chooseFour > 6);
                        } else {
                            if (choose == 5) {
                                int chooseFive;
                                do {
                                    System.out.println("1. Display list customers use service\n" +
                                            "2. Display list customers get voucher\n" +
                                            "3. Return main menu\n");
                                    System.out.println("Please enter your choose Promotion Management : ");
                                    chooseFive = kb.nextInt();
                                } while (chooseFive != 3 || chooseFive < 1 || chooseFive > 3);
                            } else {
                                if (choose == 6) {
                                    System.exit(1);
                                }
                            }
                        }
                    }
                }
            }

        } while (choose != 6 || choose < 1 || choose > 6);
    }

    public void employeeManagement(){
        int chooseOne;
        do {
            System.out.println("--------EMPLOYEE MANAGEMENT--------");
            System.out.println("\n1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Return main menu\n");
            System.out.println("Please enter your choose Employee Management : ");
            chooseOne = kb.nextInt();
            if(chooseOne==1){
                employeeService.print();
            }else {
                if (chooseOne==2){
                    employeeService.addEmployee();
                }else {
                    if (chooseOne==3){
                        employeeService.repairEmployee();
                    }
                }
            }
        } while (chooseOne != 4 || chooseOne < 1 || chooseOne > 4);
    }
    public void CustomerManagement(){
        int chooseTwo;
        do {
            System.out.println("1. Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu\n");
            System.out.println("Please enter your choose Customer Management : ");
            chooseTwo = kb.nextInt();
            kb.nextLine();
            if(chooseTwo==1){
                customerService.printCustomer();
            }else {
                if(chooseTwo==2){
                    customerService.addCustomer();
                }else {
                    if(chooseTwo==3){
                        customerService.repairCustomer();
                    }
                }
            }
        } while (chooseTwo != 4 || chooseTwo < 1 || chooseTwo > 4);
    }
    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenus();
    }
}
