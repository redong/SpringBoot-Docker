CREATE TABLE Student (
	id BIGINT AUTO_INCREMENT,
	first_name varchar(255) not null,
	last_name varchar(255) not null,
	PRIMARY KEY(id)
);

insert into Student (first_name, last_name) values ('michael', 'Jordan');