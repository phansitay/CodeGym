package thi.he_thong_ngan_hang;

import thi.exception.DateException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NganHang {
    Scanner kb = new Scanner(System.in);
    private int maSoSo;
    private int maKhachHang;
    private Date ngayMoSo;
    private Date thoiGianBatDauGui;
    private double soTienGui;
    private double laiXuat;

    public NganHang() {
    }

    public NganHang(int maSoSo, int maKhachHang, Date ngayMoSo, Date thoiGianBatDauGui, double soTienGui, double laiXuat) {
        this.maSoSo = maSoSo;
        this.maKhachHang = maKhachHang;
        this.ngayMoSo = ngayMoSo;
        this.thoiGianBatDauGui = thoiGianBatDauGui;
        this.soTienGui = soTienGui;
        this.laiXuat = laiXuat;
    }

    public Scanner getKb() {
        return kb;
    }

    public void setKb(Scanner kb) {
        this.kb = kb;
    }

    public int getMaSoSo() {
        return maSoSo;
    }

    public void setMaSoSo(int maSoSo) {
        this.maSoSo = maSoSo;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public Date getNgayMoSo() {
        return ngayMoSo;
    }

    public void setNgayMoSo(Date ngayMoSo) {
        this.ngayMoSo = ngayMoSo;
    }

    public Date getThoiGianBatDauGui() {
        return thoiGianBatDauGui;
    }

    public void setThoiGianBatDauGui(Date thoiGianBatDauGui) {
        this.thoiGianBatDauGui = thoiGianBatDauGui;
    }

    public double getSoTienGui() {
        return soTienGui;
    }

    public void setSoTienGui(double soTienGui) {
        this.soTienGui = soTienGui;
    }

    public double getLaiXuat() {
        return laiXuat;
    }

    public void setLaiXuat(double laiXuat) {
        this.laiXuat = laiXuat;
    }

    public void ktNgayMoSo() throws DateException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ngay mo so (dd/MM/yyyy):");
        String dateAsString = scanner.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            ngayMoSo = format.parse(dateAsString);
        } catch (ParseException e) {
            throw new DateException("Ngay mo so khong hop le");
        }
        System.out.println("None error");
        System.out.println(dateAsString);
    }

    public void ktNgayGui() throws DateException {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Nhap vao ngay gui tien (dd/MM/yyyy):");
        String dateAsString = scanner.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            thoiGianBatDauGui = format.parse(dateAsString);
        } catch (ParseException e) {
            throw new DateException("Ngay gui tien khong hop le");
        }
        System.out.println("None error");
        System.out.println(dateAsString);
    }

    public void input() throws DateException {
        System.out.println("Moi ban nhap ma so so : ");
        maSoSo = kb.nextInt();
        System.out.println("Moi ban nhap ma khach hang : ");
        maKhachHang = kb.nextInt();
        kb.nextLine();
        ktNgayMoSo();
        kb.nextLine();
        ktNgayGui();
        kb.nextLine();
        kb.nextLine();
        System.out.println("Moi ban nhap vao so tien gui : ");
        soTienGui = kb.nextDouble();
        kb.nextLine();
        System.out.println("Moi ban nhap lai xuat : ");
        laiXuat = kb.nextDouble();
        kb.nextLine();
    }

    public String output() {
        String stringNganHang;
        stringNganHang = "\nMa so so : " + getNgayMoSo() +
                "\nMa khach hang : " + getMaKhachHang() +
                "\nNgay mo so : " + getNgayMoSo().toString() +
                "\nThoi gian bat dau gui tien : " + getThoiGianBatDauGui().toString() +
                "\nSo tien gui : " + getSoTienGui() +
                "\nLai xuat : " + getLaiXuat();
        return stringNganHang;
    }


    public static void main(String[] args) throws DateException {
        NganHang nganHang= new NganHang();
        nganHang.input();
        System.out.println(nganHang.output());
    }
}
