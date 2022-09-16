package thi.he_thong_ngan_hang;

import thi.exception.DateException;

import java.util.Date;
import java.util.Scanner;

public class DaiHan extends NganHang {
    private int kyHan;
    private String uuDai;

    Scanner kb = new Scanner(System.in);
    public DaiHan() {
    }

    public DaiHan(Scanner kb, int maSoSo, int maKhachHang, Date ngayMoSo, Date thoiGianBatDauGui, double soTienGui, double laiXuat, int kyHan, String uuDai) {
        super();
        this.kyHan = kyHan;
        this.uuDai = uuDai;
    }

    public int getKyHan() {
        return kyHan;
    }

    public void setKyHan(int kyHan) {
        this.kyHan = kyHan;
    }

    public String getUuDai() {
        return uuDai;
    }

    public void setUuDai(String uuDai) {
        this.uuDai = uuDai;
    }

    public void inputDaiHan() throws DateException {
        super.input();
        kb.nextLine();
        System.out.println("Moi ban nhap ki han cua lai xuat dai han : ");
        kyHan=kb.nextInt();
        kb.nextLine();
        System.out.println("Moi ban nhap uu dai cua lai xuat dai han : ");
        uuDai=kb.nextLine();
    }
    public String outputDaiHan(){
        String stringDaiHan;
        stringDaiHan=super.output()+
                "\nKi han : "+getKyHan()+
                "\nUu dai : "+getUuDai();
        return stringDaiHan;
    }

    public static void main(String[] args) {
    }

}
