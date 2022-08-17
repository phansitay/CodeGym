package ss11_dsa_stack_queue.demerging_using_queue;

import java.util.Scanner;

public class HumanResourceManagement {
    private String name;
    private String sex;
    private String dayOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    Scanner kb = new Scanner(System.in);

    public void input() {
        System.out.println("Enter name : ");
        name = kb.nextLine();
        System.out.println("Enter sex : ");
        sex = kb.nextLine();
        System.out.println("Enter dayOfBirth : ");
        dayOfBirth = kb.nextLine();
    }
    public String output(){
        String string;
        string=("\nName is : "+name+"\nSex is : "+sex+"\nDayOfBirth is : "+dayOfBirth);
        return string;
    }
    public static void main(String[] args) {
        HumanResourceManagement humanResourceManagement=new HumanResourceManagement();
    }
}
