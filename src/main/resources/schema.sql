drop table if exists USERS;
drop table if exists BOOKS;

create table USERS(
  ID int not null AUTO_INCREMENT,
  EMAIL varchar(100) not null,
  PASSWORD varchar(50) not null,
  PRIMARY KEY ( ID )
);


create table BOOKS(
  ID int not null AUTO_INCREMENT,
  NAME varchar(50) not null,
  DETAILS varchar(50) not null,
  PRICE double not null,
  IMAGE varchar(200) not null,
  PRIMARY KEY ( ID )
);