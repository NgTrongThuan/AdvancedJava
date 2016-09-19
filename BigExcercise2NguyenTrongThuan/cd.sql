-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Lun 19 Septembre 2016 à 09:06
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `cdstore`
--

-- --------------------------------------------------------

--
-- Structure de la table `cd`
--

CREATE TABLE IF NOT EXISTS `cd` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(150) NOT NULL,
  `singer` varchar(150) NOT NULL,
  `numbersongs` int(11) NOT NULL,
  `price` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=7 ;

--
-- Contenu de la table `cd`
--

INSERT INTO `cd` (`id`, `name`, `singer`, `numbersongs`, `price`) VALUES
(1, 'CD1', 'Singer 1', 55, 50000),
(2, 'CD2', 'Singer 2', 50, 250000),
(3, 'CD3', 'Singer 3', 23, 320000),
(5, 'CD4', 'Singer 4', 20, 175000),
(6, 'CD6', 'Singer 6', 50, 620000);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
