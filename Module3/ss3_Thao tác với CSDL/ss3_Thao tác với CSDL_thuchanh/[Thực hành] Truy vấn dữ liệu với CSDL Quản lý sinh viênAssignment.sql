use quanlysinhvien;

-- hien thi tat ca cac hoc vien
select * from student;

-- hien thi danh sach hoc vien dang theo hoc
select *from student 
where stutus = true; 

-- hien thi danh sach cac mon hoc co gio nho hon 10
select * from subject
where credit <10;

-- hien thi danh sach hoc vien lop a1
select s.studentid,s.studentname,c.classname
from student s join class c on s.classID = c.classID;
select s.studentid,s.studentname,c.classname
from student s join class c on s.classID = c.classID
where c.className='A1';

-- hien thi diem mon cf cua cac hoc vien

select  S.StudentId, S.StudentName, Sub.SubName, M.Mark
FROM Student S join Mark M on S.StudentId = M.StudentId join Subject Sub on M.SubId = Sub.SubId;

SELECT S.StudentId, S.StudentName, Sub.SubName, M.Mark
FROM Student S join Mark M on S.StudentId = M.StudentId join Subject Sub on M.SubId = Sub.SubId
WHERE Sub.SubName = 'CF';