CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

CREATE TABLE tb_classe(
	id_classe INT AUTO_INCREMENT,
    nome VARCHAR(250) NOT NULL,
    codigo VARCHAR(250) NOT NULL,
    PRIMARY KEY (id_classe)
);

CREATE TABLE tb_personagem(
	id_personagem INT AUTO_INCREMENT,
    nome VARCHAR(250) NOT NULL,
    ataque INT,
    defesa INT,
    fk_id INT,
    PRIMARY KEY (id_personagem),
    FOREIGN KEY (fk_id) REFERENCES tb_classe (id_classe)
  );
  
  INSERT INTO tb_classe(nome,codigo) VALUES
  ("Mago","aaa"),
  ("Bruxo","bbb"),
  ("Assassino","ccc"),
  ("Caçador","ddd"),
  ("Guerreiro","eee");
  
  SELECT * FROM tb_classe;
  
  INSERT INTO tb_personagem (nome,ataque,defesa,fk_id) VALUES
	  ("Max", 1500,1200,1),
	  ("Gandalf",1600,1300,2),
	  ("Canner",1300,1600,3),
	  ("Freeza",1240,1760,4),
	  ("Prestor",1450,1100,5);
      
	SELECT * FROM tb_personagem WHERE ataque < 2000;
	SELECT * FROM tb_personagem WHERE defesa > 1000 AND defesa < 2000 ;
      
	SELECT * FROM tb_personagem WHERE nome LIKE 'c%';
      
	SELECT *
	FROM tb_classe -- ESQUERDA
	INNER JOIN tb_personagem -- DIREITA
	ON tb_personagem.fk_id = tb_classe.id_classe;
    
    SELECT *
	FROM tb_classe -- ESQUERDA
	INNER JOIN tb_personagem -- DIREITA
	ON tb_personagem.fk_id = tb_classe.id_classe
    WHERE id_classe = 2;
    
    
	  
   