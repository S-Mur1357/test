drop database if exists logindb_muramatsu02;
create database logindb_muramatsu02;
use logindb_muramatsu02;

create table user(
	id int,
	user_name varchar(255),
	password varchar(255)
);

insert into user values(1,"Ichiro","123");
insert into user values(2,"Jiro","456");
insert into user values(3,"Saburo","789");

