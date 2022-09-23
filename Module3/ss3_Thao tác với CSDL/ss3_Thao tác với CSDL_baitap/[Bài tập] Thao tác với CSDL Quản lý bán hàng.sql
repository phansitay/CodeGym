use quanlybanhang;
select *from customer;
select *from `order`;
select *from product;
select *from orderdetail;

-- thêm dữ liệu vảo table customer 
insert into customer values(2,'ngọc oanh',20);
insert into customer values(3,'ngoc ha',50);

-- thêm dữ liệu vào table order 
insert into `order`(oid,cid,odate) values(1,1,'2006-03-21');
insert into `order`(oid,cid,odate) values(2,2,'2006-03-23');
insert into `order`(oid,cid,odate) values(3,1,'2006-03-16');


-- thêm dữ liệu vào table product
insert into product values(1,'máy giặt',3); 
insert into product values(2,'tủ lạnh',5); 
insert into product values(3,'điều hòa',7); 
insert into product values(4,'quạt',1); 
insert into product values(5,'bếp điện',2); 

--  thêm dữ liệu vào orderdetail
insert into orderdetail values(1,1,3);
insert into orderdetail values(1,1,3);
insert into orderdetail values(1,1,3);
insert into orderdetail values(1,3,7);
insert into orderdetail values(1,4,2);
insert into orderdetail values(2,1,1);
insert into orderdetail values(3,1,8);
insert into orderdetail values(2,5,4);
insert into orderdetail values(2,3,3);

-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select oid,odate,ototalprice from `order`;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select c.cname,p.pname
from customer c join `order` as o on c.cid=o.cid
join orderdetail as od on o.oid=od.oid
join product as p on od.pid=p.pid;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select c.cname from customer c
where c.cid not in(select o.cid from `order` as o);

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn.
select o.oid,o.odate,sum(od.odqty*p.pprice)as ototalprice
from `order` o join orderdetail as od on o.oid=od.oid
join product as p on od.pid=p.pid
group by oid;