create database Tienda
use Tienda

Create table producto
(
ID CHAR(5) NOT NULL PRIMARY KEY,
CATEGORIA VARCHAR(20) NOT NULL,
NOMBRES VARCHAR(20) NOT NULL
)
INSERT INTO PRODUCTO(ID, CATEGORIA, NOMBRES) VALUES 
('1', 'CATEGORIA 1','TELEVISION'),
('2','CATEGORIA 2','ABAROOTES'),
('3','CATEGORIA 3','AUTOS'),
('4','CATEGORIA 4','JUGUETES')
SELECT*FROM PRODUCTO


create database bdagenda
use bdagenda
create table tb_agenda(
id int(11) not null auto_increment,
apellidos varchar(45) default null,
nombres varchar(45) default null,
direccion varchar(45) default null,
edad int(11) default null,
primary key (id)
)

select*from tb_agenda
