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

cre