
insert into acesso (codigo,nome,descricao) values (1,'admin', 'admin');
--insert into acesso (id,codigo,nome,descricao) values (2,3,'cliente', 'cliente');
--insert into acesso (id,codigo,nome,descricao) values (3,3,'fornecedor', 'fornecedor');
insert into acesso (codigo,nome,descricao) values (4,'gustavo babuíno', 'gay');

insert into usuario (login, senha,nome,acesso) values ('admin', 'admin','teste',1); 

insert into categoria (id, nome) values (1, 'teste');

insert into produtos (id_produto,cod_User, nome,marca,descricao,img,preco_Compra,preco_Venda,cod_Fornecedor,cod_Categoria) values (1, 1, 'Running','Adidas','Tenis cinza para corrida','/img/product/p1.jpg', 230, 180, 1, 1);
insert into produtos (id_produto,cod_User, nome,marca,descricao,img,preco_Compra,preco_Venda,cod_Fornecedor,cod_Categoria) values (2,2, 'teste2','teste','Gustavo','/img/product/p2.jpg',10,10,1,1);
insert into produtos (id_produto,cod_User, nome,marca,descricao,img,preco_Compra,preco_Venda,cod_Fornecedor,cod_Categoria) values (3,3, 'teste3','teste','baiano','/img/product/p3.jpg',10,10,1,1);
insert into produtos (id_produto,cod_User, nome,marca,descricao,img,preco_Compra,preco_Venda,cod_Fornecedor,cod_Categoria) values (4,4, 'teste4','teste','vo assistir jojo fodase','/img/product/p4.jpg',10,10,1,1);