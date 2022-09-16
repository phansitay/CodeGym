package thi_lai_module_2.services;

import thi_lai_module_2.exception.NotFoundException;
import thi_lai_module_2.model.SanPham;

import java.util.List;

public interface SanPhamInterface {
    public void delete(int id) throws NotFoundException;
    public void danhSachSP();
    public List<SanPham> search(String name);
}
