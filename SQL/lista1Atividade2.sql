CREATE DATABASE db_ecommerce;
USE db_ecommerce;

CREATE TABLE tb_produtos(
	id_produto INT AUTO_INCREMENT,
    nome VARCHAR(255),
    marca VARCHAR(255),
    tipo VARCHAR(255),
    valor DOUBLE NULL,
    PRIMARY KEY (id_produto)
    );
    
INSERT INTO tb_produtos(nome, marca, tipo, valor) VALUES
("Tv","Samsung","Aparelho Eletrônico",3000.00),
("Celular","Iphone","Celulares",7000.00),
("Ar Condicionado","Consul","Ar Condionado Splint",2000.00),
("Cadeira Gamer","Pichau Hask","Moveis",450.00),
("Ventilador","Arno","Eletrodomestico",200.00),    
("CAMA BOX","Ortobom","CAMA", 1500.00),
("BARBEADOR","Philips","Eletronicos", 250.00),
("Batedeira","Sony","Eletrodomestico", 400.00);  

SELECT * FROM tb_produtos WHERE valor>500; 

SELECT * FROM tb_produtos WHERE valor<500;

UPDATE tb_produtos SET valor = 550 WHERE id_produto =4;