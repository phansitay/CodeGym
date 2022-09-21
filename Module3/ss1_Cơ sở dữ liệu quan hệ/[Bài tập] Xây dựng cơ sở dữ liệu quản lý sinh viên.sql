create database qlsinhvien;
use qlsinhvien;
create table class
(
id int auto_increment primary key,
name varchar(50)
);
create table teacher
(
id int primary key auto_increment,
name varchar(50),
age int,
country varchar(50)
);