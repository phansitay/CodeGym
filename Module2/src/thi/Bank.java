package thi;

import thi.exception.DateException;
import thi.he_thong_ngan_hang.DaiHan;
import thi.he_thong_ngan_hang.DaihanEpl;
import thi.he_thong_ngan_hang.LaiNganHan;
import thi.he_thong_ngan_hang.NganHanEpl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    Scanner kb = new Scanner(System.in);
    List<DaiHan> arrayListDaiHan = new ArrayList<>();
    public static final String DELIMITER = ",";
    public void menu() throws DateException {
        int choose;
        do {
            System.out.println("--------CHUONG TRINH QUAN LY SO TIET KIEM---------");
            System.out.println("Chon chuc nang theo so de tiep tuc : "+
                    "\n1. Them so tiet kiem."+
                    "\n2. Xoa so tiet kiem."+
                    "\n3. Xem danh sach so tiet kiem."+
                    "\n4. Thoat.");
            System.out.println("\nMoi ban chon so tuong ung theo chuc nang : ");
            choose=kb.nextInt();
            kb.nextLine();
            if (choose==1){
                int choose1;
                do {
                    System.out.println("Ban muon them so tiet kiem gi : ");
                    System.out.println("\n1. Dai han."+
                            "\n2. Ngan han."+
                            "\n3. return.");
                    System.out.println("nhap so tuong ung ");
                    choose1=kb.nextInt();
                    kb.nextLine();
                    if (choose1==1){
                        DaihanEpl daihanEpl=new DaihanEpl();
                        daihanEpl.addBankDai();
                    }else {
                        if (choose1==2){
                            NganHanEpl nganHanEpl = new NganHanEpl();
                            nganHanEpl.addBankNgan();
                        }
                    }
                }while (choose1!=3||choose1<1||choose1>3);


            }else {
                if (choose==2){
                    int choose2;
                    do {
                        System.out.println("Ban muon xoa gi : "+
                                "\n1.dai"+
                                "\n2. ngan"+
                                "\n3.return");
                        System.out.println("Nhap so tuong ung ");
                        choose2=kb.nextInt();
                        kb.nextLine();
                        if (choose2==1){
                            DaihanEpl daihanEpl= new DaihanEpl();
                            daihanEpl.deleteBank();
                        }else {
                            if (choose2==2){
                                NganHanEpl nganHanEpl= new NganHanEpl();
                                nganHanEpl.deleteBank();
                            }
                        }
                    }while (choose2!=2||choose2<1||choose2>3);
                }else {
                    if (choose==3){
                        int choose3;
                        do {
                            System.out.println("Ban muon in ngan han hay dai han : ");
                            System.out.println("\n1. dai han"+
                                    "\n2. ngan han"+
                                    "\n3. return");
                            System.out.println("Nhap so");
                            choose3=kb.nextInt();
                            kb.nextLine();
                            if (choose3==1){
                                DaihanEpl daihanEpl= new DaihanEpl();
                                daihanEpl.printDai();
                            }else {
                                if (choose3==2){
                                    NganHanEpl nganHanEpl=new NganHanEpl();
                                    nganHanEpl.printNgan();
                                }
                            }
                        }while (choose3!=3||choose3<1||choose3>3);
                    }
                }
            }
        }while (choose!=4||choose<1||choose>4);
    }

    public static void writeFile(String path, List<DaiHan> daiHans, boolean append) {
        BufferedWriter writer = null;
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path, append);
            writer = new BufferedWriter(fileWriter);
            for (DaiHan daiHan: daiHans) {
                // tsv, csv
                writer.write(daiHan.getMaSoSo() + DELIMITER
                        + daiHan.getMaKhachHang() + DELIMITER
                        +daiHan.getNgayMoSo()+DELIMITER
                        +daiHan.getThoiGianBatDauGui()+DELIMITER
                        +daiHan.getSoTienGui()+DELIMITER
                        +daiHan.getLaiXuat()+DELIMITER
                        +daiHan.getKyHan());
                writer.newLine();
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws DateException {
        Bank bank= new Bank();
//        List<DaiHan> arrayListDaiHan = new ArrayList<>();
////        DaiHan daiHan=new DaiHan(12,12,"12/09/2001","12/09/2001",12,12,12,"khong");
//        daiHan.outputDaiHan();
//        System.out.println(arrayListDaiHan.add(daiHan));
//        writeFile("bank.csv", arrayListDaiHan ,false);
//        File file = new File("sample.txt");
        bank.menu();
    }
}
