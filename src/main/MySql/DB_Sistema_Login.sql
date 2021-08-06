-- drop database SistemaLogin;

create database SistemaLogin;
use SistemaLogin;

create table login(
	id_usuario   int auto_increment,
	nome_usuario varchar(30),
	senha_usuario  varchar(12),

	primary key(id_usuario)
);

select * from login;