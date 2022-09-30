DROP DATABASE IF EXISTS Assignment_2;
create database Assignment_2;
USE Assignment_2;

DROP TABLE IF EXISTS `Trainee`;
CREATE TABLE `Trainee`(
	TraineeID INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    Full_Name VARCHAR(100) NOT NULL,
    Birth_Date DATE DEFAULT NOW(),
    Gender ENUM('male', 'female',' unknown') NOT NULL UNIQUE KEY,
    ET_IQ TINYINT UNSIGNED  NOT NULL,
    ET_Gmath TINYINT UNSIGNED  NOT NULL,
    ET_English TINYINT UNSIGNED  NOT NULL,
    Training_Class INT UNSIGNED NOT NULL,
    Evaluation_Notes VARCHAR(100) NOT NULL,
    VTI_Account VARCHAR(100) NOT NULL UNIQUE KEY,
    CHECK ( ET_IQ>=0 AND ET_IQ<=20),
    CHECK ( ET_Gmath>=0 AND ET_Gmath<=20),
    CHECK ( ET_English>=0 AND ET_English<=50)
); 

DROP TABLE IF EXISTS `Data`;
CREATE TABLE `Data`(
	ID INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(100) NOT NULL,
    Code VARCHAR(5) NOT NULL,
    ModifiedDate DATETIME DEFAULT NOW() 
);

DROP TABLE IF EXISTS `Information`;
CREATE TABLE `Information`(
	ID INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    BirthDate DATE NOT NULL,
    Gender ENUM('0','1') UNIQUE KEY,
    IsDeletedFlag BOOLEAN NOT NULL
);


INSERT INTO `Trainee`(Full_Name,Birth_Date,Gender,ET_IQ,ET_Gmath,ET_English,Training_Class,Evaluation_Notes,VTI_Account)
VALUES ('TẠ VĂN MẠNH','2001-11-09','male','20','20','20','3','MANH123445','MANH1234');

