create database QuanLyDiemThi;
use QuanLyDiemThi;
create table HocSinh(
maHS varchar(20) primary key,
tenHS nvarchar(50),
ngaySinh datetime,
lop varchar(20),
gt varchar(20));

create table MonHoc(
maMH varchar(20) primary key,
tenMH nvarchar(50));

create table BangDiem(
maHS varchar(20),
maMH varchar(20),
diemThi int,
ngayKT datetime,
primary key(maHS,maMH),
foreign key(maHS) references HocSinh(maHS),
foreign key(maMH) references MonHoc(maMH));

create table GiaoVien(
maGV varchar(20) primary key,
tenGV varchar(20),
sdt varchar(10));

alter table MonHoc add maGV varchar(20);
alter table MonHoc add constraint fk_maGV foreign key(maGV) references GiaoVien(maGV);

