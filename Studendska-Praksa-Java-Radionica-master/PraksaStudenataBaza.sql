/*
SQLyog Community v13.1.9 (64 bit)
MySQL - 10.4.27-MariaDB : Database - praksastudentabaza
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`praksastudentabaza` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `praksastudentabaza`;

/*Table structure for table `kompanija` */

DROP TABLE IF EXISTS `kompanija`;

CREATE TABLE `kompanija` (
  `pib` int(8) NOT NULL,
  `nazivKompanije` varchar(100) DEFAULT NULL,
  `mesto` varchar(100) DEFAULT NULL,
  `webAdresa` varchar(100) DEFAULT NULL,
  `zipCode` varchar(20) NOT NULL,
  PRIMARY KEY (`pib`),
  KEY `zipCode` (`zipCode`),
  CONSTRAINT `zipCode` FOREIGN KEY (`zipCode`) REFERENCES `mesto` (`zipCode`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

/*Data for the table `kompanija` */

/*Table structure for table `korisnici` */

DROP TABLE IF EXISTS `korisnici`;

CREATE TABLE `korisnici` (
  `korisnickoIme` varchar(20) DEFAULT NULL,
  `sifra` varchar(20) DEFAULT NULL,
  `id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

/*Data for the table `korisnici` */

/*Table structure for table `mesto` */

DROP TABLE IF EXISTS `mesto`;

CREATE TABLE `mesto` (
  `nazivMesta` varchar(100) DEFAULT NULL,
  `zipCode` varchar(20) NOT NULL,
  PRIMARY KEY (`zipCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

/*Data for the table `mesto` */

/*Table structure for table `modul` */

DROP TABLE IF EXISTS `modul`;

CREATE TABLE `modul` (
  `nazivModula` varchar(50) DEFAULT NULL,
  `idModula` int(11) NOT NULL,
  `idSP` int(11) DEFAULT NULL,
  PRIMARY KEY (`idModula`),
  KEY `idSP` (`idSP`),
  CONSTRAINT `idSP` FOREIGN KEY (`idSP`) REFERENCES `studijskiprogram` (`idSP`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

/*Data for the table `modul` */

/*Table structure for table `praksa` */

DROP TABLE IF EXISTS `praksa`;

CREATE TABLE `praksa` (
  `nazivPrakse` varchar(100) DEFAULT NULL,
  `datum_od` date NOT NULL,
  `datum_do` date DEFAULT NULL,
  `godinaStudija` int(1) DEFAULT NULL,
  `pib` int(8) NOT NULL,
  `idPrakse` int(11) DEFAULT NULL,
  PRIMARY KEY (`datum_od`),
  KEY `pib` (`pib`),
  CONSTRAINT `praksa_ibfk_1` FOREIGN KEY (`pib`) REFERENCES `kompanija` (`pib`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

/*Data for the table `praksa` */

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `ime` varchar(50) NOT NULL,
  `prezime` varchar(50) NOT NULL,
  `datumRodjenja` date DEFAULT NULL,
  `godinaUpisa` int(4) DEFAULT NULL,
  `indeks` varchar(9) NOT NULL,
  `nivoSatudija` varchar(20) DEFAULT NULL,
  `fonEmail` varchar(50) DEFAULT NULL,
  `licniEmail` varchar(50) DEFAULT NULL,
  `idModula` int(11) NOT NULL,
  PRIMARY KEY (`indeks`),
  KEY `idModula` (`idModula`),
  CONSTRAINT `student_ibfk_1` FOREIGN KEY (`idModula`) REFERENCES `modul` (`idModula`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

/*Data for the table `student` */

/*Table structure for table `studijskiprogram` */

DROP TABLE IF EXISTS `studijskiprogram`;

CREATE TABLE `studijskiprogram` (
  `imeSP` varchar(100) DEFAULT NULL,
  `idSP` int(11) NOT NULL,
  PRIMARY KEY (`idSP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

/*Data for the table `studijskiprogram` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
