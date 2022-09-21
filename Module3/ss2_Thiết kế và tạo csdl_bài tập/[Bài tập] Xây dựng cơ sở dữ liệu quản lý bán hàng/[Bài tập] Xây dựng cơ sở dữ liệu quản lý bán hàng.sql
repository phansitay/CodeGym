create database QuanLyBanHang;
use QuanLyBanHang;

create table Customer(
cID int not null primary key,
cName nvarchar(20) not null,
cAge int not null);

create table `Order`(
oID int not null primary key,
cID int not null,
oDate datetime,
oToTalPrice float,
foreign key(cID) references Customer(cID));

create table Product(
pID int not null primary key,
pName nvarchar(50),
pPrice float);

create table OrderDetail(
oID int ,
pID int,
odQTY varchar(50),
foreign key(oID) references `Order`(oID),
foreign key(pID) references Product(pID));

insert into Customer values(1,N'PHAN SỈ TÂY',21);
select *FROM Customer;
select *from Product;