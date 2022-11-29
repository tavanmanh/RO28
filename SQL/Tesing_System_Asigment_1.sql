-- Xóa db nếu tồn tại
DROP DATABASE IF EXISTS Tesing_System_Asigment_1;
create database Tesing_System_Asigment_1;
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
	PositionName VARCHAR(30) NOT NULL
);

DROP TABLE IF EXISTS `Account`;
CREATE TABLE `Account`(
	AccountID INT PRIMARY KEY AUTO_INCREMENT,
    Email VARCHAR(100) NOT NULL,
    Username VARCHAR(50) NOT NULL,
    FullName VARCHAR(50) NOT NULL,
    DepartmentID TINYINT UNSIGNED  NOT NULL,
    PositionID TINYINT UNSIGNED  NOT NULL,
    CreateDate DATE DEFAULT NOW(),
    FOREIGN KEY (DepartmentID) REFERENCES `Department`(DepartmentID),
    FOREIGN KEY(PositionID) REFERENCES `Position`(PositionID)
);

DROP TABLE IF EXISTS `Group`;
CREATE TABLE `Group`(
	GroupID INT PRIMARY KEY AUTO_INCREMENT,
    GroupName VARCHAR(100) NOT NULL,
    CreatorID INT NOT NULL,
    CreateDate DATE
); 

DROP TABLE IF EXISTS `GroupAccount`;
CREATE TABLE `GroupAccount`(
	GroupID INT NOT NULL,
    AccountID INT NOT NULL,
    JoinDate DATE,
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
    CategoryName VARCHAR(100) NOT NULL
); 

DROP TABLE IF EXISTS `Question`;
CREATE TABLE `Question`(
	QuestionID INT PRIMARY KEY AUTO_INCREMENT,
    Content VARCHAR(500) NOT NULL,
    CategoryID INT NOT NULL,
    TypeID INT NOT NULL,
    CreatorID INT NOT NULL,
    CreateDate DATE,
    FOREIGN KEY (CategoryID) REFERENCES `CategoryQuestion`(CategoryID)
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
    CreateDate DATE,
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
