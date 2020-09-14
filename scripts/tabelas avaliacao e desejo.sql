
-- script temporario para criar DB usuarios e tabela usuarios
create database usuarios;

use usuarios;

create table tb_usuarios (
id_usuario int NOT NULL primary key auto_increment,
nomeUsuario varchar(45) not null,
idGenero char (1) not null,
dataNascimento date not null
);
-- fim do script temporario

-- criar tabela no database usuarios
-- criando tabela de deseja assistir filme
create table usuario_deseja_filme ( 
idUsuarioD int, 
idFilmeD int,  
foreign key (idUsuarioD) references tb_usuarios(id_usuario), 
foreign key (idFilmeD) references filmes.tb_filmes(id_filme) 
);

SELECT * FROM usuarios.usuario_deseja_filme;

-- criar tabela no database usuarios
-- criando tabela de deseja assistir filme
create table usuario_avalia_filme ( 
idUsuarioD int, 
idFilmeD int,
nota int NOT NULL,
foreign key (idUsuarioD) references tb_usuarios(id_usuario), 
foreign key (idFilmeD) references filmes.tb_filmes(id_filme) 
);

SELECT * FROM usuarios.usuario_avalia_filme;