USE kgcas;



CREATE TABLE studentsmnc (
    id INT AUTO_INCREMENT PRIMARY KEY,
    NAME VARCHAR(20),
    MARKS INT,
    DEPARTMENT CHAR(25),
    SECTION VARCHAR(34)
);
ALTER TABLE studentsmnc ADD gender VARCHAR(34);


INSERT INTO studentsmnc (NAME, MARKS, DEPARTMENT, SECTION,gender) VALUES
('Boobathi', 50, 'BCA', 'C',male),
('Deepak', 70, 'BSC.CT', 'A',male),
('Balamurali', 80, 'BSC.IT', 'B',male),
('Praveenkumar', 90, 'BSC.IT', 'A',male),
('Aswinkumar', 85, 'BSC.CS', 'A',male);

SELECT * FROM studentsmnc;

SELECT NAME FROM studentsmnc WHERE MARKS < 60;

