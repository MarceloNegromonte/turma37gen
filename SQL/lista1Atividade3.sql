CREATE DATABASE db_escola;
USE db_escola;

CREATE TABLE tb_estudantes(
	id_estudante INT AUTO_INCREMENT,
	nome VARCHAR(250),
    idade INT,
    turma INT,
    turno VARCHAR(250),
    nota DOUBLE NULL,
    PRIMARY KEY (id_estudante)
);

INSERT INTO tb_estudantes(nome, idade, turma, turno, nota) VALUES
("Belchior","13","8", "Manha", 7.0),
("Elis","12","7", "Tarde", 6.0),
("Nelson","15","9","Tarde", 7.5),
("Alcione","11","6", "Manha", 8.5 ),
("Vanusa","10","5", "Manha", 9.0),    
("Cassiano","16","2", "Tarde", 5.5),
("Tim","17","3", "Manha", 8.0),
("Maia","14","9", "Tarde", 5.0); 

SELECT * FROM tb_estudantes WHERE nota>7.0;

SELECT * FROM tb_estudantes WHERE nota<7.0;

UPDATE tb_estudantes SET nota = 7.0 WHERE id_estudante =8;