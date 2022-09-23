use quanlysinhvien;
-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
select *from student 
where studentName like 'h%';

-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
select *from class
where startdate >='2008-12-01' and startdate<='2008-12-31';

--  Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
select *from subject
where credit>=3 and credit<=5;

-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
SET SQL_SAFE_UPDATES = 0;
update student 
set classid =2
where studentname ='Hung';
select *from student;
select *from `subject`;
select * from mark;
-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần. 

select st.studentname,sb.subname,m.mark 
from student st join mark m on st.studentID=m.studentID
join subject sb on m.subID=sb.subID
order by m.Mark desc,st.studentName asc;
