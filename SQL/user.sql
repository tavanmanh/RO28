
USE bot;
DROP TABLE IF EXISTS wc_match;
CREATE TABLE wc_match(
	id INT PRIMARY KEY AUTO_INCREMENT,
    match_name VARCHAR(100) ,
    match_code INTtbl_agendatbl_agenda,
    start_time DATETIME,
    result VARCHAR(10),
    state INT ,
    status INT DEFAULT 1
); 
CREATE TABLE wc_prediction(
	id INT PRIMARY KEY AUTO_INCREMENT,
    match_id INT ,
    user_id INT,
    result VARCHAR(10),
    pre_time DATETIME,
    state INT,
    status INT DEFAULT 1
);