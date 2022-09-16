package case_study.model;

import java.awt.*;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public House(){}
    public House(String serviceName, double area, double price, int maxPerson, String rentalType,String roomStandard, int numberOfFloors){
        super();
        this.roomStandard=roomStandard;
        this.numberOfFloors=numberOfFloors;
    }

    public void input(){
        super.input();
        System.out.println("Nhap tieu chuan phong cua House : ");
        roomStandard=kb.nextLine();
        System.out.println("Nhap so tang cua House : ");
        numberOfFloors=kb.nextInt();
        kb.nextLine();
    }
    public String output(){
        String stringHouse;
        stringHouse=super.output()+
                "\nTieu chuan phong cua House la : "+getRoomStandard()+
                "\nSo tang cua House la : "+getNumberOfFloors();
        return stringHouse;
    }
    public static void main(String[] args) {
        House house = new House();
        house.input();
        System.out.println(house.output());
    }
}
