package thi.he_thong_ngan_hang;

import thi.exception.DateException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NganHanEpl {
    List<LaiNganHan>laiNganHanList = new ArrayList<>();
    int size=0;
    public void addBankNgan() throws DateException {
        int numberBank;
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap so luong so tiet kiem ngan han can them : ");
        numberBank=kb.nextInt();
        kb.nextLine();
        size = size + numberBank;
        for (int i = 0; i < numberBank; i++) {
            int choose;
            System.out.println("Nhap thong tin so tiet kiem them thu " + (i + 1) + " : ");
            LaiNganHan laiNganHan = new LaiNganHan();
            laiNganHan.input();
            laiNganHanList.add(laiNganHan);
        }

    }

    public void printNgan() {
        System.out.println("----------------Danh sach nhan vien------------------");
        for (int i = 0; i < laiNganHanList.size(); i++) {
            System.out.println("\nNhan vien thu " + (i + 1) + " la : \n" + laiNganHanList.get(i).output());
            System.out.println("--------------------------------------------");
        }
        System.out.println("---------------------$$$$$$$-----------------------");
    }

    public void deleteBank() {
        int idDelete;
        int count = 0;
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap ma so so ban muon xoa :");
        idDelete = kb.nextInt();
        for (int i = 0; i < laiNganHanList.size(); i++) {
            if (laiNganHanList.get(i).getMaSoSo() == idDelete) {
                laiNganHanList.remove(i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Khong tim thay ma so so muon xoa ");
        }
    }
}
