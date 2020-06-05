SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `Bravo` DEFAULT CHARACTER SET latin1 ;

USE `Bravo` ;

CREATE TABLE IF NOT EXISTS `Bravo`.`tb_fornecedor` (
  `idFornecedor` INT(11) NOT NULL AUTO_INCREMENT,
  `nomeFornecedor` VARCHAR(50) NOT NULL,
  `cnpjFornecedor` VARCHAR(45) NOT NULL,
  `contatoFornecedor` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idFornecedor`),
  UNIQUE INDEX `cnpjFornecedor_UNIQUE` (`cnpjFornecedor` ASC))
  ENGINE = InnoDB
  AUTO_INCREMENT = 18
  DEFAULT CHARACTER SET = latin1;

CREATE TABLE IF NOT EXISTS `Bravo`.`tb_caminhao` (
  `idCaminhao` INT(11) NOT NULL AUTO_INCREMENT,
  `placaCaminhao` VARCHAR(8) NOT NULL,
  `modeloCaminhao` VARCHAR(45) NOT NULL,
  `pesoFinalCaminhao` VARCHAR(45) NOT NULL,
  `pesoInicialCaminhao` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCaminhao`),
  UNIQUE INDEX `placa_UNIQUE` (`placaCaminhao` ASC))
  ENGINE = InnoDB
  AUTO_INCREMENT = 18
  DEFAULT CHARACTER SET = latin1;

CREATE TABLE IF NOT EXISTS `Bravo`.`tb_motorista` (
  `idMotorista` INT(11) NOT NULL AUTO_INCREMENT,
  `nomeMotorista` VARCHAR(45) NOT NULL,
  `cnhMotorista` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`idMotorista`))
  ENGINE = InnoDB
  AUTO_INCREMENT = 18
  DEFAULT CHARACTER SET = latin1;

CREATE TABLE IF NOT EXISTS `Bravo`.`tb_gerenciador` (
  `idGerenciador` INT(11) NOT NULL AUTO_INCREMENT,
  `gerenciador_nomeFornecedor` VARCHAR(60) NOT NULL,
  `gerenciador_placaCaminhao` VARCHAR(8) NOT NULL,
  `gerenciador_nomeMotorista` VARCHAR(50) NOT NULL,
  `gerenciador_horarioEntrada` date NOT NULL,
  PRIMARY KEY (`idGerenciador`))
  ENGINE = InnoDB
  AUTO_INCREMENT = 18
  DEFAULT CHARACTER SET = latin1;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;