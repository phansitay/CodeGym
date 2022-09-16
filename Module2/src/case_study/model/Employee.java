package case_study.model;

import java.util.Scanner;

public class Employee extends Person {
    private int nameId;
    private String level;
    private String location;
    private double salary;

    public int getNameId() {
        return nameId;
    }

    public void setNameId(int nameId) {
        this.nameId = nameId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(String name, String date, String sex, int cmnd, int phone, String email, int nameId, String level, String location, double salary) {
        super();
        this.nameId = nameId;
        this.level=level;
        this.location=location;
        this.salary=salary;
    }

    Scanner kb = new Scanner(System.in);
    public void level(){
        int choose;
        do {
            System.out.println("----Cac trinh do----");
            System.out.println("\n1. Trung cap " + "" +
                    "\n2. Cao dang " + "" +
                    "\n3. Dai hoc " + "" +
                    "\n4. Sau dai hoc ");
            System.out.println("Moi ban nhap so tuong ung voi trinh do cua ban : ");
            choose=kb.nextInt();
            if (choose == 1) {
                setLevel("Trung cap");
            } else {
                if (choose == 2) {
                    setLevel("Cao dang");
                } else {
                    if (choose == 3) {
                        setLevel("Dai hoc");
                    } else {
                        if(choose==4){
                            setLevel("Sau dai hoc ");
                        }
                    }
                }
            }
        } while (choose<1||choose>4);
    }
    public void location(){
        int chooseLocation;
        do{
            System.out.println("-------Cac vi tri---------");
            System.out.println("\n1. Le tan"+"\n2. Phuc vu"+"\n3. Chuyen vien"+
                    "\n4. Giam sat"+"\n5. Quan ly"+"\n6. Giam doc");
            System.out.println("Moi ban nhap so tuong ung voi vi tri cua ban :");
            chooseLocation=kb.nextInt();
            if(chooseLocation==1){
                setLocation("Le tan");
            }else {
                if(chooseLocation==2){
                    setLocation("Phuc vu");
                }else {
                    if(chooseLocation==3){
                        setLocation("Chuyen vien");
                    }else {
                        if(chooseLocation==4){
                            setLocation("Giam sat");
                        }else {
                            if(chooseLocation==5){
                                setLocation("Quan ly");
                            }else {
                                setLocation("Giam doc");
                            }
                        }
                    }
                }
            }
        }while (chooseLocation<1||chooseLocation>6);
    }
    public void input() {
        System.out.println("Moi ban nhap id cua nhan vien : ");
        nameId = kb.nextInt();
        super.input();
        level();
        location();
        System.out.println("Moi ban nhap luong cua nhan vien : ");
        salary=kb.nextDouble();
        }

        public String output(){
            String stringEmployee;
            stringEmployee="Ma nhan vien la : "+getNameId()
                    +super.output()
                    +"\nTrinh do la : "+getLevel()
                    +"\nVi tri la : "+getLocation()
                    +"\nLuong la : "+getSalary();
            return stringEmployee;
        }
        public static void main (String[]args){
        Employee employee=new Employee();
        employee.input();
            System.out.println(employee.output());
        }
    }
