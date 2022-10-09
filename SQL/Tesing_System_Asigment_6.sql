-- CÂU 1
DELIMITER $$
DROP PROCEDURE IF EXISTS GetAllAccount $$
CREATE PROCEDURE GetAllAccount(Department VARCHAR(30))
BEGIN
	(SELECT * 
    FROM `Department` 
    JOIN `Account` ON `Department`.DepartmentID= `Account`.DepartmentID 
    WHERE `Department`.DepartmentName=Department);
END; $$
DELIMITER ;
CALL GetAllAccount('sale')

-- CÂU 2
DELIMITER $$  
DROP PROCEDURE IF EXISTS GetCountAccountGroup $$
CREATE PROCEDURE GetCountAccountGroup()
BEGIN
	SELECT  `Group`.GroupID,COUNT(`GroupAccount`.GroupID) 
	FROM `Group` LEFT JOIN `GroupAccount` ON `Group`.GroupID=`GroupAccount`.GroupID 
    GROUP BY  `Group`.GroupID ;
END; $$
DELIMITER ;
CALL GetCountAccountGroup

-- CÂU 3
DELIMITER $$  
DROP PROCEDURE IF EXISTS MQ $$
CREATE PROCEDURE MQ()
BEGIN
	SELECT Q.TypeID,COUNT(Q.TypeID)
	FROM `Question` Q 
    WHERE MONTH(Q.CreateDate)=MONTH(CURRENT_DATE()) AND YEAR(Q.CreateDate)=YEAR(CURRENT_DATE())
    GROUP BY  Q.TypeID ;
END; $$
DELIMITER ;
CALL MQ;

-- CÂU 4
DROP PROCEDURE IF EXISTS MTQ ;
DELIMITER $$  
CREATE PROCEDURE MTQ(OUT id int)
BEGIN
	WITH CTE_DEP1 AS(
	SELECT TypeID,COUNT(TypeID) AS SL FROM `Question` GROUP BY TypeID 
    )
    SELECT TypeID INTO id FROM `CTE_DEP1`
    WHERE SL = (SELECT MAX(SL) FROM `CTE_DEP1`);
END; $$
DELIMITER ;

DROP FUNCTION IF EXISTS FT_MTQ;
DELIMITER $$
 CREATE FUNCTION FT_MTQ() 
 RETURNS INT 
 DETERMINISTIC
    BEGIN
        DECLARE BIEN INT;
        WITH CTE_DEP2 AS (
			SELECT Q.TypeID, COUNT(TypeID) AS SL 
            FROM `Question` Q 
            GROUP BY Q.TypeID 
		)
		SELECT TypeID INTO BIEN 
        FROM `CTE_DEP2`
		WHERE SL = (SELECT MAX(SL) FROM `CTE_DEP2`);
        RETURN BIEN;
    END $$
DELIMITER ;
SELECT FT_MTQ();

-- CÂU 5
SET @ID=0;
CALL MTQ(@ID);
SELECT TypeName FROM `TypeQuestion` WHERE TypeID = @ID;
-- CÂU 6
DELIMITER $$
DROP PROCEDURE IF EXISTS GetGroupName $$
CREATE PROCEDURE GetGroupName(chuoi VARCHAR(30))
BEGIN
	SELECT * 
    FROM `Group` 
    WHERE GroupName LIKE CONCAT('%',chuoi,'%');
END; $$
DELIMITER ;
CALL GetGroupName('anpha')

-- CÂU 7
DELIMITER $$
DROP PROCEDURE IF EXISTS InsertAccount $$
CREATE PROCEDURE InsertAccount(addemail VARCHAR(100),addfullname VARCHAR(100))
BEGIN
	INSERT INTO `Account`(Email,Username,FullName,DepartmentID,PositionID)
    VALUES (addemail,SUBSTR('tavanmanh421999@gmail.com',1,INSTR('tavanmanh421999@gmail.com','@')-1),addfullname, '1', '2');
END; $$
DELIMITER ;
CALL InsertAccount('tavanmanh421999@gmail.com','tạ văn mạnh');

-- CÂU 8
DROP PROCEDURE IF EXISTS sp_getMaxNameQuesFormNameType;
DELIMITER $$
CREATE PROCEDURE sp_getMaxNameQuesFormNameType( IN var_Choice VARCHAR(50))
BEGIN
	DECLARE v_TypeID TINYINT UNSIGNED;
	SELECT tq.TypeID INTO v_TypeID FROM typequestion tq
	WHERE tq.TypeName = var_Choice;
	IF var_Choice = 'Essay' THEN
		WITH CTE_LengContent AS(
SELECT length(q.Content) AS leng FROM question q
WHERE TypeID = v_TypeID)
		SELECT * FROM question q
		WHERE TypeID = v_TypeID
		AND length(q.Content) = (SELECT MAX(leng) FROM CTE_LengContent);
	ELSEIF var_Choice = 'Multiple-Choice' THEN
		WITH CTE_LengContent AS(
		SELECT length(q.Content) AS leng FROM question q
		WHERE TypeID = v_TypeID)
		SELECT * FROM question q
		WHERE TypeID = v_TypeID
		AND length(q.Content) = (SELECT MAX(leng) FROM CTE_LengContent);
	END IF;
END$$
DELIMITER ;
-- CÂU 9
DELIMITER $$
DROP PROCEDURE IF EXISTS DeleteExam $$
CREATE PROCEDURE DeleteExam(Id INT)
BEGIN
	DELETE FROM `Exam` WHERE ExamID=Id;
END; $$
DELIMITER ;
CALL DeleteExam(1);

-- CÂU 11
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
-- CÂU 12
DROP PROCEDURE IF EXISTS sp_CountQuesInMonth;
DELIMITER $$
CREATE PROCEDURE sp_CountQuesInMonth()
BEGIN
	WITH CTE_12Months AS (
		SELECT 1 AS MONTH
		UNION SELECT 2 AS MONTH
		UNION SELECT 3 AS MONTH
		UNION SELECT 4 AS MONTH
		UNION SELECT 5 AS MONTH
		UNION SELECT 6 AS MONTH
		UNION SELECT 7 AS MONTH
		UNION SELECT 8 AS MONTH
		UNION SELECT 9 AS MONTH
		UNION SELECT 10 AS MONTH
		UNION SELECT 11 AS MONTH
		UNION SELECT 12 AS MONTH
		)
SELECT M.MONTH, count(MONTH(Q1.CreateDate)) AS SL FROM CTE_12Months M
LEFT JOIN `Question` Q1 ON M.MONTH = MONTH(Q1.CreateDate) AND YEAR(Q1.CreateDate) = YEAR(now())
GROUP BY M.MONTH;
END$$
DELIMITER ;
Call sp_CountQuesInMonth();

-- CÂU 13
DROP PROCEDURE IF EXISTS sp_CountQuesBefore6Month;
DELIMITER $$
CREATE PROCEDURE sp_CountQuesBefore6Month()
	BEGIN
		WITH CTE_Talbe_6MonthBefore AS (
		SELECT MONTH(DATE_SUB(NOW(), INTERVAL 5 MONTH)) AS MONTH
        UNION
		SELECT MONTH(DATE_SUB(NOW(), INTERVAL 4 MONTH)) AS MONTH
		UNION
		SELECT MONTH(DATE_SUB(NOW(), INTERVAL 3 MONTH)) AS MONTH
		UNION
		SELECT MONTH(DATE_SUB(NOW(), INTERVAL 2 MONTH)) AS MONTH
		UNION
		SELECT MONTH(DATE_SUB(NOW(), INTERVAL 1 MONTH)) AS MONTH
		UNION
		SELECT MONTH(NOW()) AS MONTH
)
SELECT M.MONTH, CASE
WHEN COUNT(QuestionID) = 0 THEN 'không có câu hỏi nào trong tháng'
ELSE COUNT(QuestionID)
END AS SL
FROM CTE_Talbe_6MonthBefore M
LEFT JOIN `Question` Q ON MONTH(Q.CreateDate)=M.MONTH AND YEAR(Q.CreateDate) = YEAR(now())
GROUP BY M.MONTH
ORDER BY M.MONTH ASC;
END$$
DELIMITER ;
-- Run:
CALL sp_CountQuesBefore6Month;