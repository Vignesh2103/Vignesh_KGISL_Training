USE Carstore;
 
CREATE TABLE `car` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `model` varchar(128) NOT NULL,
  `comany` varchar(45) NOT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `book_id_UNIQUE` (`id`),
  UNIQUE KEY `title_UNIQUE` (`model`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=LATIN1

DESC carstore.car;