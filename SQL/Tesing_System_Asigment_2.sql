DROP DATABASE IF EXISTS Tesing_System_Asigment_1;
-- Xóa db nếu tồn tại
CREATE DATABASE Tesing_System_Asigment_1;
-- dùng db 
USE Tesing_System_Asigment_1;
DROP TABLE IF EXISTS `Department`;
CREATE TABLE `Department` (
	DepartmentID TINYINT UNSIGNED  PRIMARY KEY AUTO_INCREMENT,
    DepartmentName VARCHAR(30) NOT NULL UNIQUE KEY
);

DROP TABLE IF EXISTS `Position`;
CREATE TABLE `Position` (
	PositionID TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	PositionName ENUM('Dev', 'Test','Scrum Master', 'PM') NOT NULL UNIQUE KEY
);

DROP TABLE IF EXISTS `Account`;
CREATE TABLE `Account`(
	AccountID INT PRIMARY KEY AUTO_INCREMENT,
    Email VARCHAR(100) NOT NULL UNIQUE KEY,
    Username VARCHAR(50) NOT NULL UNIQUE KEY,
    FullName VARCHAR(50) NOT NULL,
    DepartmentID TINYINT UNSIGNED  NOT NULL,
    PositionID TINYINT UNSIGNED  NOT NULL,
    CreateDate DATETIME DEFAULT NOW(),
    FOREIGN KEY (DepartmentID) REFERENCES `Department`(DepartmentID) ON UPDATE CASCADE,
    FOREIGN KEY(PositionID) REFERENCES `Position`(PositionID) ON DELETE CASCADE
);

DROP TABLE IF EXISTS `Group`;
CREATE TABLE `Group`(
	GroupID INT PRIMARY KEY AUTO_INCREMENT,
    GroupName VARCHAR(100) NOT NULL UNIQUE KEY,
    CreatorID INT NOT NULL,
    CreateDate DATETIME DEFAULT NOW(),
    FOREIGN KEY (CreatorID) REFERENCES `Account`(AccountID)
); 

DROP TABLE IF EXISTS `GroupAccount`;
CREATE TABLE `GroupAccount`(
	GroupID INT NOT NULL,
    AccountID INT NOT NULL UNIQUE KEY,
    JoinDate DATETIME DEFAULT NOW(), 
	FOREIGN KEY (GroupID) REFERENCES `Group`(GroupID),
    FOREIGN KEY(AccountID) REFERENCES `Account`(AccountID)
); 

DROP TABLE IF EXISTS `TypeQuestion`;
CREATE TABLE `TypeQuestion`(
	TypeID INT PRIMARY KEY AUTO_INCREMENT,
    TypeName VARCHAR(100) NOT NULL
); 

DROP TABLE IF EXISTS `CategoryQuestion`;
CREATE TABLE `CategoryQuestion`(
	CategoryID INT PRIMARY KEY AUTO_INCREMENT,
    CategoryName VARCHAR(100) NOT NULL UNIQUE KEY
); 

DROP TABLE IF EXISTS `Question`;
CREATE TABLE `Question`(
	QuestionID INT PRIMARY KEY AUTO_INCREMENT,
    Content VARCHAR(500) NOT NULL,
    CategoryID INT NOT NULL,
    TypeID INT NOT NULL,
    CreatorID INT NOT NULL,
    CreateDate DATETIME DEFAULT NOW(),
	FOREIGN KEY (TypeID) REFERENCES `TypeQuestion`(TypeID),
    FOREIGN KEY (CategoryID) REFERENCES `CategoryQuestion`(CategoryID) ON DELETE CASCADE,
	FOREIGN KEY (CreatorID) REFERENCES `Account`(AccountID) ON DELETE CASCADE
); 

DROP TABLE IF EXISTS `Answer`;
CREATE TABLE `Answer`(
	AnswerID INT PRIMARY KEY AUTO_INCREMENT,
    Content VARCHAR(500) NOT NULL,
    QuestionID INT NOT NULL,
    isCorrect BOOLEAN,
    FOREIGN KEY (QuestionID) REFERENCES `Question`(QuestionID)
); 

DROP TABLE IF EXISTS `Exam`;
CREATE TABLE `Exam`(
	ExamID INT PRIMARY KEY AUTO_INCREMENT,
    Code  INT NOT NULL,
    Title VARCHAR(100) NOT NULL,
    CategoryID INT NOT NULL,
    CreatorID INT NOT NULL,
    CreateDate DATETIME DEFAULT NOW(),
    Duration INT NOT NULL,
    FOREIGN KEY (CategoryID) REFERENCES `CategoryQuestion`(CategoryID)
); 

DROP TABLE IF EXISTS `ExamQuestion`;
CREATE TABLE `ExamQuestion`(
	ExamID INT NOT NULL,
    QuestionID INT NOT NULL,
    FOREIGN KEY (QuestionID) REFERENCES `Question`(QuestionID),
    FOREIGN KEY (ExamID) REFERENCES `Exam`(ExamID)
); 


INSERT INTO `Department`(DepartmentName)
VALUES ('Sale'), 
		('developer'), 
        ('Thuế'),
        ('IT'),
        ('Thiết Kế'),
        ('Tuyển dụng'),
        ('Maketing'),
        ('Dữ liệu'),
        ('Kiểm toán'),
        ('Dịch vụ'),
        ('CHỜ VIỆC');

INSERT INTO `Position`(PositionName)
VALUES ('Dev'),	
		('Test'),
        ('Scrum Master'),
        ('PM');

INSERT INTO `Account`(Email,Username,FullName,DepartmentID,PositionID,CreateDate)
VALUES ('tavanmanh@gmail.com', 'fleta_rutherford1', 'NGYỄN VĂN A', '1', '2','2001-11-09'),
		('hoangvanson@gmail.com', 'fleta_rutherford2', ' NGUYỄN VĂN fleta_ru43therford38', '1', '1', '2002-11-09'),
        ('laiducminj@gmail.com', 'fleta_rutherford3', 'fleta_r4utherford38', '2', '1', '2003-11-09'),
        ('phanhaoinam@gmail.com', 'fleta_rutherford4', 'fleta444_rutherford38', '3', '2', '2004-11-09'),
        ('dangthuha@gmail.com', 'fleta_rutherford5', 'fleta_ruth4322erford38', '1', '2', '2005-11-09'),
        ('dothiha@gmail.com', 'fleta_rutherford6', 'fleta_ru324therford38', '2', '3', '2006-11-09'),
        ('nongducmanh@gmail.com', 'fleta_rutherfor7', 'fleta_r4321utherford38', '3', '4', '2007-11-09'),
        ('hahaiquang@gmail.com', 'fleta_rutherfor8', 'fleta_ruth2134erford38', '1', '1', '2012-11-09'),
        ('daothuqha@gmail.com', 'fleta_rutherford9', 'fleta_rut142herford38', '2', '2', '2009-11-09'),
        ('thicthichieu@gmail.com', 'fleta_rutherford10', 'fleta_rutherford38', '4', '3', '2011-11-09');
        
INSERT INTO `Group`(GroupName,CreatorID,CreateDate)
VALUES ('Anpha', '10', '2020-11-09'),
		('Badsdsa', '1', '2002-11-09'),
        ('Ccanhsas', '2', '2003-11-09'),
        ('Ddsads', '3', '2019-12-19'),
        ('Edsadsa', '4', '2005-11-21'),
        ('Fdsadsa', '5', '2006-11-09'),
        ('Gdsadas', '6', '2007-11-09'),
        ('Hdsd', '7', '2008-11-09'),
        ('Ifdsafds', '8', '2009-11-09'),
        ('Kfsdafds', '9', '2010-11-09');

INSERT INTO `GroupAccount`(GroupID,AccountID,JoinDate)
VALUES ('2', '1', '2001-11-09'),
		('1', '2', '2002-11-09'),
        ('1', '3', '2003-11-09'),
        ('2', '4', '2004-11-09'),
        ('3', '5', '2005-11-09'),
        ('3', '6', '2006-11-09'),
        ('2', '7', '2007-11-09'),
        ('3', '8', '2008-11-09'),
        ('1', '9', '2009-11-09'),
        ('5', '10', '2010-11-09');

INSERT INTO `TypeQuestion`(TypeName)
VALUES ('ABC'), 
		('BCD'), 
        ('DEF'),
        ('EFH'),
        ('UHY'),
        ('IOP'),
        ('ADG'),
        ('OSI'),
        ('POA'),
        ('DKS');
        
INSERT INTO `CategoryQuestion`(CategoryName)VALUES ('Dien thoai'), 
		('May tinh'), 
        ('Ti vi'),
        ('Tu lanh'),
        ('may giat'),
        ('Dieu hoa'),
        ('May xay'),
        ('May bom'),
        ('Bep ga'),
        ('Li oa');

INSERT INTO `Question`(Content,CategoryID,TypeID,CreatorID,CreateDate)
VALUES ('câu hỏiSDSFDFDSF', '1','1','1', '2022-10-09'),
		('FDSFDSAFDSA', '2','1','3', '2022-10-09'),
        ('câu hỏi FADSFDSF', '3','1','4', '2022-10-09'),
        ('FDSAFDGFD', '1','1','5', '2022-10-09'),
        ('FDAGFVCXVC', '3','1','4', '2022-10-09'),
        ('GFDSGFDS', '4','1','3', '2022-10-09'),
        ('GFDSGVSAFDAS', '2','3','2', '2022-10-09'),
        ('HGFJHGFJFG', '1','3','4', '2022-11-09'),
        ('HETHSGF', '3','4','1', '2022-11-09'),
        ('HGDFHGJHFJU', '1','1','5', '2022-11-09');
	
INSERT INTO `Answer`(Content,QuestionID,isCorrect)
VALUES ('SDSFDFDSF','1', '1'),
		('FDSFDSAFDSA','3', '0'),
        ('FADSFDSF','4', '1'),
        ('FDSAFDGFD','3', '0'),
        ('FDAGFVCXVC','3', '0'),
        ('GFDSGFDS','1', '1'),
        ('GFDSGVSAFDAS','2', '1'),
        ('HGFJHGFJFG','4', '1'),
        ('HETHSGF','3', '1'),
        ('HGDFHGJHFJU','5', '1');

INSERT INTO `Exam`(Code,Title,CategoryID,CreatorID,CreateDate,Duration)
VALUES ('123','SDSFDFDSF', '1','1', '2022-11-09','5'),
		('456','FDSFDSAFDSA', '2','3', '2022-11-09','10'),
        ('567','FADSFDSF', '3','4', '2022-11-09','15'),
        ('678','FDSAFDGFD', '1','5', '2022-11-09','25'),
        ('789','FDAGFVCXVC', '3','4', '2022-11-09','35'),
        ('910','GFDSGFDS', '4','3', '2022-11-09','45'),
        ('783','GFDSGVSAFDAS','3','2', '2022-11-09','55'),
        ('323','HGFJHGFJFG', '1','4', '2022-11-09','65'),
        ('432','HETHSGF', '3','1', '2022-11-09','75'),
        ('454','HGDFHGJHFJU', '1','5', '2022-11-09','85');

INSERT INTO `ExamQuestion`(ExamID,QuestionID)
VALUES ('1', '1'),
		('3', '2'),
        ('4', '7'),
        ('5', '3'),
        ('4', '3'),
        ('3', '3'),
        ('2', '3'),
        ('4', '2'),
        ('1', '5'),
        ('5', '1');

DROP PROCEDURE IF EXISTS UPDATE_D;
DELIMITER $$
CREATE PROCEDURE UPDATE_D(IN var_DNAME VARCHAR(30))
BEGIN
	DECLARE D_ID INT ;
	SELECT D1.DepartmentID INTO D_ID FROM `Department` D1 WHERE D1.DepartmentName= var_DNAME;
	UPDATE `Account` A SET A.DepartmentID = 11 WHERE A.DepartmentID = D_ID;
	DELETE FROM `Department` D WHERE D.DepartmentID = D_ID;
END$$
DELIMITER ;
Call UPDATE_D('SALE');