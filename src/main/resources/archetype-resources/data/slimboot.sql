/**
 Copyright 2022 FortyTwoBinary and David L Whitehurst.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

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
INSERT INTO `contacts` (`entity`, `phone`, `email`) VALUES ('Sally Jones', '919-745-1289', 'sjones@gmail.com');
INSERT INTO `contacts` (`entity`, `phone`, `email`) VALUES ('Bob Smith', '919-633-9345', 'bobs@gmail.com');
UNLOCK TABLES;
