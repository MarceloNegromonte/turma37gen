CREATE DATABASE db_loja;

USE db_loja;

CREATE TABLE tb_usuarios (
	id_usuario INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255),
    email VARCHAR(255),
    senha VARCHAR(255),
    carteira FLOAT NULL,
    PRIMARY KEY (id_usuario)
);

CREATE TABLE tb_produtos(
	id_produto int AUTO_INCREMENT,
    produto VARCHAR(255),
    preco FLOAT,
    fk_usuario INT,
    PRIMARY KEY (id_produto),
    FOREIGN KEY (fk_usuario) REFERENCES tb_usuarios(id_usuario)
);

CREATE TABLE tb_ordens(
	id_ordem INT AUTO_INCREMENT,
    data_ordem DATE,
    status_or VARCHAR(255),
    email_comprador VARCHAR(255),
    chave FLOAT NULL,
	fk_produto INT,
    PRIMARY KEY (id_ordem),
    FOREIGN KEY (fk_produto) REFERENCES tb_produtos (id_produto)
);

-- ALTER
ALTER TABLE tb_ordens CHANGE COLUMN data_ordem data_ordem DATE NOT NULL ;

ALTER TABLE tb_produtos ADD foto_produto VARCHAR(255) NULL ;

ALTER TABLE tb_ordens MODIFY COLUMN email_comprador CHAR(20) ;

ALTER TABLE tb_produtos DROP COLUMN foto_produto ;

-- DROP
DROP DATABASE tb_usuarios ;
DROP DATABASE tb_produtos ;
DROP DATABASE tb_ordens ;
DROP DATABASE tb_loja ;

