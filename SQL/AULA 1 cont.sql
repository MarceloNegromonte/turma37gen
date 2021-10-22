-- DML (Linguagem de manipulação de dados)
-- INSERT --|			CREATE 
-- UPDATE   |---> CRUD	UPDATE
-- DELETE   |			DELETE
-- SELECT___|			READ


-- INSERT
INSERT INTO tb_usuarios (nome, email, senha, carteira)
VALUES
("Bart Boaz", "bart@email.com","134652",0.0);

INSERT INTO tb_usuarios (nome, email, senha, carteira)
VALUES
("Amancio", "amancio@email.com","134652",0.0),
("Julia Boaz", "juylia@email.com","134652",0.0);

INSERT INTO tb_produtos (produto, preco, fk_usuario)
VALUES
("Macarronada ao molho branco ",12.00,1);

-- SELECT
SELECT * FROM tb_usuarios ;
SELECT * FROM tb_produtos ;
SELECT * FROM tb_ordens ;

SELECT produto, preco FROM tb_produtos ORDER BY preco ASC ;

SELECT status_ordem AS 'STATUS', COUNT(*) AS Quantidade
FROM tb_ordens
GROUP BY status_ordem;

UPDATE tb_usuarios
SET senha = "987654"
WHERE id_usuario = 1;

SET SQL_SAFE_UPDATES =0;

UPDATE tb_usuarios
SET nome = "Bartolomeu Boaz"
WHERE email = "bart@email.com";

-- DELETE pra linha -- DROP PRA TABELA
DELETE FROM tb_ordens
WHERE id_ordem = 3;


