create database quanlykhunghiduongfurama;
use quanlykhunghiduongfurama;

create table vitri
(
mavt int primary key auto_increment,
tenvt varchar(50)
);

create table trinhdo
(
matrinhdo int primary key auto_increment,
tentrinhdo varchar(50)
);
create table bophan
(
mabophan int primary key auto_increment,
tenbophan varchar(50)
);
create table nhanvien
(
manv int primary key auto_increment,
hoten varchar(50),
ngaysinh date,
socmnd varchar(20),
luong int,
sodienthoai varchar(12),
email varchar(50),
diachi varchar(100),
mavt int,
matrinhdo int,
mabophan int,
foreign key(mavt) references vitri(mavt),
foreign key(matrinhdo) references trinhdo(matrinhdo),
foreign key(mabophan) references bophan(mabophan)
);

create table loaikhach
(
maloaikhach int primary key auto_increment,
tenloaikhach varchar(50)
);

create table khachhang
(
makhachhang int primary key auto_increment,
hoten varchar(50),
ngaysinh date,
gioitinh int,
socmnd varchar(10),
sodienthoai varchar(11),
email varchar(50),
diachi varchar(50),
maloaikhach int,
foreign key(maloaikhach) references loaikhach(maloaikhach)
);

create table kieuthue
(
makieuthue int primary key auto_increment,
tenkieuthue varchar(50)
);

create table loaidichvu
(
maloaidichvu int primary key auto_increment,
tenloaidichvu varchar(50)
);

create table dichvu
(
madichvu int primary key auto_increment,
tendichvu varchar(50),
dientich int,
chiphithue int,
songuoitoida int,
tieuchuanphong varchar(50),
motatiennghikhac varchar(100),
dientichhoboi int,
sotang int,
makieuthue int,
maloaidichvu int,
foreign key(makieuthue) references kieuthue(makieuthue),
foreign key(maloaidichvu) references loaidichvu(maloaidichvu)
);
create table hopdong
(
mahopdong int primary key auto_increment,
ngaylamhopdong date,
ngayketthuc date,
tiendatcoc int,
manhanvien int,
makhachhang int,
madichvu int,
foreign key(manhanvien) references nhanvien(manv),
foreign key(makhachhang) references khachhang(makhachhang),
foreign key(madichvu) references dichvu(madichvu)
);

create table dichvudikem
(
madichvudikem int primary key auto_increment,
tendichvudikem varchar(50),
gia int,
donvi varchar(20),
trangthai varchar(50)
);

create table hopdongchitiet
(
mahopdongchitiet int primary key auto_increment,
soluong int,
mahopdong int,
madichvudikem int,
foreign key(mahopdong) references hopdong(mahopdong),
foreign key(madichvudikem) references dichvudikem(madichvudikem)
);