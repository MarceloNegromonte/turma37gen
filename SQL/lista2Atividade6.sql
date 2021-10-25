CREATE DATABASE db_cursoDaMinhaVida;
USE db_cursoDaMinhaVida;

CREATE TABLE tb_categoria(
	id_categoria INT AUTO_INCREMENT,
    turma VARCHAR(250),
    turno VARCHAR(250),
    PRIMARY KEY(id_categoria)
);

CREATE TABLE tb_produto(
	id_produto INT AUTO_INCREMENT,
    nome VARCHAR(250),
    nota VARCHAR(250),
    situacao VARCHAR(250),
    fk_id INT,
    PRIMARY KEY (id_produto),
    FOREIGN KEY (fk_id) REFERENCES tb_categoria (id_categoria)
);

INSERT INTO tb_categoria(turma,turno) VALUES
	("1ª ano","Manhã"),
    ("2ª ano","Tarde"),
    ("3ª ano","Noite");
    
INSERT INTO tb_produto (nome,nota,situacao,fk_id) VALUES
	("Marcelo",10,"Aprovado",1),
    ("João",7,"Aprovado",2),
    ("Camila",6,"Recuperação",3),
    ("Julia",9,"Aprovada",3),
    ("Miguel",2,"Reprovado",2);
    
SELECT * FROM tb_produto WHERE nota > 7;
SELECT * FROM tb_produto WHERE nota > 3 AND nota < 7 ;
      
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