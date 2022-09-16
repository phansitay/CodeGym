package thi_lai_module_2.services;

import thi_lai_module_2.exception.NotFoundException;
import thi_lai_module_2.file.FileHelper;
import thi_lai_module_2.model.SanPham;
import thi_lai_module_2.model.SanPhamNhapKhau;
import thi_lai_module_2.model.SanPhamXuatKhau;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService implements SanPhamInterface{
    private List<SanPham> sanPhams = new ArrayList<>();
    private static final String PATH = "D:\\CODEGYM\\CodeGym\\Module2\\src\\thi_lai_module_2\\tay.csv";
    private FileHelper fileHelper = new FileHelper();

    public SanPhamService() {
        sanPhams = mapToSanPham();
    }
    public void themSP(SanPham sanPham) {
        int lastID = 0;
        if (sanPhams.size() >0){
            lastID = sanPhams.get(sanPhams.size() - 1).getIdSp();
        }
        sanPham.setIdSp(lastID + 1);
        sanPhams.add(sanPham);
        fileHelper.writer(PATH,sanPhams,false);
    }

    public void delete(int id) throws NotFoundException {
        for (int i = 0;i<sanPhams.size();i++){
            if (sanPhams.get(i).getIdSp() == id){
                sanPhams.remove(i);
                fileHelper.writer(PATH,sanPhams,false);
                return;
            }
        }
        throw new NotFoundException(id + " is not exists");
    }

    public List<SanPham> search(String name){
        List<SanPham> result = new ArrayList<>();
        for (int i = 0; i< sanPhams.size();i++){
            if (sanPhams.get(i).getMaSp().equalsIgnoreCase(name)){
                result.add(sanPhams.get(i));
            }
        }
        return result;
    }
    private List<SanPham> mapToSanPham() {
        List<SanPham> result = new ArrayList<>();

        List<String> lines = fileHelper.read(PATH);

        for (int i = 0; i < lines.size(); i++) {
            String[] tmp =  lines.get(i).split(",");
            int id = Integer.parseInt(tmp[0]);
            String masp = tmp[1];
            String tensp = tmp[2];
            int giaban =Integer.parseInt(tmp[3]);
            int sl =Integer.parseInt(tmp[4]);
            String nsx =tmp[5];

            if(tmp[tmp.length - 1].equals("0")){
                int giank = Integer.parseInt(tmp[6]);
                String tinh = tmp[7];
                int thue = Integer.parseInt(tmp[8]);

                SanPhamNhapKhau sanPhamNhapKhau = new SanPhamNhapKhau(id, masp,tensp,giaban,sl,nsx,giank,tinh,thue);
                result.add(sanPhamNhapKhau);

            }
            else{
                int giaxk = Integer.parseInt(tmp[6]);
                String qg = tmp[7];
                SanPhamXuatKhau sanPhamXuatKhau = new SanPhamXuatKhau(id, masp,tensp,giaban,sl,nsx,giaxk,qg);
                result.add(sanPhamXuatKhau);
            }
        }

        return result;
    }
//    public void print() {
//        System.out.println("----------------Danh San pham ---------------");
//        for (int i = 0; i < sanPhams.size(); i++) {
//            System.out.println("\nKhach hang thu " + (i + 1) + " : \n" + sanPhams.get(i).toString());
//            System.out.println("-----------------------------------------------------------");
//        }
//        System.out.println("-----------------------END------------------------");
//    }

    public List<SanPham> findAll(){
        return sanPhams;
    }
    @Override
    public void danhSachSP() {

    }
}
