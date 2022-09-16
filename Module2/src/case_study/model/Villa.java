package case_study.model;

import javax.swing.*;
import java.util.Scanner;

public class Villa extends Facility {
    private String roomStandard;
    private double areaPool;
    private int numberOfFloors;

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(){}
    public Villa(String serviceName, double area, double price, int maxPerson, String rentalType,String roomStandard, double areaPool, int numberOfFloors){
        super();
        this.roomStandard=roomStandard;
        this.areaPool=areaPool;
        this.numberOfFloors=numberOfFloors;
    }

    Scanner kb = new Scanner(System.in);
    public void input(){
        super.input();
        System.out.println("Nhap tieu chuan phong : ");
        roomStandard=kb.nextLine();
        System.out.println("Nhap dien tich ho boi : ");
        areaPool=kb.nextInt();
        System.out.println("Nhap so tang : ");
        numberOfFloors=kb.nextInt();
        kb.nextLine();
    }
    public String output(){
        String stringVilla;
        stringVilla=super.output()+
                "\nTieu chuan phong la : "+getRoomStandard()+
                "\nDien tich ho boi la : "+getAreaPool()+
                "\nSo tang cua Villa la : "+getNumberOfFloors();
        return stringVilla;
    }
    public static void main(String[] args) {
        Villa villa = new Villa();
        villa.input();
        System.out.println(villa.output());
    }
}
