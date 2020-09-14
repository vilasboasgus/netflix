-- criando instacia BD
create database usuarios;

use usuarios;

-- criando tabela usuarios
create table tb_usuarios(
id_usuario int not null primary key auto_increment,
nome varchar(120) not null,
data_nascimento datetime not null,
login varchar(20) not null,
email varchar(90) not null
);

INSERT INTO `usuarios`.`tb_usuarios`
(
`nome`,
`data_nascimento`,
`login`,
`email`)
VALUES
(
'Jose da silva',
'1990-01-02',
'joselito',
'joselito@gmail.com');
