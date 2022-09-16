package thi_lai_module_2.main;

import thi_lai_module_2.exception.NotFoundException;
import thi_lai_module_2.model.SanPham;
import thi_lai_module_2.model.SanPhamNhapKhau;
import thi_lai_module_2.model.SanPhamXuatKhau;
import thi_lai_module_2.services.SanPhamService;
import thi_lai_module_2.validate.valid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuMain {
    Scanner kb = new Scanner(System.in);
    List<SanPhamService>sanPhamServices = new ArrayList<>();
    private SanPhamService sanPhamService= new SanPhamService();
    public void main(){
        int choose;
        do {
            System.out.println("---CHUONG TRINH QUAN LY SAN PHAM---");
            System.out.println("Chon chuc nang theo so(de tiep tuc) : "+
                    "\n1. Them moi."+
                    "\n2. Xoa."+
                    "\n3. Xem danh sach san pham."+
                    "\n4. Tim kiem."+
                    "\n5. Thoat.");
            System.out.println("\nChon chuc nang : ");
            choose=kb.nextInt();
            kb.nextLine();
            if (choose==1){
                addSP();
            }else {
                if (choose==2){
                    delete();
                }else {
                    if (choose==3){
                        display1();
                    }else {
                        if (choose==4){
                            search();
                        }else if (choose==5){

                        }
                    }
                }
            }
        }while (choose!=5||choose<1||choose>5);
    }

    private int getChoice(){
        System.out.print("Enter your choice:");
        return  Integer.parseInt(kb.nextLine());
    }
    public void addSP(){
        int choose;
        do {
            System.out.println("1.San pham Nhap khau. "+
                    "\n2.San pham xuat khau."+
                    "\n3.Return");
            choose = getChoice();
            String masp="";
            if (choose==1){
                SanPham sanPham;
                do {
                    System.out.println("Nhap ma san pham ");
                    masp=kb.nextLine();
                }while (!valid.checkName(masp));
                String tenSp=" ";
                do {
                    System.out.println("Nhap ten sp : ");
                    tenSp=kb.nextLine();
                }while (!valid.moreThan0(tenSp));
                System.out.println("Nhap gia ban ");
                int gia = kb.nextInt();
                kb.nextLine();
                System.out.println("Nhap so luong : ");
                int soluong = kb.nextInt();
                kb.nextLine();
                System.out.println("Nhap nha san xuat : ");
                String nsx=kb.nextLine();
                System.out.println("Nhap gia nhap khau : ");
                int gnk = kb.nextInt();
                kb.nextLine();
                System.out.println("Nhap tinh thanh nhap : ");
                String tinh =kb.nextLine();
                System.out.println("Nhap thue ");
                int thue =kb.nextInt();
                kb.nextLine();
                sanPham = new SanPhamNhapKhau(0,masp,tenSp,gia,soluong,nsx,gnk,tinh,thue);
                sanPhamService.themSP(sanPham);
                System.out.println("-------Them xuat khau thanh cong---------");

            }else {
                if (choose==2){
                    SanPham sanPham;
                    do {
                        System.out.println("Nhap ma san pham ");
                        masp=kb.nextLine();
                    }while (!valid.checkName(masp));
                    String tenSp=" ";
                    do {
                        System.out.println("Nhap ten sp : ");
                        tenSp=kb.nextLine();
                    }while (!valid.moreThan0(tenSp));
                    System.out.println("Nhap gia ban ");
                    int gia = kb.nextInt();
                    kb.nextLine();
                    System.out.println("Nhap so luong : ");
                    int soluong = kb.nextInt();
                    kb.nextLine();
                    System.out.println("Nhap nha san xuat : ");
                    String nsx=kb.nextLine();
                    System.out.println("Nhap gia xuat khau : ");
                    int gnk = kb.nextInt();
                    kb.nextLine();
                    System.out.println("Nhap quoc gia nhap khau : ");
                    String qg =kb.nextLine();
                    sanPham = new SanPhamXuatKhau(0,masp,tenSp,gia,soluong,nsx,gnk,qg);
                    sanPhamService.themSP(sanPham);
                    System.out.println("-------Them nhap khau thanh cong---------");
                }
            }
        }while (choose!=3||choose<1||choose>3);

    }
    public void delete(){
        boolean tmp = false;
        do{
            System.out.print(tmp ? "Nhap id can xoa :" : "Nhap id can xoa :");
            int id =Integer.parseInt(kb.nextLine());
            try{
                sanPhamService.delete(id);
                System.out.println("Deleted successfully");
                tmp = false;

            }catch (NotFoundException e){
                System.out.println(e.getMessage());
                tmp = true;
            }
        }while (tmp);
    }

    public void display1(){
        List<SanPham> sanPhams = sanPhamService.findAll();
        for (int i = 0;i<sanPhams.size();i++){
            System.out.println(sanPhams.get(i));
        }
    }

//    private String inputWithEmpty(String field){
//        String val = "0";
//        do{
//            System.out.print(val.isEmpty() ? "Invalid format. Input again:": field+ ":");
//            val = kb.nextLine();
//        }while (val.trim().isEmpty());
//
//        return val;
//    }

    public void search(){
        System.out.println("Nhap ma san pham can tim :");
        String name = kb.nextLine();
        List<SanPham> sanPhams = sanPhamService.search(name);
        if (sanPhams.size() > 0){
            for (int i = 0; i< sanPhams.size();i++){
                if (sanPhams.get(i).getMaSp().contains(name)){
                    System.out.println(sanPhams.get(i));
                }
            }
        }else {
            System.out.println("tim khong thayt");
        }
    }
    public static void main(String[] args) {
        MenuMain menuMain=new MenuMain();
        menuMain.main();
    }
}
