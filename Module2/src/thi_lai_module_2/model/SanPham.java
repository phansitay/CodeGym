package thi_lai_module_2.model;

public abstract class SanPham {
    private int idSp;
    private String maSp;
    private String tenSp;
    private int giaBan;
    private int soLuong;
    private String nhaSX;

    public SanPham() {
    }

    public SanPham(int idSp, String maSp, String tenSp, int giaBan, int soLuong, String nhaSX) {
        this.idSp = idSp;
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nhaSX = nhaSX;
    }

    public int getIdSp() {
        return idSp;
    }

    public void setIdSp(int idSp) {
        this.idSp = idSp;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public String toString() {
        return "SanPham{" +
                "idSp=" + idSp +
                ", maSp='" + maSp + '\'' +
                ", tenSp=" + tenSp +
                ", giaBan='" + giaBan + '\'' +
                ", soLuong='" + soLuong + '\'' +
                ", nhaSx='" + nhaSX + '\'' +
                '}';
    }
    public String toData(){
        return String.format("%s,%s,%s,%s,%s,%s",idSp,maSp,tenSp,giaBan,soLuong,nhaSX);
    }


}
