CREATE TABLE IF NOT EXISTS `student` (
	id BIGINT AUTO_INCREMENT,
	first_name varchar(255) not null,
	last_name varchar(255) not null,
	PRIMARY KEY(id)
)ENGINE=InnoDB;