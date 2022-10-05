-- Câu 1
SELECT * FROM `Account` LEFT JOIN `Department` ON `Account`.DepartmentID=`Department`.DepartmentID;

-- Câu 2
SELECT * FROM `Account` WHERE DATE(CreateDate) >'2010-12-20';

-- Câu 3
SELECT * FROM `Account` WHERE PositionID=1;

-- Câu 4
SELECT `Department`.DepartmentID,`Department`.DepartmentName FROM `Account` INNER JOIN `Department` ON `Account`.DepartmentID=`Department`.DepartmentID  GROUP BY `Account`.DepartmentID HAVING COUNT(`Account`.DepartmentID) >= 4;

-- Câu 5
SELECT  * FROM `Question` WHERE QuestionID=(SELECT QuestionID FROM `ExamQuestion` GROUP BY  QuestionID ORDER BY COUNT(QuestionID) DESC LIMIT 1);
SELECT  * FROM `ExamQuestion` LEFT JOIN `Question` ON `Question`.QuestionID=`ExamQuestion`.QuestionID GROUP BY  `ExamQuestion`.QuestionID  ORDER BY COUNT(`ExamQuestion`.QuestionID) DESC LIMIT 1;

-- Câu 6
SELECT  `CategoryQuestion`.CategoryID,`CategoryQuestion`.CategoryName,COUNT(`Question`.QuestionID) FROM `CategoryQuestion` LEFT JOIN `Question` ON `CategoryQuestion`.CategoryID=`Question`.CategoryID GROUP BY  `CategoryQuestion`.CategoryID  ORDER BY COUNT(`Question`.QuestionID) ;

-- Câu 7
SELECT  `Question`.QuestionID,COUNT(`ExamQuestion`.QuestionID) FROM `Question` LEFT JOIN `ExamQuestion` ON `Question`.QuestionID=`ExamQuestion`.QuestionID GROUP BY  `Question`.QuestionID  ORDER BY COUNT(`ExamQuestion`.QuestionID) ;

-- Câu 8
SELECT  * FROM `Question` JOIN `Answer` ON `Question`.QuestionID=`Answer`.QuestionID GROUP BY  `Question`.QuestionID  ORDER BY COUNT(`Answer`.QuestionID) DESC LIMIT 1;

-- Câu 9
SELECT  `Group`.GroupID,COUNT(`GroupAccount`.GroupID) FROM `Group` LEFT JOIN `GroupAccount` ON `Group`.GroupID=`GroupAccount`.GroupID GROUP BY  `Group`.GroupID  ORDER BY COUNT(`GroupAccount`.GroupID) ;

-- Câu 10
SELECT  `Position`.PositionID,`Position`.PositionName,COUNT(`Account`.PositionID) FROM `Position` LEFT JOIN `Account` ON  `Position`.PositionID= `Account`.PositionID GROUP BY  `Position`.PositionID  ORDER BY COUNT(`Account`.PositionID) LIMIT 1 ;
