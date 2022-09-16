package thi_lai_module_2.model;

public class SanPhamXuatKhau extends SanPham{
    private int giaXK;
    private String quocGiaNSP;

    public SanPhamXuatKhau() {
    }

    public SanPhamXuatKhau(int idSp, String maSp, String tenSp, int giaBan, int soLuong, String nhaSX, int giaXK, String quocGiaNSP) {
        super(idSp, maSp, tenSp, giaBan, soLuong, nhaSX);
        this.giaXK = giaXK;
        this.quocGiaNSP = quocGiaNSP;
    }

    public int getGiaXK() {
        return giaXK;
    }

    public void setGiaXK(int giaXK) {
        this.giaXK = giaXK;
    }

    public String getQuocGiaNSP() {
        return quocGiaNSP;
    }

    public void setQuocGiaNSP(String quocGiaNSP) {
        this.quocGiaNSP = quocGiaNSP;
    }

    public String toString() {
        return "SanPhamXuatKhau{" +
                "giaXuatKhau='" + giaXK + '\'' +
                ",quocGiaNhapKhau='" + quocGiaNSP + '\'' +
                '}'+super.toString();
    }
    public String toData(){
        return String.format("%s,%s",super.toData(),giaXK,quocGiaNSP);
    }
}
