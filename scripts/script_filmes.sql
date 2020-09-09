-- criando instacia BD
create database filmes;

drop database filmes;

use filmes;
-- criando tabela categorias
create table tb_categorias(
id int not null primary key auto_increment,
descricao varchar(45) not null);

drop table tb_filmes;
-- criando tabela filmes
create table tb_filmes(
id int not null primary key auto_increment,
titulo varchar(90) not null,
ano int not null,
diretor varchar(90) not null,
duracao int not null,
idioma varchar(30) not null,
sinopse varchar(255) not null,
idCategoria int
 ,FOREIGN KEY (idCategoria) REFERENCES tb_categorias(id)
);

-- consulta tabelas
select *
from tb_generos;

desc tb_filmes;

select *
from tb_filmes;

INSERT INTO `filmes`.`tb_categorias`
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
`duracao`,
`idioma`,
`sinopse`,
`idCategoria`)
VALUES
('Aquaman',2018,'James Wan',143,'inglês', 'Com a ajuda da princesa Mera, Arthur precisa recuperar o lendário Tridente de Atlan e aceitar seu destino como protetor das profundezas.',1);


create table tb_mais_vistos(
idCategoria int not null primary key,
idFilme int not null,
FOREIGN KEY (idCategoria) REFERENCES tb_categorias(id),
FOREIGN KEY (idFilme) REFERENCES tb_filmes(id));

INSERT INTO `filmes`.`tb_mais_vistos`
(`idGenero`,`idFilme`)
VALUES
(1,1);

select * from tb_mais_vistos;
