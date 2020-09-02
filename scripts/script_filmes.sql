-- criando instacia BD
create database filmes;

use filmes;
-- criando tabela generos
create table tb_generos(
id int not null primary key auto_increment,
descricao varchar(45) not null);

drop table tb_filmes;
-- criando tabela filmes
create table tb_filmes(
id int not null primary key auto_increment,
titulo varchar(90) not null,
ano int not null,
diretor varchar(90) not null,
duracaoMinutos int not null,
idioma varchar(30) not null,
sinopse varchar(255) not null,
idGenero int not null,
FOREIGN KEY (idGenero) REFERENCES tb_generos(id));

-- consulta tabelas
select *
from tb_generos;

desc tb_filmes;

select *
from tb_filmes;

INSERT INTO `filmes`.`tb_generos`
(`descricao`)
VALUES
('Ação'),('Animação'),('Aventura'),('Chanchada'),('Cinema catástrofe'),('Comédia'),
('Comédia romântica'),('Comédia dramática'),('Comédia de ação'),('Cult'),('Documentários'),('Drama'),
('Espionagem'),('Erótico'),('Fantasia'),('Faroeste'),('Ficção científica'),('Franchise'),
('Guerra'),('Machinima'),('Musical'),('Filme noir'),('Policial'),('Pornochanchada'),('Pornográfico'),
('Romance'),('Suspense'),('Terror'),('Trash');


INSERT INTO `filmes`.`tb_filmes`
(`titulo`,
`ano`,
`diretor`,
`duracaoMinutos`,
`idioma`,
`sinopse`,
`idGenero`)
VALUES
('Aquaman',2018,'James Wan',143,'inglês', 'Com a ajuda da princesa Mera, Arthur precisa recuperar o lendário Tridente de Atlan e aceitar seu destino como protetor das profundezas.',1);


create table tb_mais_vistos(
idGenero int not null primary key,
idFilme int not null);
