-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Lun 26 Novembre 2018 à 16:10
-- Version du serveur :  5.6.20-log
-- Version de PHP :  5.4.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `developpement`
--

-- --------------------------------------------------------

--
-- Structure de la table `programmeur`
--

CREATE TABLE IF NOT EXISTS `programmeur` (
  `courriel` varchar(50) NOT NULL DEFAULT '',
  `nom` varchar(50) DEFAULT NULL,
  `langages` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `programmeur`
--

INSERT INTO `programmeur` (`courriel`, `nom`, `langages`) VALUES
('bbrowett0@hexun.com', 'Byrle Browett', 'javascript,java,python'),
('dallix1@g.co', 'Dilan Allix', 'c++,c,java,c#'),
('dsomerled2@va.gov', 'Dal Somerled', 'swift,c#'),
('tgorcke3@simplemachines.org', 'Toiboid Gorcke', 'sql,perl,c++'),
('cvowdon4@sina.com.cn', 'Christye Vowdon', 'c++,vb.net,vb6'),
('apitrasso5@infoseek.co.jp', 'Arleyne Pitrasso', 'python,php,perl'),
('lblacksell6@creativecommons.org', 'Lonni Blacksell', 'c++,java'),
('emarc7@cam.ac.uk', 'Ethelyn Marc', 'c,javascript,typescript'),
('amacauley8@people.com.cn', 'Agna Macauley', 'typescript,c#'),
('mabys9@ucoz.ru', 'Maire Abys', 'objective-c'),
('galpsa@smh.com.au', 'Gwenny Alps', 'pl-sql,c#,sql'),
('gmockesrq@hibu.com', 'Glynnis Mockes', 'python,swift'),
('moumene@gmail.com', 'Moumene', 'java,c#,typescript'),
('momo@gmail.com', 'Momo', 'c++,java,c#'),
('titi@gmail.com', 'Titi', 'typescript,javascript,swift'),
('houda@gmail.com', 'Jedidi Houda', 'c++,python,html,javascript,java,c#,php'),
('anas@gmail.com', 'Anas', 'java,c++,c#,javascript,typescript,sql'),
('dinar@gmail.com', 'Dinar', 'swift');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `programmeur`
--
ALTER TABLE `programmeur`
 ADD PRIMARY KEY (`courriel`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
