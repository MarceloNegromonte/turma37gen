CREATE DATABASE db_farmacia_do_bem;
USE db_farmacia_do_bem;

CREATE TABLE tb_categoria(
	id_categoria INT AUTO_INCREMENT,
    tipo VARCHAR(250) NOT NULL,
    unidade VARCHAR(250),
    PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produto(
	id_produto INT AUTO_INCREMENT,
    nome VARCHAR(250),
    qtd INT,
    valor BIGINT NOT NULL,
    fk_id INT,
    PRIMARY KEY (id_produto),
    FOREIGN KEY (fk_id) REFERENCES tb_categoria (id_categoria)
);

INSERT INTO tb_categoria(tipo,unidade) VALUES
	("Remedio","Olinda"),
    ("Escova de dente","Recife"),
    ("Cremes","Paulista");
    
INSERT INTO tb_produto (nome,qtd,valor,fk_id) VALUES
	("Trenaden",40,10,1),
    ("Sorriso",2,10,2),
    ("Colgate",3,10,2),
    ("Skala",40,10,3),
    ("Dorflex",50,10,1);
    
 SELECT * FROM tb_produto WHERE valor > 50;        
SELECT * FROM tb_produto WHERE valor > 3 AND valor < 60;    

SELECT * FROM tb_produto WHERE nome LIKE 'b%';    

SELECT *
	FROM tb_categoria -- ESQUERDA
	INNER JOIN tb_produto -- DIREITA
	ON tb_produto.fk_id = tb_categoria.id_categoria;   
    
SELECT *
	FROM tb_categoria -- ESQUERDA
	INNER JOIN tb_produto -- DIREITA
	ON tb_produto.fk_id = tb_categoria.id_categoria
    WHERE id_categoria = 2;        