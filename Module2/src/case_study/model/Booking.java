package case_study.model;

import java.util.Scanner;

public class Booking {
    private int idBooking;
    private String beginDate;
    private String endDate;
    private int idCustomer;
    private String nameService;
    private String typeService;

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    Scanner kb = new Scanner(System.in);
    public  void input(){
        System.out.println("Moi ban nhap ma booking : ");
        idBooking=kb.nextInt();
        kb.nextLine();
        System.out.println("Moi ban nhap ngay bat dau : ");
        beginDate=kb.nextLine();
        System.out.println("Moi ban nhap ngay ket thuc : ");
        endDate=kb.nextLine();
        System.out.println("Moi ban nhap ma khach hang : ");

    }
    public static void main(String[] args) {

    }
}
