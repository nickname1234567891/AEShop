--建立資料庫名稱
create database if not exists AEDB;

create table memberinfo (
refcode int AUTO_INCREMENT,   
id  varchar(50),   
pswd  varchar(8),  
phone varchar(10), 
birthday datetime,  
country varchar(2),
PRIMARY KEY (refcode)
 );
insert into memberinfo (id,pswd,phone,birthday,country) values ('abbeyliu2016@gmail.com','vteam','0910392055','1987-07-21','TW');
insert into memberinfo (id,pswd,phone,birthday,country) values ('luznww@yahoo.com.tw','vteam','0972131049','1990-06-22','TW');










