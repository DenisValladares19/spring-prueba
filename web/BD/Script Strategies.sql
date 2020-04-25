create database strategies;
use strategies;

create table persona(
idPersona int primary key auto_increment,
PrimerNombre varchar(50),
SegundoNombre varchar(50),
PrimerApellido varchar(50),
SegundoApellido varchar(50),
FechaNacimiento datetime,
Sexo int,
InformacionAdicional varchar(50)
);


create table usuario(
idUsuario int primary key auto_increment,
nombreUsuario varchar(12),
password varchar(50)
);