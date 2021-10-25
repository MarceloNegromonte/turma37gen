CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;

CREATE TABLE tb_categoria(
	id_categoria INT AUTO_INCREMENT,
    status_pedido VARCHAR(250) NOT NULL,
    entrega VARCHAR(250),
    PRIMARY KEY(id_categoria)
);

CREATE TABLE tb_pizza(
	id_pizza INT AUTO_INCREMENT,
    sabor VARCHAR(250),
    tamanho VARCHAR(250),
    valor BOOLEAN,
    fk_id INT,
    PRIMARY KEY (id_pizza),
    FOREIGN KEY (fk_id) REFERENCES tb_categoria (id_categoria)
);

INSERT INTO tb_categoria (status_pedido,entrega) VALUE
	("Fazendo","Retirada"),
    ("Entregue","Domicilio"),
    ("Esperando","Retirada");
    
INSERT INTO tb_pizza (sabor,tamanho,valor,fk_id) VALUE
		("Mussarela","Grande",45,1),
        ("Calabresa","Média",30,2),
        ("Camarão","Pequena",50,1),
        ("Marguerita","Grande",40,3),
        ("Chocolate","Pequena",70,3);
        
SELECT * FROM tb_pizza WHERE valor > 45;        
SELECT * FROM tb_pizza WHERE valor > 29 AND valor < 60;    

SELECT * FROM tb_pizza WHERE sabor LIKE 'c%';    

SELECT *
	FROM tb_categoria -- ESQUERDA
	INNER JOIN tb_pizza -- DIREITA
	ON tb_pizza.fk_id = tb_categoria.id_categoria;
    
SELECT *
	FROM tb_categoria -- ESQUERDA
	INNER JOIN tb_produto -- DIREITA
	ON tb_produto.fk_id = tb_categoria.id_categoria
    WHERE id_categoria = 2;    
    