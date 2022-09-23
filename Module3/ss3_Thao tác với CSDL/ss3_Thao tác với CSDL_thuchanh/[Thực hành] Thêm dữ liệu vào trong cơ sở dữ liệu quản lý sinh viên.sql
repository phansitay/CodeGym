use quanlysinhvien;
select *from class;
insert into class values(1,'A1','2008/12/20',1);
insert into class values(2,'A2','2006/12/20',1);
insert into class values(3,'A5',current_date,0);
insert into class values(4,'A1','2008/12/20',1);

select *from student;
insert into student values(1,'tri','quang nam','029293',1,1);
INSERT INTO Student (StudentName, Address, Phone, stutus, ClassId)
VALUES ('Hung', 'Ha Noi', '0912113113', 1, 1);
INSERT INTO Student (StudentName, Address, stutus, ClassId)
VALUES ('Hoa', 'Hai phong', 1, 2);
INSERT INTO Student (StudentName, Address, Phone, stutus, ClassId)
VALUES ('Manh', 'HCM', '0123123123', 0, 3);

INSERT INTO Subject
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
       
select *from subject;

select *from mark;
INSERT INTO Mark (SubId, StudentId, Mark, ExamTime)
VALUES (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);
       