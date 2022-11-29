DROP DATABASE IF EXISTS exam_java;
CREATE DATABASE exam_java;
USE exam_java;
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`(
	Id INT PRIMARY KEY AUTO_INCREMENT,
    FullName VARCHAR(100) NOT NULL,
    Email VARCHAR(100) NOT NULL,
    Password VARCHAR(100) NOT NULL DEFAULT ("123456"),
    ExpInYear INT,
    ProjectId INT,
    ProSkill VARCHAR(100),
    Role ENUM('Manager', 'Employee','Admin') 
); 


INSERT INTO `user`(FullName,Email,Password,Role)
VALUES ('Admin', 'admin@gmail.com', 'Manh1234#',"Admin"),
		('AdminTest', 'admintest@gmail.com', 'Manh1234',"Admin");

INSERT INTO `user`(FullName,Email,Password,Role,ExpInYear,ProjectId)
VALUES ('Manager1', 'Manager11@gmail.com', 'Manh123',"Manager",5,6),
		('Manager2', 'Manager22@gmail.com', 'Manh14',"Manager",7,5),
         ('Manager3', 'Manager33@gmail.com', 'Manh123',"Manager",5,3),
		('Manager4', 'Manager44@gmail.com', 'Manh14',"Manager",7,4);

INSERT INTO `user`(FullName,Email,Password,Role,ProjectId,ProSkill)
VALUES ('Employee1', 'Employee11@gmail.com', 'khanh123',"Employee",5,"dev"),
		('Employee2', 'Employee22@gmail.com', 'matkhau',"Employee",3,"test"),
        ('Employee3', 'Employee31@gmail.com', 'khanh123',"Employee",5,"dev"),
		('Employee4', 'Employee42@gmail.com', 'matkhau',"Employee",3,"test");
	