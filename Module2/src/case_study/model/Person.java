package case_study.model;

import java.util.Scanner;

public class Person {
    private String name;
    private String date;
    private String sex;
    private int cmnd;
    private int phone;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person() {
    }

    ;

    public Person(String name, String date, String sex, int cmnd, int phone, String email) {
        this.name = name;
        this.date = date;
        this.sex = sex;
        this.cmnd = cmnd;
        this.phone = phone;
        this.email = email;
    }

    public void input() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Moi ban nhap ten : ");
        name = kb.nextLine();
        System.out.println("Moi ban nhap ngay sinh : ");
        date = kb.nextLine();
        System.out.println("Moi ban nhap gioi tinh : ");
        sex = kb.nextLine();
        System.out.println("Moi ban nhap so chung minh nhan dan : ");
        cmnd = kb.nextInt();
        System.out.println("Moi ban nhap so dien thoai : ");
        phone = kb.nextInt();
        kb.nextLine();
        System.out.println("Moi ban nhap email : ");
        email = kb.nextLine();
    }

    public String output() {
        String stringPerson;
        stringPerson="\nTen la : " + name
                +"\nNgay sinh la : " + date
                +"\nGioi tinh la : " + sex
                +"\nSo chung minh nhan dan la : " + cmnd
                +"\nSo dien thoai la : " + phone
                +"\nEmail la : " + email;
        return stringPerson;
    }


    public void jjđ(){
        Scanner kb = new Scanner(System.in);
        System.out.println("shsfhdf");
        String d=kb.nextLine();
    }
    public static void main(String[] args) {
        Person person = new Person();
        person.input();
        person.output();
    }
}
