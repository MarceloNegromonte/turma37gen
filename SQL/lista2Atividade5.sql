CREATE DATABASE db_construindo_a_nossa_vida;
USE db_construindo_a_nossa_vida;

CREATE TABLE tb_categoria(
	id_categoria INT AUTO_INCREMENT,
    tipo VARCHAR(250),
    tipo_venda VARCHAR(250),
    PRIMARY KEY(id_categoria)
);

CREATE TABLE tb_produto(
	id_produto INT AUTO_INCREMENT,
    nome VARCHAR(250),
    qtde INT,
    valor INT NOT NULL,
    fk_id INT,
    PRIMARY KEY (id_produto),
    FOREIGN KEY (fk_id) REFERENCES tb_categoria (id_categoria)
);

INSERT INTO tb_categoria(tipo,tipo_venda) VALUES
	("Obra","Dinheiro"),
    ("Interior","Cartão"),
    ("Diverso","Pix");
    
INSERT INTO tb_produto (nome,qtde,valor,fk_id) VALUES
	("Argamassa",10,25,1),
    ("Cimento",10,10,1),
    ("Pá",10,8,3),
    ("Chuveiro",10,100,3),
    ("Janela",10,70,2);
    
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