create database demo;
use demo;
create table products
(
id int primary key auto_increment,
productcode varchar(20),
productname varchar(50),
productprice float,
productamount int,
productdescription varchar(100),
productstatus varchar(100)
);
--  thêm dữ liệu vào cơ sở dữ liệu
insert into products values(1,'sp1','máy tính',300000,20,'sản phẩm đẹp','còn hàng');
insert into products values(2,'sp2','điện thoại',9800,80,'điện thoại đẹp','hết hàng');
insert into products values(3,'sp3','ti vi',34000,2,'ti vi nét','hết hàng');
insert into products values(4,'sp4','xe máy',120000,42,'xe máy đẹp','còn hàng');
insert into products values(5,'sp5','ô tô',3000,340,'ô tô xịn','hết hàng');
insert into products values(6,'sp6','bánh kẹo',3000,2023,'sản phẩm ngon','còn hàng');
insert into products values(10,'sp3','ti vi',34000,2,'ti vi nét','hết hàng');
insert into products values(11,'sp3','ti vi',34000,2,'ti vi nét','hết hàng');
insert into products values(9,'sp9','ti vi',34000,2,'ti vi nét','hết hàng');
select *from products;

--  Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
create index unique_index on products(productcode);
explain select *from products where productcode ='sp3';

-- Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)
create index composite_index on products(productname,productprice);

-- Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào 
explain select *from products where productcode='sp4';
explain select *from products where productname='ti vi' and productpricomposite_indexcomposite_indexce=34000;

-- So sánh câu truy vấn trước và sau khi tạo index
-- xóa index trên để chạy trường hợp chưa taoh index 
drop index unique_index on products;
--  trường hợp chưa tạo index
select *from products where productcode='sp3';
explain select *from products where productcode='sp3';
-- trường hợp đã tạo index 
create index unique_index on products(productcode);
explain select *from products where productcode='sp3';

-- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products. 
create view view_product as
select productcode,productname,productprice,productstatus from products;
select *from view_product;

-- Tiến hành sửa đổi view
 update view_product set productname = 'lap top' where productname='điện thoại';
 select *from view_product;
  update view_product set productprice = 10000 where productcode='sp1';

--  Tiến hành xoá view
drop view view_product;

-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
delimiter //
create procedure pcd_product()
begin
select *from products;
end //
delimiter ;
call pcd_product();

-- Tạo store procedure thêm một sản phẩm mới
delimiter //
create procedure store_product()
begin
	insert into products values(12,'sp9','nhà lầu',1000000,99,'xịn','còn');
end //
delimiter ;
call store_product();

-- Tạo store procedure sửa thông tin sản phẩm theo id
delimiter //
create procedure update_product()
begin
update products set productname='máy bay' where id=7;
end //
delimiter ;
call update_product();

-- Tạo store procedure xoá sản phẩm theo id
delimiter //
create procedure delete_product()
begin
delete from products where id =7;
end //
delimiter ;
call delete_product();