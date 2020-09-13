-- criando instacia BD
create database filmes;

-- drop database filmes;

use filmes;

-- criando tabela categorias
create table tb_categorias(
id_categoria int not null primary key auto_increment,
descricao varchar(45) not null);

-- drop table tb_filmes;
-- criando tabela filmes
create table tb_filmes(
id_filme int not null primary key auto_increment,
titulo varchar(90) not null,
ano int not null,
diretor varchar(90) not null,
duracao int not null,
idioma varchar(30) not null,
sinopse varchar(255) not null,
id_categoria int not null
 ,FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id_categoria)
);

-- consulta tabelas
-- select * from tb_categorias;

-- select * from tb_filmes;

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
`id_categoria`)
VALUES
('Aquaman',2018,'James Wan',143,'inglês', 'Com a ajuda da princesa Mera, Arthur precisa recuperar o lendário Tridente de Atlan e aceitar seu destino como protetor das profundezas.',1),
('MIB: Homens de Preto Internacional',2019,'F. Gary Gray',115,'inglês', 'Esses dois agentes secretos se envolvem em uma série de ataques alienígenas que os levam viajando pelo mundo.',1),
('300: A Ascenção do Imperio',2014,'Noam Murro',147,'inglês', 'O novo capítulo da épica saga leva a ação a outro tipo de campo de batalha, o mar, à medida que o político e general ateniense Temístocles busca unir a Grécia ao liderar um exército naval que tentará mudar o rumo da guerra.',1),
('Baywatch',2017,'Seth Gordon',116,'inglês', 'O enredo segue o salva-vidas Mitch Buchannon e sua equipe, que em um esforço para salvar sua praia tem que derrubarem um traficante.',6),
('Toy Story',1995,'John Lasseter',81,'inglês', 'Em um mundo onde os brinquedos são seres vivos que fingem não ter vida quando os humanos estão por perto, um boneco caubói de pano chamado Xerife Woody é o brinquedo favorito de Andy Davis, um garoto de seis anos.',2),
('Jumanji: A proxima fase',2019,'Jake Kasdan',123,'inglês', 'Sem que seus amigos soubessem, Spencer manteve as peças do videogame Jumanji e trabalhou em segredo durante algum tempo na casa de seu avô na reconstrução do Jogo no porão da casa.',3),
('Sr. & Sra. Smith',2005,'Doug Liman',120,'inglês', 'O filme abre com o executivo de construção John e a consultora de tecnologia Jane Smith respondendo a perguntas durante uma terapia de casal.',7),
('Os Goonies',1985,'Os Goonies',111,'inglês', 'Após encontrar um mapa do tesouro no sótão de sua casa, Mickey, Brand, Bocão (Mouth), Dado (Data) e Gordo (Chunk) partem em busca do tesouro de Willy Caolho.',10),
('Extraordinário',2017,'Stephen Chbosky',113,'inglês', 'August "Auggie" Pullman é um garoto de 10 anos que nasceu com uma rara deformidade facial médica, a que ele se refere como "disostose mandibulofacial", e passou por 27 cirurgias diferentes para ver, cheirar, falar e ouvir sem um aparelho auditivo.',12),
('Interstellar',2014,'Christopher Nolan',169,'inglês', 'Pragas nas colheitas fizeram a civilização humana regredir para uma sociedade agrária em futuro de data desconhecida.',17),
('Annabelle 3: De Volta Para Casa',2019,'Gary Dauberman',106,'inglês', 'Em 1968, os demonologistas Ed e Lorraine Warren levam a boneca Annabelle para sua casa, após as alegações de duas enfermeiras, Debbie e Camilla, de que a boneca frequentemente realizava atividades paranormais em seu apartamento.',28);




-- drop table tb_mais_vistos;

create table tb_mais_vistos(
id_categoria int not null primary key,
id_filme int not null,
FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id_categoria),
FOREIGN KEY (id_filme) REFERENCES tb_filmes(id_filme));

INSERT INTO `filmes`.`tb_mais_vistos`
(`id_categoria`,`id_filme`)
VALUES
(1,1),
(4,6),
(5,2),
(6,3),
(7,7);

-- truncate table tb_mais_vistos;

-- select * from tb_mais_vistos;
