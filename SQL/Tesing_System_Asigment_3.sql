-- Câu 2:
SELECT * FROM `DepartmentID` ;

-- CÂU 3
SELECT `DepartmentID` FROM department WHERE DepartmentName='Sale';

-- CÂU 4
SELECT * FROM `Account` ORDER BY LENGTH(FullName) desc limit 1;

-- CÂU 5
SELECT * FROM `Account` WHERE DepartmentID='3' ORDER BY LENGTH(FullName) DESC LIMIT 1;

WITH CTE_DEP3 AS (
	SELECT * FROM `Account` WHERE DepartmentID = 3
)
-- B2: Tìm trong kết quả đã lọc Account có tên dài nhất
SELECT * FROM `CTE_DEP3`
WHERE LENGTH(Fullname) = (SELECT MAX(LENGTH(Fullname)) FROM `CTE_DEP3`) 
ORDER BY Fullname;

-- CÂU 6
SELECT CreateDate FROM `Group` WHERE DATE(CreateDate) <'2019-12-20';

-- CÂU 7
SELECT QuestionID FROM Answer GROUP BY QuestionID HAVING COUNT(QuestionID) >= 4;

-- CÂU 8
SELECT ExamID FROM `Exam` WHERE DATE(CreateDate) <'2019-12-20' AND Duration >= 60;

-- CÂU 9
SELECT * FROM `Group` ORDER BY CreateDate DESC LIMIT 5;

-- CÂU 10
SELECT COUNT(*) AS so_luong_nhan_vien FROM `Account` WHERE DepartmentID = 2;

-- CÂU 11
SELECT * FROM `Account` WHERE FullName LIKE 'D%o';

-- CÂU 12
DELETE FROM `Exam` WHERE DATE(CreateDate) <'2019-12-20';

-- CÂU 13
DELETE FROM `Question` WHERE Content  LIKE 'câu hỏi %';

-- CÂU 14
UPDATE `Account` SET FullName = 'Nguyễn Bá Lộc' WHERE AccountID = 5;

-- CÂU 15
UPDATE `GroupAccount` SET GroupID = 4 WHERE AccountID = 5;