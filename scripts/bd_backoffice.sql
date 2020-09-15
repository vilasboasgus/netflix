-- criando instacia BD
create database backoffice_netflix;

-- drop table chamados;

-- criando tabela chamados
create table chamados(
idChamado int not null primary key auto_increment,
cpfPessoa varchar(14),
nomePessoa varchar(100),
emailPessoa varchar(65),
detalheChamado varchar(255),
dataChamado date,
idCategoria int,
foreign key (idCategoria) references categoria (idCategoria) );

CREATE TABLE categoria (
idCategoria int not null primary key auto_increment,
categoria varchar(50) NOT NULL);

-- consulta tabela categoria
select *
from categoria;

select *
from chamados;

-- truncate table categoria

-- inserindo dados na tabela de categoria
insert into categoria (categoria) values ('Assinante'), ('Nao Assinante'), ('Tecnico'), ('Outros');
insert into categoria (categoria) values ('Financeiro');
