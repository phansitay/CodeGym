package thi_lai_module_2.model;

public class SanPhamNhapKhau extends SanPham {
    private int giaNK;
    private String tinhNK;
    private int thueNK;

    public SanPhamNhapKhau() {
    }

    public SanPhamNhapKhau(int idSp, String maSp, String tenSp, int giaBan, int soLuong, String nhaSX, int giaNK, String tinhNK, int thueNK) {
        super(idSp, maSp, tenSp, giaBan, soLuong, nhaSX);
        this.giaNK = giaNK;
        this.tinhNK = tinhNK;
        this.thueNK = thueNK;
    }

    public int getGiaNK() {
        return giaNK;
    }

    public void setGiaNK(int giaNK) {
        this.giaNK = giaNK;
    }

    public String getTinhNK() {
        return tinhNK;
    }

    public void setTinhNK(String tinhNK) {
        this.tinhNK = tinhNK;
    }

    public int getThueNK() {
        return thueNK;
    }

    public void setThueNK(int thueNK) {
        this.thueNK = thueNK;
    }

    public String toString() {
        return "SanPhamNhapKhau{" +
                "giaNhapKhau='" + giaNK + '\'' +
                ",tinhThanhNhap='" + tinhNK + '\'' +
                ",thueNhapKhau='" + thueNK + '\'' +
                '}' + super.toString();
    }

    public String toData() {
        return String.format("%s,%s,%s",super.toData(), giaNK, tinhNK, thueNK);
    }
}
