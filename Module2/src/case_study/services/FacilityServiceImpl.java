package case_study.services;

import case_study.model.Facility;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;

import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    Map<String, Facility> linkedHashMap = new LinkedHashMap<>();
    private static Scanner kb = new Scanner(System.in);
    public void display() {
        for (Map.Entry<String , Facility> element : linkedHashMap.entrySet()) {
            System.out.println("Service" + element.getKey() + "Số lần đã thuê: "+ element.getValue());
        }
    }

    @Override
    public void displayMainTain() {

    }

    @Override
    public void add() {
        int choose;
        do {
            System.out.println("\nBan muon them dich vu gi : "+
                    "\n1. Add new Villa "+
                    "\n2. Add new House "+
                    "\n3. Add new Room "+
                    "\n4. Back to Menu ");
            System.out.println("Nhap so tuong ung voi dich vu ban chon : ");
            choose=kb.nextInt();
            kb.nextLine();
            if (choose==1){
                System.out.println("---------Add new Villa--------");
                Villa villa = new Villa();
                villa.input();
                linkedHashMap.put(villa.getServiceName(),villa);
                System.out.println("Them dich vu thanh cong");
            }else {
                if (choose==2){
                    System.out.println("-----------Add new House-------------");
                    House house = new House();
                    house.input();
                    linkedHashMap.put(house.getServiceName(),house);
                }else {
                    if (choose==3){
                        System.out.println("-----------Add new Room-------------");
                        Room room = new Room();
                        room.input();
                        linkedHashMap.put(room.getServiceName(),room);
                    }
                }
            }
        }while (choose!=4||choose<1||choose>4);
    }

    public void display(Class clazz) {
        for (Map.Entry<String, Facility> element : linkedHashMap.entrySet()) {
            Facility facility = element.getValue();
            if (clazz.isInstance(facility)) {
                System.out.println("Service" + element.getKey() + "Số lần đã thuê: "+ facility.toString());
            }
        }
    }

    public static void main(String[] args) {
        FacilityService facilityService = new FacilityServiceImpl();
        facilityService.add();
    }
}
