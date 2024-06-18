create table users(
id INT(11) primary key,
username VARCHAR(100),
password VARCHAR(225),
roles varchar(10)
);

insert into users (id,username,password, roles) values (NULL,'Ali','1234','admin'),(NULL,'Ahmad','4567','user');

select*from users
