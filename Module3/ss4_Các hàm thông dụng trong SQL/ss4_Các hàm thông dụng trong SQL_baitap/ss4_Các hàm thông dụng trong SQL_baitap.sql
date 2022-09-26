use quanlysinhvien;
select *from class;
select *from mark;
select *from student;
select *from `subject`;

-- them du lieu;
insert into mark values(4,3,3,30,2);
insert into mark values(5,4,2,30,2);
insert into mark values(6,3,4,15,1);
-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select subid,subname,max(credit)as 'credit lon nhat',status from `subject`;

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select s.subid,s.subname,s.credit,s.`status`, max(m.mark) 
from subject s join mark as m on s.subid=m.subid;

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần 
select s.studentid,s.studentname,s.phone, avg(mark)
from student s join mark as m on s.studentID=m.studentID
group by s.studentID,s.studentName;

-- sắp xếp theo thứ tự điểm giảm dần
select s.studentid,s.studentname,s.phone, avg(mark) as 'diemtrungbinh'
from student s join mark as m on s.studentID=m.studentID
group by s.studentID,s.studentName
order by diemtrungbinh desc;