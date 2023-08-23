create database pracDB;
show databases;
use pracDB;
show tables;

create table USER(
	Id integer auto_increment,
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    primary key (Id)
);

INSERT INTO `pracDB`.`USER` (`first_name`, `last_name`) VALUES ('Yellow', 'Flash');
INSERT INTO `pracDB`.`USER` (`first_name`, `last_name`) VALUES ('White', 'Fang');

select * from USER;


