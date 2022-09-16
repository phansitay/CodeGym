package thi.he_thong_ngan_hang;

import thi.exception.DateException;

import java.util.ArrayList;
import java.util.Scanner;

public class DaihanEpl {
    ArrayList<DaiHan> arrayListDaiHan=new ArrayList<>();
    int size=0;
    Scanner kb = new Scanner(System.in);
    public void addBankDai() throws DateException {
        int numberBank;
        System.out.println("Nhap so luong so tiet kiem can them : ");
        numberBank=Integer.parseInt(kb.nextLine());
        kb.nextLine();
        size = size + numberBank;
        for (int i = 0; i < numberBank; i++) {
            System.out.println("Nhap thong tin so tiet kiem them thu " + (i + 1) + " : ");
            DaiHan daiHan = new DaiHan();
            daiHan.input();
            arrayListDaiHan.add(daiHan);
        }
    }

    public void printDai() {
        System.out.println("----------------Danh sach nhan vien------------------");
        for (int i = 0; i < arrayListDaiHan.size(); i++) {
            System.out.println("\nNhan vien thu " + (i + 1) + " la : \n" + arrayListDaiHan.get(i).output());
            System.out.println("--------------------------------------------");
        }
        System.out.println("---------------------$$$$$$$-----------------------");
    }

    public void deleteBank() {
        int idDelete;
        int count = 0;
        System.out.println("Nhap ma so so ban muon xoa :");
        idDelete = kb.nextInt();
        for (int i = 0; i < arrayListDaiHan.size(); i++) {
            if (arrayListDaiHan.get(i).getMaSoSo() == idDelete) {
                arrayListDaiHan.remove(i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Khong tim thay ma so so muon xoa ");
        }
    }
}
