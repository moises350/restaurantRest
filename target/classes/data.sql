INSERT INTO CARDAPIO(ID,NOME, DESCRICAO) VALUES (1, 'X-Bacon','Bacon, hamb�rguer de carne, queijo');
INSERT INTO CARDAPIO(ID,NOME, DESCRICAO) VALUES (2, 'X-Burger','Hamb�rguer de carne, queijo');
INSERT INTO CARDAPIO(ID,NOME, DESCRICAO) VALUES (3, 'X-Egg','Ovo, hamb�rguer de carne,queijo');
INSERT INTO CARDAPIO(ID,NOME, DESCRICAO) VALUES (4, 'X-Egg Bacon','Ovo, bacon, hamb�rguer de carne, queijo');

INSERT INTO CARDAPIO_INGREDIENTE (ID, ID_INGREDIENTE, ID_PEDIDO) VALUES (1,2,1);
INSERT INTO CARDAPIO_INGREDIENTE (ID, ID_INGREDIENTE, ID_PEDIDO) VALUES (2,3,1);
INSERT INTO CARDAPIO_INGREDIENTE (ID, ID_INGREDIENTE, ID_PEDIDO) VALUES (3,4,1);

INSERT INTO CARDAPIO_INGREDIENTE (ID, ID_INGREDIENTE, ID_PEDIDO) VALUES (4,3,2);
INSERT INTO CARDAPIO_INGREDIENTE (ID, ID_INGREDIENTE, ID_PEDIDO) VALUES (5,5,2);

INSERT INTO CARDAPIO_INGREDIENTE (ID, ID_INGREDIENTE, ID_PEDIDO) VALUES (6,4,3);
INSERT INTO CARDAPIO_INGREDIENTE (ID, ID_INGREDIENTE, ID_PEDIDO) VALUES (7,3,3);
INSERT INTO CARDAPIO_INGREDIENTE (ID, ID_INGREDIENTE, ID_PEDIDO) VALUES (8,5,3);

INSERT INTO CARDAPIO_INGREDIENTE (ID, ID_INGREDIENTE, ID_PEDIDO) VALUES (9,4,4);
INSERT INTO CARDAPIO_INGREDIENTE (ID, ID_INGREDIENTE, ID_PEDIDO) VALUES (10,2,4);
INSERT INTO CARDAPIO_INGREDIENTE (ID, ID_INGREDIENTE, ID_PEDIDO) VALUES (11,3,4);
INSERT INTO CARDAPIO_INGREDIENTE (ID, ID_INGREDIENTE, ID_PEDIDO) VALUES (12,5,4);

INSERT INTO INGREDIENTE(ID,DESCRICAO,VALUE) VALUES (1,'Alface', 0.4);
INSERT INTO INGREDIENTE(ID,DESCRICAO,VALUE )VALUES (2,'Bacon', 2);
INSERT INTO INGREDIENTE(ID,DESCRICAO,VALUE )VALUES (3,'Hamburguer de Carne', 3);
INSERT INTO INGREDIENTE(ID,DESCRICAO,VALUE )VALUES (4,'Ovo', 0.8);
INSERT INTO INGREDIENTE(ID,DESCRICAO,VALUE )VALUES (5,'Queijo', 1.5);

INSERT INTO PEDIDO(ID,VALUE) VALUES(1,6.5);
INSERT INTO PEDIDO(ID,VALUE) VALUES(2, 4.5);
INSERT INTO PEDIDO(ID,VALUE) VALUES(3, 5.3);
INSERT INTO PEDIDO(ID,VALUE) VALUES(4, 7.3);

-- x-bacon default
INSERT INTO PEDIDO_INGREDIENTE (ID,ID_CARDAPIO,ID_INGREDIENTE)  VALUES(1,1,2);
INSERT INTO PEDIDO_INGREDIENTE (ID,ID_CARDAPIO,ID_INGREDIENTE)  VALUES(2,1,3);
INSERT INTO PEDIDO_INGREDIENTE (ID,ID_CARDAPIO,ID_INGREDIENTE)  VALUES(3,1,5);

-- x-burguer default 
INSERT INTO PEDIDO_INGREDIENTE (ID,ID_CARDAPIO,ID_INGREDIENTE)  VALUES(4,2,3);
INSERT INTO PEDIDO_INGREDIENTE (ID,ID_CARDAPIO,ID_INGREDIENTE)  VALUES(5,2,5);

--x-egg default
INSERT INTO PEDIDO_INGREDIENTE (ID,ID_CARDAPIO,ID_INGREDIENTE)  VALUES(6,3,4);
INSERT INTO PEDIDO_INGREDIENTE (ID,ID_CARDAPIO,ID_INGREDIENTE)  VALUES(7,3,3);
INSERT INTO PEDIDO_INGREDIENTE (ID,ID_CARDAPIO,ID_INGREDIENTE)  VALUES(8,3,5);

--x-egg-bacon default
INSERT INTO PEDIDO_INGREDIENTE (ID,ID_CARDAPIO,ID_INGREDIENTE)  VALUES(9,4,4);
INSERT INTO PEDIDO_INGREDIENTE (ID,ID_CARDAPIO,ID_INGREDIENTE)  VALUES(10,4,2);
INSERT INTO PEDIDO_INGREDIENTE (ID,ID_CARDAPIO,ID_INGREDIENTE)  VALUES(11,4,3);
INSERT INTO PEDIDO_INGREDIENTE (ID,ID_CARDAPIO,ID_INGREDIENTE)  VALUES(12,4,5);