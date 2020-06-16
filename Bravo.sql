-- MySQL Script generated by MySQL Workbench
-- Mon Jun  8 17:15:24 2020
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema bravo
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bravo
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bravo` DEFAULT CHARACTER SET latin1 ;
USE `bravo` ;

-- -----------------------------------------------------
-- Table `bravo`.`tb_motorista`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bravo`.`tb_motorista` (
  `idMotorista` INT(11) NOT NULL AUTO_INCREMENT,
  `nomeMotorista` VARCHAR(45) NOT NULL,
  `cnhMotorista` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`idMotorista`)) 
  ENGINE = InnoDB
  AUTO_INCREMENT = 1001
  DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `bravo`.`tb_caminhao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bravo`.`tb_caminhao` (
  `idCaminhao` INT(11) NOT NULL AUTO_INCREMENT,
  `placaCaminhao` VARCHAR(8) NOT NULL,
  `modeloCaminhao` VARCHAR(45) NOT NULL,
  `pesoFinalCaminhao` DOUBLE NOT NULL,
  `pesoInicialCaminhao` DOUBLE NOT NULL,
  `idMotorista` INT(11) NOT NULL,
  PRIMARY KEY (`idCaminhao`),
  UNIQUE INDEX `placa_UNIQUE` (`placaCaminhao` ASC) ,
  KEY `fk_tb_caminhao_tb_motorista_id` (`idMotorista` ASC) ,
  CONSTRAINT `fk_tb_caminhao_tb_motorista_id`  FOREIGN KEY (`idMotorista`) REFERENCES `bravo`.`tb_motorista` (`idMotorista`))
  ENGINE = InnoDB
  AUTO_INCREMENT = 2001
  DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `bravo`.`tb_fornecedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bravo`.`tb_fornecedor` (
  `idFornecedor` INT(11) NOT NULL AUTO_INCREMENT,
  `nomeFornecedor` VARCHAR(50) NOT NULL,
  `cnpjFornecedor` VARCHAR(45) NOT NULL,
  `contatoFornecedor` VARCHAR(45) NULL DEFAULT NULL,
  `idCaminhao` INT(11) NOT NULL,
  PRIMARY KEY (`idFornecedor`),
  UNIQUE INDEX `cnpjFornecedor_UNIQUE` (`cnpjFornecedor` ASC),
  KEY `fk_tb_fornecedor_tb_caminhao_id` (`idCaminhao` ASC),
  CONSTRAINT `fk_tb_fornecedor_tb_caminhao_id` FOREIGN KEY (`idCaminhao`) REFERENCES `bravo`.`tb_caminhao` (`idCaminhao`))
  ENGINE = InnoDB
  AUTO_INCREMENT = 3001
  DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `bravo`.`tb_gerenciador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bravo`.`tb_gerenciador` (
  `idGerenciador` INT(11) NOT NULL AUTO_INCREMENT,
  `gerenciador_horarioEntrada` TIME NOT NULL,
  `gerenciador_classificacao` VARCHAR(45) NOT NULL,
  `idFornecedor` INT(11) NOT NULL,
  `idCaminhao` INT(11) NOT NULL,
  `idMotorista` INT(11) NOT NULL,
  PRIMARY KEY (`idGerenciador`),
  KEY `fk_tb_gerenciador_tb_fornecedor_id` (`idFornecedor` ASC) ,
  KEY `fk_tb_gerenciador_tb_caminhao_id` (`idCaminhao` ASC) , 
  KEY `fk_tb_gerenciador_tb_motorista_id` (`idMotorista` ASC) ,
  CONSTRAINT `fk_tb_gerenciador_tb_caminhao_id`  FOREIGN KEY (`idCaminhao`)  REFERENCES `bravo`.`tb_caminhao` (`idCaminhao`),
  CONSTRAINT `fk_tb_gerenciador_tb_fornecedor_id` FOREIGN KEY (`idFornecedor`) REFERENCES `bravo`.`tb_fornecedor` (`idFornecedor`),
  CONSTRAINT `fk_tb_gerenciador_tb_motorista_id` FOREIGN KEY (`idMotorista`)  REFERENCES `bravo`.`tb_motorista` (`idMotorista`))
  ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARACTER SET = latin1;


--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;