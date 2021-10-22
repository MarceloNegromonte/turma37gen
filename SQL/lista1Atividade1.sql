CREATE DATABASE db_rh;

USE db_rh;
CREATE TABLE tb_funcionarios(
	id_funcionario INT AUTO_INCREMENT,
    nome VARCHAR(255),
    email VARCHAR(255),
    cargo VARCHAR(255),
	salario DOUBLE NULL,
    PRIMARY KEY (id_funcionario)
);

INSERT INTO tb_funcionarios(nome, email, cargo, salario) VALUES
("Marcelo","marcelo@email.com","Programador",5500.00),
("Carlos","carlos@email.com","Diretor",10000.00),
("Fred","fred@email.com","Secretario",3000.00),
("Amanda","amanda@email.com","Diretora Geral",15000.00),
("Clara","clara@email.com","Arquiteta de Sistema",7000.00);

SELECT * FROM tb_funcionarios WHERE salario>2000;

SELECT * FROM tb_funcionarios WHERE salario<2000;

USE db_rh;
UPDATE tb_funcionarios SET salario = 1500 WHERE id_funcionario =1;