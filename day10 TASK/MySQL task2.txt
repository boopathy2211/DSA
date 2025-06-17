drop database student;
create database student;
use student;

create table Kgisl(NAME varchar(20),MARKS int,DEPARTMENT char(25),SECTION varchar(34));
INSERT INTO Kgisl values("Boobathi",50,"BCA","C"),
("Deepak",70,"BSC.CT","A"),
("Balamurali",80,"BSC.IT","B")
,("Praveenkumar",90,"BSC.IT","A")
,("Aswinkumar",85,"Bsc.CS","A");
select * from Kgisl;