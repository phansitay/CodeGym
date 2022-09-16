package case_study.model;

import java.util.Scanner;

public class Facility {
    private String serviceName;
    private double area;
    private double price;
    private int maxPerson;
    private String rentalType;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public String getRentaType() {
        return rentalType;
    }

    public void setRentaType(String rentalType) {
        this.rentalType = rentalType;
    }

    public Facility(){}

    public Facility(String serviceName, double area, double price, int maxPerson, String rentalType) {
        this.serviceName = serviceName;
        this.area = area;
        this.price = price;
        this.maxPerson = maxPerson;
        this.rentalType = rentalType;
    }

    Scanner kb = new Scanner(System.in);

    public void renTal(){
        int choose;
        do{
            System.out.println("\nCac kieu cho thue : "+
                    "\n1. Theo nam "+
                    "\n2. Theo thang "+
                    "\n3. Theo ngay "+
                    "\n4. Theo gio ");
            System.out.println("Moi ban nhap so tuong ung voi kieu ban can thue : ");
            choose=kb.nextInt();
            kb.nextLine();
            if(choose==1){
                setRentaType("Theo nam");
            }else {
                if (choose==2){
                    setRentaType("Theo thang");
                }else {
                    if (choose==3){
                        setRentaType("Theo ngay");
                    }else {
                        if (choose==4){
                            setRentaType("Theo gio");
                        }
                    }
                }
            }

        }while (choose<1||choose>4);
    }
    public void input(){
        System.out.println("Nhap ten dich vu : ");
        serviceName = kb .nextLine();
        System.out.println("Nhap dien tich : ");
        area=kb.nextInt();
        System.out.println("Nhap gia : ");
        price =kb.nextDouble();
        System.out.println("Nhap so luong nguoi toi da : ");
        maxPerson=kb.nextInt();
        kb.nextLine();
        renTal();
    }
    public String output(){
        String stringFacility;
        stringFacility="\nTen dich vu la : "+getServiceName()+
                "\nDien tich la : "+getArea()+
                "\nGia ca la : "+getPrice()+
                "\nSo luong nguoi toi da la : "+getMaxPerson()+
                "\nKieu thue la : "+getRentaType();
        return stringFacility;
    }
    public static void main(String[] args) {
        Facility facility= new Facility();
        facility.input();
        System.out.println(facility.output());

    }
}
