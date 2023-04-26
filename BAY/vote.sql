CREATE TABLE `voters` (
    `s_no`  INT(20) NOT NULL AUTO_INCREMENT,
  `voter_id`  VARCHAR(30) NOT NULL,
  `name` VARCHAR(30) NOT NULL,
  `email` VARCHAR(55) NOT NULL,
  `password` VARCHAR(55) NOT NULL,
  `age` INT(20) NOT NULL,
  `gender`VARCHAR(10) NOT NULL,
  `ward` VARCHAR(60) NOT NULL,
  PRIMARY KEY (`voter_id`),
  UNIQUE KEY(`s_no`),
  UNIQUE KEY (`email`)
)