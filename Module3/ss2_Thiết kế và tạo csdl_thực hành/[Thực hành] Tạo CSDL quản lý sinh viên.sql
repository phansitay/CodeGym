create database QuanLySinhVien;
use QuanLySinhVien;

create table Class(
classID int not null auto_increment primary key,
className varchar(60) not null,
startdate datetime not null,
`status` bit);

create table Student(
studentID int not null auto_increment primary key,
studentName varchar(30) not null,
address varchar(50),
phone varchar(20),
`stutus` bit,
classID int not null,
foreign key(classID) references Class(classID));

create table Subject(
subID int not null auto_increment primary key,
subName  varchar(30) not null,
credit tinyint not null default 1 check(credit >=1),
`status` bit default 1);

create table Mark(
markID int not null auto_increment primary key,
subID int not null,
studentID int not null,
Mark float default 0 check(Mark between 0 and 100),
examTime tinyint default 1,
unique (subID, studentID),
foreign key(subID) references Subject(subID),
foreign key(studentID) references Student(studentID));