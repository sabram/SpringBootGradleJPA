--script to setup database
--needs to be manually run;
FLUSH PRIVILEGES;
DROP SCHEMA IF EXISTS springjpa;
CREATE SCHEMA `springjpa` DEFAULT CHARACTER SET utf8 ;
DROP USER 'springjpauser'@'localhost';
CREATE USER 'springjpauser'@'localhost' IDENTIFIED BY 'springjpauserpw';
GRANT SELECT,INSERT,UPDATE,DELETE
  ON springjpa.*
  TO 'springjpauser'@'localhost';

use springjpa;
CREATE TABLE pet (name VARCHAR(20), owner VARCHAR(20),
species VARCHAR(20), sex CHAR(1), birth DATE, death DATE);

use springjpa;
DROP TABLE IF EXISTS customer;
CREATE TABLE customer (
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(20),
last_name VARCHAR(20));

