-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
use quanlykhunghiduongfurama;
select *from nhanvien;
select *from nhanvien
where hoten like 'h%'or hoten like 't%' or hoten like 'k%' and length(hoten)<=15;

-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select *from khachhang;
select *from khachhang
where year(curdate())-year(ngaysinh)>=18 and year(curdate())-year(ngaysinh)<=50 and (diachi like '%đà nẵng' or diachi like '%quảng trị');

-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng.
--  Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select *from hopdong;
select k.makhachhang,k.hoten,count(h.makhachhang) as 'số lần đặt phòng'
from khachhang as k join hopdong as h on k.makhachhang=h.makhachhang
where k.maloaikhach=1
group by h.makhachhang
order by count(h.makhachhang) asc;


-- 5 Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien (Với tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet) cho tất cả các khách hàng đã từng đặt phòng. (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
select *from hopdong;
select *from loaikhach;
select *from dichvu;
select kh.makhachhang,kh.hoten,l.tenloaikhach,h.mahopdong,d.tendichvu,h.ngaylamhopdong,h.ngayketthuc,sum(d.chiphithue+hdct.soluong*dvdk.gia)
from khachhang as kh join hopdong as h on kh.makhachhang = h.makhachhang
join loaikhach as l on kh.maloaikhach=l.maloaikhach
join dichvu as d on h.madichvu=d.madichvu
join hopdongchitiet as hdct on h.mahopdong=hdct.mahopdong
join dichvudikem as dvdk on hdct.madichvudikem=dvdk.madichvudikem;

-- 6.	Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu của tất cả các loại dịch vụ chưa từng được khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).

select d.madichvu,d.tendichvu,d.dientich,d.chiphithue,ldv.tenloaidichvu 
from dichvu as d
join loaidichvu as ldv on d.maloaidichvu=ldv.maloaidichvu
where d.madichvu not in
(
	select d.madichvu
    from dichvu as d
	join hopdong as hd on d.madichvu=hd.madichvu
	where month(ngaylamhopdong)>=1 and month(ngaylamhopdong)<=3 and year(ngaylamhopdong)=2021
);

-- 7.	Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu 
-- của tất cả các loại dịch vụ đã từng được khách hàng đặt phòng trong năm 2020 nhưng chưa từng được khách hàng đặt phòng trong năm 2021.

select  d.madichvu,d.tendichvu,d.dientich,d.songuoitoida,d.chiphithue,ldv.tenloaidichvu 
from dichvu as d join loaidichvu as ldv on d.maloaidichvu = ldv.maloaidichvu
where d.madichvu not in(
	select 
		d.madichvu
	from dichvu as d
    join hopdong as hd on d.madichvu=hd.madichvu
	where year(hd.ngaylamhopdong)=2021
);

--  8.	Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên.
-- C1 
select hoten 
from khachhang 
group by hoten;
-- C2
select hoten  from khachhang union select hoten  from khachhang;
-- C3
select distinct hoten from khachhang;

-- 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2021 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.

select month(ngaylamhopdong) as thang,count(makhachhang)
from hopdong
where year(ngaylamhopdong)=2021
group by thang
order by thang asc;

-- 10.	Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem). 
select h.mahopdong,h.ngaylamhopdong,h.ngayketthuc,h.tiendatcoc,ifnull(sum(hdct.soluong),0)
from hopdong as h
left join  hopdongchitiet as hdct on h.mahopdong=hdct.mahopdong
group by h.mahopdong;

-- 11.	Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng có ten_loai_khach là “Diamond” và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.
select dvdk.madichvudikem,dvdk.tendichvudikem 
from dichvudikem as dvdk join hopdongchitiet as hdct on dvdk.madichvudikem =hdct.madichvudikem
join hopdong as hd on hdct.mahopdong=hd.mahopdong
join khachhang as kh on hd.makhachhang=kh.makhachhang
join loaikhach as lk on kh.maloaikhach=lk.maloaikhach
where lk.tenloaikhach='diamond' and (kh.diachi like '%vinh' or kh.diachi like '%quảng ngãi');

-- 12.	Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), 
-- so_dien_thoai (khách hàng), ten_dich_vu, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem),
--  tien_dat_coc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.
select *from khachhang;
select *from nhanvien;
select *from hopdong;
select hd.mahopdong,nv.hoten,kh.hoten,kh.sodienthoai,dv.tendichvu,ifnull(sum(hdct.soluong),0),hd.tiendatcoc
from hopdong as hd
join  nhanvien as nv on hd.manhanvien=nv.manv
join khachhang as kh on hd.makhachhang=kh.makhachhang
join dichvu as dv on hd.madichvu =dv.madichvu
join hopdongchitiet as hdct on hd.mahopdong=hdct.mahopdong
-- where month(hd.ngaylamhopdong)>=10 and year(hd.ngaylamhopdong)=2020 -- and not (month(hd.ngaylamhopdong)<=6 and year(hd.ngaylamhopdong)=2021)
group by mahopdong;

-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
select dvdk.madichvudikem,dvdk.tendichvudikem,sum(soluong) as soluongdichvudikem
from dichvudikem as dvdk join hopdongchitiet as hdct on dvdk.madichvudikem=hdct.madichvudikem
group by madichvudikem
having  soluongdichvudikem >=all(select sum(soluong) from hopdongchitiet group by madichvudikem);

-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung (được tính dựa trên việc count các ma_dich_vu_di_kem).
select hd.mahopdong,ldv.tenloaidichvu,dvdk.tendichvudikem,count(dvdk.madichvudikem) as solansudung
from hopdong as hd join dichvu as dv on hd.madichvu=dv.madichvu
join loaidichvu as ldv on dv.maloaidichvu = ldv.maloaidichvu
join hopdongchitiet as hdct on hd.mahopdong=hdct.mahopdong
join dichvudikem as dvdk on hdct.madichvudikem=dvdk.madichvudikem
group by dvdk.madichvudikem
having solansudung=1
order by mahopdong asc;

-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten, 
-- ten_trinh_do, ten_bo_phan, so_dien_thoai, dia_chi mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.
