-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_sistema_coperativo
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_sistema_coperativo
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_sistema_coperativo` DEFAULT CHARACTER SET utf8 ;
USE `db_sistema_coperativo` ;

-- -----------------------------------------------------
-- Table `db_sistema_coperativo`.`categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_sistema_coperativo`.`categoria` (
  `id_categoria` INT NOT NULL AUTO_INCREMENT,
  `artesanal` ENUM('decoracao', 'alimenticio', 'cosmetico') NOT NULL,
  `forma_pagamento` ENUM('a vista', 'pix', 'cartao') NOT NULL,
  PRIMARY KEY (`id_categoria`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_sistema_coperativo`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_sistema_coperativo`.`usuario` (
  `id_usuario` INT NOT NULL AUTO_INCREMENT,
  `nome_completo` VARCHAR(255) NOT NULL,
  `email_usuario` VARCHAR(255) NOT NULL,
  `senha_usuario` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id_usuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_sistema_coperativo`.`produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_sistema_coperativo`.`produto` (
  `id_produto` INT NOT NULL AUTO_INCREMENT,
  `codigo` INT NOT NULL,
  `preco` DOUBLE NOT NULL,
  `quantidade` DOUBLE NOT NULL,
  `fk_categoria` INT NOT NULL,
  `fk_usuario` INT NOT NULL,
  PRIMARY KEY (`id_produto`, `fk_categoria`, `fk_usuario`),
  INDEX `fk_Produto_Usuario_idx` (`fk_usuario` ASC) VISIBLE,
  INDEX `fk_Produto_Categoria1_idx` (`fk_categoria` ASC) VISIBLE,
  CONSTRAINT `fk_Produto_Usuario`
    FOREIGN KEY (`fk_usuario`)
    REFERENCES `db_sistema_coperativo`.`usuario` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Produto_Categoria1`
    FOREIGN KEY (`fk_categoria`)
    REFERENCES `db_sistema_coperativo`.`categoria` (`id_categoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
