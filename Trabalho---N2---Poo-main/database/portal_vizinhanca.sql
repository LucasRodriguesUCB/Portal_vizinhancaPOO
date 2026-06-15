drop database if exists portal_vizinhanca;

create database portal_vizinhanca;
use portal_vizinhanca;


create table Unidade (
id_unidade int primary key auto_increment,
bloco varchar (10),
numero int,
andar int
);

create table Morador (
id_morador int primary key auto_increment,
nome varchar(100) not null,
cpf varchar(20) unique,
telefone varchar(20),
email varchar(100),
id_unidade int,

foreign key (id_unidade)
	references unidade(id_unidade)); 
    
    create table UsuarioSistema(
    id_usuario int primary key auto_increment,
    login varchar(50) unique,
    senha varchar(255),
    perfil varchar(20),
    id_morador int,

    foreign key(id_morador)
        references Morador(id_morador));

create table Sindico (
    id_sindico int primary key auto_increment,
    nome varchar(100) not null,
    cpf varchar(20) unique,
    telefone varchar(20),
    email varchar(100),
    login varchar(50) unique,
    senha varchar(255));

create table Porteiro(
    id_porteiro int primary key auto_increment,
    nome varchar(100),
    cpf varchar(20),
    telefone varchar(20),
    login varchar(50),
    senha varchar(255));

create table Visitante(
    id_visitante int primary key auto_increment,
    nome varchar(100),
    cpf varchar(20),
    telefone varchar(20),
    id_morador int,
    data_visita datetime,

    foreign key(id_morador)
        references Morador(id_morador));
    
    show tables;
    
insert into Unidade (bloco, numero, andar)
values
('A', 101,1),
('A', 102,1),
('B', 201,2);

insert into Morador 
(nome, cpf, telefone, email, id_unidade)
values
('Jessika Cardoso', '143.456.789-10', '619919191', 'jessika@gmail.com',1),
('Julia Almeida', '321.678.347-98', '6199999999', 'julia@gmail.com',1),
('Lucas Alves', '891.956.127-31', '6199999999', 'lucasalves@gmail.com',1),
('Lucas Gabriel', '234.524.974-74', '6199999999', 'lucasgabriel@gmail.com',1);

insert into UsuarioSistema (login, senha, perfil, id_morador)
values
('jessika', '123456', 'Morador', 1),
('julia', '654321', 'Morador', 2);

insert into Sindico (nome, cpf, telefone, email, login, senha)
values
('Marcos Oliveira','555.444.333-22','61995555555','marcos@portal.com','sindico','123');

insert into Porteiro (nome, cpf, telefone, login, senha)
values
('Carlos Santos', '111.222.333-44', '61988888888', 'porteiro', '456');

insert into Visitante (nome, cpf, telefone, id_morador, data_visita)
values
('Pedro Santos', '999.888.777-66', '61977777777', 1, now());

select * from Unidade;
select * from Morador;
select * from UsuarioSistema;
select * from Sindico;
select * from Porteiro;
select * from Visitante;

-- mostrar qual morador mora em qual unidade
select m.nome, m.email, u.bloco, u.numero, u.andar
from Morador m
join Unidade u
on m.id_unidade = u.id_unidade;

-- mostrar o visitante e o morador que ele está visitando
select v.nome as visitante,
m.nome as Morador,
v.data_visita
from Visitante v
inner join Morador m
on v.id_morador = m.id_morador;

-- atualizar o telefone de um morador
update Morador
set telefone = '6195553364'
where id_morador = 3;

select * from Morador;

-- excluir um visitante
select * from Visitante;

delete from Visitante
where id_visitante = 1;

select * from Visitante;

-- listar todos os moradores em ordem alfabética
select * from Morador
order by nome;

-- mostrar a quantidade de moradores cadastrados
select count(*) as total_moradores
from Morador;
