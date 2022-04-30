CREATE TABLE Student(
Sid int primary key,
Name varchar(100),
Dob varchar(100),
Sex varchar(50)
);

insert into Student values(01,'Glen','1990-01-01','Male');
insert into Student values(02,'Emily','1990-12-21','Female');
insert into Student values(03,'Smith','1990-05-20','Male');
insert into Student values(04,'Johnshon','1990-08-06','Male');
insert into Student values(05,'William','1991-12-01','Male');
insert into Student values(06,'Lily','1992-03-01','Female');
insert into Student values(07,'Jessica','1989-07-01','Female');
insert into Student values(09,'Taylor','2017-12-20','Male');
insert into Student values(10,'Mary','2017-12-25','Female');
insert into Student values(11,'Linda','2017-12-30','Female');
insert into Student values(12,'Oscar','2017-01-01','Male');
insert into Student values(13,'Susan','2018-01-01','Female');


create table Course(
Sid int,
Cid int,
Score float,
Primary key(Sid,Cid),
FOREIGN KEY (Sid) REFERENCES Student(Sid)
);

insert into Course values(01,01,80.0);
insert into Course values(01,02,90.0);
insert into Course values(01,03,99.0);
insert into Course values(02,01,70.0);
insert into Course values(02,02,60.0);
insert into Course values(02,03,80.0);
insert into Course values(03,01,80.0);
insert into Course values(03,02,80.0);
insert into Course values(03,03,80.0);
insert into Course values(04,01,50.0);
insert into Course values(04,02,30.0);
insert into Course values(04,03,20.0);
insert into Course values(05,01,76.0);
insert into Course values(05,02,87.0);
insert into Course values(06,01,31.0);
insert into Course values(06,03,34.0);
insert into Course values(07,02,89.0);
insert into Course values(07,03,98.0);

--Q1
select count(*) 
from Student 
group by Sex;

--Q2
select Name 
from Student 
where Name like '%n';

--Q3
select Name, Dob 
from Student 
where Dob like '1990%';

--Q4
select name 
FROM Student inner join Course 
ON Student.Sid=Course.Sid 
where Cid=01 and Score>=80.0;