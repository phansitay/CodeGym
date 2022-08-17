package ss11_dsa_stack_queue.demerging_using_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ListHuManResourceManagement {
    private int n;
    private HumanResourceManagement[] arrListHRM;
    Deque<String> female = new ArrayDeque<>();
    Deque<String> male = new ArrayDeque<>();
    Scanner kb = new Scanner(System.in);

    public void inputList() {
        System.out.println("Enter the number of employees : ");
        n = kb.nextInt();
        kb.nextLine();
        arrListHRM = new HumanResourceManagement[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the information of the  employee " + (i + 1) + " : ");
            HumanResourceManagement arrList = new HumanResourceManagement();
            arrList.input();
            arrListHRM[i] = arrList;
        }
    }

    public String outputList() {
        String listString = " ";
        for (int i = 0; i < n; i++) {
            listString += ("\nInformation of the employee " + (i + 1) + " : " + arrListHRM[i].output());
        }
        return listString;
    }

    public void addQueue() {
        for (int i = 0; i < n; i++) {

            if (arrListHRM[i].getSex().equals("nu") || arrListHRM[i].getSex().equals("Nu") || arrListHRM[i].getSex().equals("NU")) {
                female.add(arrListHRM[i].output());
            } else {
                male.add(arrListHRM[i].output());
            }
        }
    }

    public void printFemaleQueue() {
        System.out.println("----------Female---------");
        while (!female.isEmpty()) {
            System.out.println(female.poll());
        }
    }

    public void prinMaleQueue() {
        System.out.println("-----------Male----------");
        while (!male.isEmpty()) {
            System.out.println(male.poll());
        }
    }

    public static void main(String[] args) {
        ListHuManResourceManagement listHuManResourceManagement = new ListHuManResourceManagement();
        listHuManResourceManagement.inputList();
        System.out.println(listHuManResourceManagement.outputList());
        listHuManResourceManagement.addQueue();
        listHuManResourceManagement.printFemaleQueue();
        listHuManResourceManagement.prinMaleQueue();
    }
}
