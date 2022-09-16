package thi.he_thong_ngan_hang;

import thi.exception.DateException;

import java.util.Date;
import java.util.Scanner;

public class LaiNganHan extends NganHang {
    private int kiHan;

    public LaiNganHan() {
    }

    public LaiNganHan(int maSoSo, int maKhachHang, Date ngayMoSo, Date thoiGianBatDauGui, double soTienGui, double laiXuat, int kiHan) {
        super();
        this.kiHan = kiHan;
    }

    public int getKiHan() {
        return kiHan;
    }

    public void setKiHan(int kiHan) {
        this.kiHan = kiHan;
    }
    public void input() throws DateException {
        int choose;
        Scanner kb = new Scanner(System.in);
        super.input();
        do {
            System.out.println("\nMoi ban nhap so tuong ung voi loai lai ngan hang ban muon chon: "+
                    "\n1. So tiet kiem vo thoi han."+
                    "\n2. So tiet kiem co thoi han."+
                    "\n3. Return Menu.");
            System.out.println("Moi ban chon so : ");
            choose=kb.nextInt();
            kb.nextLine();
            if (choose==1){
                System.out.println("------------So tiet kiem vo thoi han-------------");
                break;
            }else {
                if (choose==2){
                    System.out.println("------------So tiet kiem co thoi han-------------");
                    System.out.println("Moi ban nhap ki han gui cua so tiet kiem co thoi han : ");
                    kiHan=kb.nextInt();
                    kb.nextLine();
                    break;
                }
            }
        }while (choose!=3||choose>3||choose<1);
    }
    public String output(){
        String stringNganhan;
        stringNganhan=super.output()+
                "\nKi han : "+getKiHan();
        return stringNganhan;
    }

    public static void main(String[] args) throws DateException {
        LaiNganHan laiNganHan= new LaiNganHan();
        laiNganHan.input();
        System.out.println(laiNganHan.output());
    }
}
