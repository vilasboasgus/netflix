-- criando tabela historico de filmes assistidos
create table tb_historico(
id_Historico int not null primary key auto_increment,
id_Usuario int, 
tituloFilme  varchar(90) not null,
descricaoCategoria varchar(45) not null,
dataVisualizacao date,
index (id_Usuario)
);

INSERT INTO `usuarios`.`tb_historico`
(`id_Usuario`,
`tituloFilme`,
`descricaoCategoria`,
`dataVisualizacao`)
VALUES
('1', 'Aquaman','Ação', '2020-02-10'),
('1', 'MIB: Homens de Preto Internacional','Ação', '2018-12-10'),
('1', '300: A Ascenção do Imperio','Ação', '2019-10-10'),
('3', 'Baywatch','Comédia', '2020-03-13'),
('3', 'Toy Story','Animação', '2020-02-10'),
('2', 'Aquaman','Ação', '2019-12-19'),
('9', 'Jumanji: A proxima fase','Aventura', '2020-06-18'),
('9', 'Aquaman','Ação', '2019-12-19');

SELECT `tb_historico`.`id_Historico`,
    `tb_historico`.`id_Usuario`,
    `tb_historico`.`tituloFilme`,
    `tb_historico`.`descricaoCategoria`,
    `tb_historico`.`dataVisualizacao`
FROM `usuarios`.`tb_historico`;