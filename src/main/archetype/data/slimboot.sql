CREATE DATABASE IF NOT EXISTS `slimboot`

USE `slimboot`;

UNLOCK TABLES;

DROP TABLE IF EXISTS `contacts`;

CREATE TABLE `contacts` (
                            `id` bigint(19) unsigned NOT NULL AUTO_INCREMENT,
                            `entity` varchar(80) NOT NULL,
                            `phone`  varchar(30),
                            `email`  varchar(80),
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `contacts` WRITE;
INSERT INTO `contacts` (`entity`, `phone`, `email`) VALUES ('David L Whitehurst', '919-605-6529', 'dlwhitehurst@gmail.com');
INSERT INTO `contacts` (`entity`, `phone`, `email`) VALUES ('Bob Smith', '919-633-9345', 'bobs@gmail.com');
UNLOCK TABLES;
