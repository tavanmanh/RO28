-- Câu 1
DROP VIEW IF EXISTS `sale`;
CREATE VIEW `sale` AS
	SELECT A.* FROM `Department` D
	JOIN  `Account` A
	ON A.DepartmentID = D.DepartmentID
	WHERE D.DepartmentName = 'Sale';

-- Câu 2
DROP VIEW IF EXISTS `acc`;
CREATE VIEW `acc` AS
WITH CTE_DEP1 AS (
	SELECT 	A.* ,COUNT(A.AccountID) AS 'SL' FROM `Account` A
	JOIN 	`GroupAccount` GA
	ON			A.AccountID = GA.AccountID
	GROUP BY 	GA.AccountID
)
	SELECT * FROM `CTE_DEP1`
    WHERE SL = (SELECT MAX(SL) FROM `CTE_DEP1`);
    
-- Câu 3
	CREATE VIEW `CT` AS
	SELECT * FROM `Question`
	WHERE length(Content) > 300;
	DROP VIEW IF EXISTS `CT`;

-- Câu 4
DROP VIEW IF EXISTS `Dpa`;
CREATE VIEW `Dpa` AS
WITH CTE_2 AS (
	SELECT 	D.* ,COUNT(A.DepartmentID) AS 'SL' FROM `Account` A
	RIGHT JOIN 	`Department` D
	ON			D.DepartmentID = A.DepartmentID
	GROUP BY 	D.DepartmentID
)
	SELECT * FROM `CTE_2`
    WHERE SL = (SELECT MAX(SL) FROM `CTE_2`);
    
-- Câu 5
DROP VIEW IF EXISTS `hoNguyen`;
CREATE VIEW `hoNguyen` AS
	SELECT 		Q.*
	FROM 		`Question` Q
	INNER JOIN 	`Account` A
	ON			Q.CreatorID = A.AccountID
	WHERE 		A.FullName LIKE 'NGYỄN%';

