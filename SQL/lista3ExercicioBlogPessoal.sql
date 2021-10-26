-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_BlogPessoal
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_BlogPessoal
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_BlogPessoal` DEFAULT CHARACTER SET utf8 ;
USE `db_BlogPessoal` ;

-- -----------------------------------------------------
-- Table `db_BlogPessoal`.`Temas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_BlogPessoal`.`Temas` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_BlogPessoal`.`Usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_BlogPessoal`.`Usuarios` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  `usuario` VARCHAR(255) NOT NULL,
  `senha` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_BlogPessoal`.`Postagens`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_BlogPessoal`.`Postagens` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(255) NOT NULL,
  `texto` VARCHAR(255) NOT NULL,
  `data` TIMESTAMP NOT NULL,
  `temas_id` BIGINT NOT NULL,
  `Usuarios_id` BIGINT NOT NULL,
  PRIMARY KEY (`id`, `temas_id`, `Usuarios_id`),
  INDEX `fk_Temas_has_Usuarios_Usuarios1_idx` (`Usuarios_id` ASC) VISIBLE,
  INDEX `fk_Temas_has_Usuarios_Temas_idx` (`temas_id` ASC) VISIBLE,
  CONSTRAINT `fk_Temas_has_Usuarios_Temas`
    FOREIGN KEY (`temas_id`)
    REFERENCES `db_BlogPessoal`.`Temas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Temas_has_Usuarios_Usuarios1`
    FOREIGN KEY (`Usuarios_id`)
    REFERENCES `db_BlogPessoal`.`Usuarios` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
