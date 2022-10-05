-- Câu 1:1.	Thêm mới thông tin cho tất cả các bảng có trong CSDL để có thể thoả mãn các yêu cầu bên dưới.
-- Thêm vị trí
insert into vitri values(1,'quản lý');
insert into vitri values(2,'Nhân viên');
select *from vitri;

-- Thêm trình độ
insert into trinhdo values(1,'trung cấp');
insert into trinhdo values(2,'cao đẳng');
insert into trinhdo values(3,'đại học');
insert into trinhdo values(4,'sau đại học');
select *from trinhdo;

-- Thêm bộ phận
insert into bophan values(1,'sale_marketing');
insert into bophan values(2,'hành chính');
insert into bophan values(3,'phục vụ');
insert into bophan values(4,'quản lý');
select *from bophan;

-- thêm nhân viên 
insert into nhanvien values(1,'Nguyễn Văn An','1970-11-07',456231786,10000000,0901234121,'annguyen@gmail.com','295 Nguyễn Tất Thành, Đà Nẵng',1,3,1);
insert into nhanvien values(2,'Lê Văn Bình','1997-04-09',654231234,70000000,0934212314,'binhlv@gmail.com','22 Yên Bái, Đà Nẵng',1,2,2);
insert into nhanvien values(3,'Hồ Thị Yến','1995-12-12',999231723,14000000,0412352315,'thiyen@gmail.com','K234/11 Điện Biên Phủ, Gia Lai',1,3,2);
insert into nhanvien values(4,'Võ Công Toản','1980-04-04',123231365,17000000,0374443232,'toan0404@gmail.com','77 Hoàng Diệu, Quảng Trị',1,4,4);
insert into nhanvien values(5,'Nguyễn Bỉnh Phát','1999-12-09',454363232,6000000,0902341231,'phatphat@gmail.com','43 Yên Bái, Đà Nẵng',2,1,1);
insert into nhanvien values(6,'Khúc Nguyễn An Nghi','2000-11-08',964542311,7000000,0978653213,'annghi20@gmail.com','294 Nguyễn Tất Thành, Đà Nẵng',2,2,3);
insert into nhanvien values(7,'Nguyễn Hữu Hà','1993-01-01',534323231,8000000,0941234553,'nhh0101@gmail.com','4 Nguyễn Chí Thanh, Huế',2,3,2);
insert into nhanvien values(8,'Nguyễn Hà Đông','1989-09-03',234414123,9000000,0642123111,'donghanguyen@gmail.com','111 Hùng Vương, Hà Nội',2,4,4);
insert into nhanvien values(9,'Tòng Hoang','1982-09-03',256781231,6000000,0245144444,'hoangtong@gmail.com','213 Hàm Nghi, Đà Nẵng',2,4,4);
insert into nhanvien values(10,'Nguyễn Công Đạo','1994-01-08',755434343,8000000,0988767111,'nguyencongdao12@gmail.com','6 Hoà Khánh, Đồng Nai',2,3,2);
select *from nhanvien;

-- Thêm loại khách
insert into loaikhach values(1,'diamond');
insert into loaikhach values(2,'platinium');
insert into loaikhach values(3,'goal');
insert into loaikhach values(4,'silver');
insert into loaikhach values(5,'member');
select *from loaikhach;

-- thêm khách hàng
insert into khachhang values(1,'Nguyễn Thị Hào','1970-11-07',0,643431213,0945423362,'thihao07@gmail.com','23 Nguyễn Hoàng, Đà Nẵng',5);
insert into khachhang values(2,'Phạm Xuân Diệu','1992-08-08',1,865342123,0954333333,'xuandieu92@gmail.com','K77/22 Thái Phiên, Quảng Trị',3);
insert into khachhang values(3,'Trương Đình Nghệ','1990-02-27',1,488645199,0373213122,'nghenhan2702@gmail.com','K323/12 Ông Ích Khiêm,Vinh',1);
insert into khachhang values(4,'Dương Văn Quan','1981-07-08',1,543432111,0490039241,'duongquan@gmail.com','K453/12 Lê Lợi, Đà Nẵng',1);
insert into khachhang values(5,'Hoàng Trần Nhi Nhi','1995-12-09',0,795453345,0312345678,'nhinhi123@gmail.com','224 Lý Thái Tổ, Gia Lai',4);
insert into khachhang values(6,'Tôn Nữ Mộc Châu','2005-12-06',0,732434215,0988888844,'tonnuchau@gmail.com','37 Yên Thế, Đà Nẵng',4);
insert into khachhang values(7,'Nguyễn Mỹ Kim','1984-04-08',0,856453123,0912345698,'kimcuong84@gmail.com','K123/45 Lê Lợi, Hồ Chí Minh',1);
insert into khachhang values(8,'Nguyễn Thị Hào','1999-04-08',0,965656433,0763212345,'haohao99@gmail.com','55 Nguyễn Văn Linh, Kon Tum',3);
insert into khachhang values(9,'Trần Đại Danh','1994-07-01',1,432341235,0643343433,'danhhai99@gmail.com','24 Lý Thường Kiệt, Quảng Ngãi',1);
insert into khachhang values(10,'Nguyễn Tâm Đắc','1989-07-01',1,344343432,0987654321,'dactam@gmail.com','22 Ngô Quyền, Đà Nẵng',2);
select *from khachhang;

-- Thêm kiểu thuê
insert into kieuthue values(1,'year');
insert into kieuthue values(2,'month');
insert into kieuthue values(3,'day');
insert into kieuthue values(4,'hour');
select *from kieuthue;

-- Thêm loại dịch vụ
insert into loaidichvu values(1,'villa');
insert into loaidichvu values(2,'house');
insert into loaidichvu values(3,'room');
select *from loaidichvu;

-- Thêm dịch vụ
insert into dichvu values(1,'Villa Beach Front',25000,10000000,10,'vip','Có hồ bơi',500,4,3,1);
insert into dichvu values(2,'House Princess 01',14000,5000000,7,'vip','Có thêm bếp nướng',null,3,2,2);
insert into dichvu values(3,'Room Twin 01',5000,1000000,2,'normal','Có tivi',null,null,4,3);
insert into dichvu values(4,'Villa No Beach Front',22000,9000000,8,'normal','Có hồ bơi',300,3,3,1);
insert into dichvu values(5,'House Princess 02',10000,4000000,5,'normal','Có thêm bếp nướng',null,2,3,2);
insert into dichvu values(6,'Room Twin 02',3000,900000,2,'normal','Có tivi',null,null,4,3);
select *from dichvu;

-- Thêm hợp đồng
insert into hopdong values(1,'2020-12-08','2020-12-08',0,3,1,3);
insert into hopdong values(2,'2020-07-14','2020-07-21',200000,7,3,1);
insert into hopdong values(3,'2021-03-15','2021-03-17',50000,3,4,2);
insert into hopdong values(4,'2021-01-14','2021-01-18',100000,7,5,5);
insert into hopdong values(5,'2021-07-14','2021-07-15',0,7,2,6);
insert into hopdong values(6,'2021-06-01','2021-06-03',0,7,7,6);
insert into hopdong values(7,'2021-09-02','2021-09-05',100000,7,4,4);
insert into hopdong values(8,'2021-06-17','2021-06-18',150000,3,4,1);
insert into hopdong values(9,'2020-11-19','2020-11-19',0,3,4,3);
insert into hopdong values(10,'2021-04-12','2021-04-14',0,10,3,5);
insert into hopdong values(11,'2021-04-25','2021-04-25',0,2,2,1);
insert into hopdong values(12,'2021-05-25','2021-05-27',0,7,10,1);
select *from hopdong;

--  thêm dịch vụ đi kèm
insert into dichvudikem values(1,'Karaoke',10000,'giờ','tiện nghi, hiện tại');
insert into dichvudikem values(2,'Thuê xe máy',10000,'chiếc','hỏng 1 xe');
insert into dichvudikem values(3,'Thuê xe đạp',20000,'chiếc','tốt');
insert into dichvudikem values(4,'Buffet buổi sáng',15000,'suất','đầy đủ đồ ăn, tráng miệng');
insert into dichvudikem values(5,'Buffet buổi trưa',90000,'suất','đầy đủ đồ ăn, tráng miệng');
insert into dichvudikem values(6,'Buffet buổi tối',16000,'suất','đầy đủ đồ ăn, tráng miệng');
select *from dichvudikem;

-- Thêm bảng hợp đồng chi tiết
insert into hopdongchitiet values(1,5,2,4);
insert into hopdongchitiet values(2,8,2,5);
insert into hopdongchitiet values(3,15,2,6);
insert into hopdongchitiet values(4,1,3,1);
insert into hopdongchitiet values(5,11,3,2);
insert into hopdongchitiet values(6,1,1,3);
insert into hopdongchitiet values(7,2,1,2);
insert into hopdongchitiet values(8,2,12,2);
select *from hopdongchitiet;






