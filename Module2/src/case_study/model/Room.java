package case_study.model;

import java.util.Scanner;

public class Room extends Facility {
    private String serviceFree;

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(){}
    public Room(String serviceName, double area, double price, int maxPerson, String rentalType,String serviceFree){
        super();
        this.serviceFree=serviceFree;
    }

    Scanner kb = new Scanner(System.in);
    public void input(){
        super.input();
        System.out.println("Nhap dich vu di kem cua Room : ");
        serviceFree=kb.nextLine();
    }
    public String output(){
        String stringRoom;
        stringRoom=super.output()+
                "\nDich vu di kem la : "+getServiceFree();
        return stringRoom;
    }
    public static void main(String[] args) {
        Room room = new Room();
        room.input();
        System.out.println(room.output());
    }
}
