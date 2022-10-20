DROP DATABASE IF EXISTS Test_sql;
CREATE DATABASE Test_sql;
USE Test_sql;
DROP TABLE IF EXISTS `GiangVien`;
CREATE TABLE `GiangVien` (
	magv INT PRIMARY KEY AUTO_INCREMENT,
    hoten VARCHAR(50) NOT NULL,
    luong INT NOT NULL
);

DROP TABLE IF EXISTS `SinhVien`;
CREATE TABLE `SinhVien` (
	masv INT PRIMARY KEY AUTO_INCREMENT,
    hoten VARCHAR(50) NOT NULL,
    quequan VARCHAR(250) NOT NULL,
    namsinh DATETIME DEFAULT NOW()
);

DROP TABLE IF EXISTS `DeTai`;
CREATE TABLE `DeTai` (
	madt INT PRIMARY KEY AUTO_INCREMENT,
    tendt VARCHAR(250) NOT NULL,
    kinhphi INT NOT NULL,
    noithuctap VARCHAR(250) NOT NULL
);

DROP TABLE IF EXISTS `HuongDan`;
CREATE TABLE `HuongDan` (
	id INT PRIMARY KEY AUTO_INCREMENT,
    madt INT NOT NULL,
	masv INT NOT NULL,
    magv INT NOT NULL,
	ketqua VARCHAR(250) NOT NULL,
    FOREIGN KEY (magv) REFERENCES `GiangVien`(magv) ON UPDATE CASCADE,
    FOREIGN KEY (masv) REFERENCES `SinhVien`(masv) ON DELETE CASCADE,
    FOREIGN KEY (madt) REFERENCES `DeTai`(madt) ON UPDATE CASCADE
);

INSERT INTO `GiangVien`(hoten,luong)
VALUES	('ta van manh','10000000'), 
		('Lại đưc minh','20000000'), 
        ('vũ văn nam','30000000');
        
INSERT INTO `SinhVien`(hoten,quequan,namsinh)
VALUES	('Hoàng Văn A','Hà nội','1999-11-09'), 
		('Tạ Văn B','Thái Bình','1998-11-09'), 
        ('Trần Văn C','Hưng Yên','2000-11-09'),
        ('Trần Văn xxx','Hưng Yên','1800-11-09'),
        ('Trần Văn QUANG','Hưng Yên','1888-11-09');

INSERT INTO `DeTai`(tendt,kinhphi,noithuctap)
VALUES	('CONG NGHE SINH HOC','10000000','HÀ NỘI'), 
		('HÓA DẦU','20000000','THÁI BÌNH'), 
        ('DƯỢC PHẨM','30000000','HƯNG YÊN');

INSERT INTO `HuongDan`(masv,magv,madt,ketqua)
VALUES	('1','2','1','A+'),
		('2','1','3','B+'),
        ('3','3','2','C+'),
        ('4','3','1','D+');
        
        
 -- CÂU 2 A) Cách 1
 WITH CTE_DEP2 AS (
		SELECT 	SV.masv,HD.madt FROM `SinhVien` SV
		LEFT JOIN 	`HuongDan` HD
		ON			SV.masv=HD.masv
		)
 SELECT * FROM `SinhVien` WHERE masv=(SELECT masv FROM CTE_DEP2 WHERE madt IS NULL);
  --  Cách 2
 SELECT SV.*
    FROM `HuongDan` HD
	RIGHT JOIN  `SinhVien` SV ON SV.masv=HD.masv
    WHERE HD.madt IS NULL;
-- CÂU 2 B)
SELECT COUNT(HD.masv) AS SL_SV 
	FROM `HuongDan` HD 
	WHERE madt=(SELECT madt FROM `DeTai` WHERE tendt='CONG NGHE SINH HOC') 
    GROUP BY madt;

-- CÂU 3
DROP VIEW IF EXISTS `SinhVienInfo`;
CREATE VIEW `SinhVienInfo` AS
	SELECT SV.masv,SV.hoten,
    CASE WHEN DT.tendt IS NULL THEN 'CHUA CO'
    ELSE DT.tendt END
    FROM `HuongDan` HD
	RIGHT JOIN  `SinhVien` SV ON SV.masv=HD.masv
    LEFT JOIN `DeTai` DT ON DT.madt=HD.madt;


-- CÂU 4
DROP TRIGGER IF EXISTS TRIG_INSERT_SV;
DELIMITER $$
 CREATE TRIGGER TRIG_INSERT_SV
 BEFORE INSERT ON `SinhVien`
 FOR EACH ROW
BEGIN
	IF (YEAR( NEW.namsinh)<=1900) THEN
	SIGNAL SQLSTATE '12345'
	SET MESSAGE_TEXT = 'năm sinh phải > 1900';
	END IF;
END$$
 DELIMITER ;
INSERT INTO `SinhVien`(hoten,quequan,namsinh)
VALUES	 ('Trần Văn QUANG','Hưng Yên','1899-11-09');

-- CÂU 5
DELETE FROM `SinhVien`  WHERE MASV=5;