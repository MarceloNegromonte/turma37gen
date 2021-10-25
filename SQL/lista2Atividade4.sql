CREATE DATABASE db_cidade_das_frutas;
USE db_cidade_das_frutas;

CREATE TABLE tb_categoria(
	id_categoria INT AUTO_INCREMENT,
    tipo VARCHAR(250),
    tipo_venda VARCHAR(250),
    PRIMARY KEY(id_categoria)
);

CREATE TABLE tb_produto(
	id_produto INT AUTO_INCREMENT,
    nome VARCHAR(250),
    peso INT,
    valor INT NOT NULL,
    fk_id INT,
    PRIMARY KEY (id_produto),
    FOREIGN KEY (fk_id) REFERENCES tb_categoria (id_categoria)
);

INSERT INTO tb_categoria(tipo,tipo_venda) VALUES
	("Doce","Dinheiro"),
    ("Citrica","Cartão"),
    ("Oleaginosas","Pix");
    
INSERT INTO tb_produto (nome,peso,valor,fk_id) VALUES
	("Banana",50,5,1),
    ("Acerola",5,3,2),
    ("Abacate",70,8,3),
    ("Maça",40,7,1),
    ("Laranja",30,4,2);
    
SELECT * FROM tb_produto WHERE valor > 60;
SELECT * FROM tb_produto WHERE valor > 3 AND valor < 60 ;
      
SELECT * FROM tb_produto WHERE nome LIKE 'c%';
      
SELECT *
FROM tb_categoria -- ESQUERDA
INNER JOIN tb_produto -- DIREITA
ON tb_produto.fk_id = tb_categoria.id_categoria;
    
SELECT *
FROM tb_categoria -- ESQUERDA
INNER JOIN tb_produto -- DIREITA
ON tb_produto.fk_id = tb_categoria.id_categoria
WHERE id_categoria = 2;