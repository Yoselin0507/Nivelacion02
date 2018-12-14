CREATE DATABASE peliculas;

USE peliculas;

CREATE TABLE peliculas( 
    id_contacto integer NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nombre varchar(50) NOT NULL,
    idioma varchar(30) NOT NULL,
    genero varchar(10) NOT NULL,
    duracion varchar(15) NOT NULL,
    clasificacion varchar(30) NOT NULL,
)ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO contactos (nombre, email, telefono) VALUES 
('Cadaver','pixar','ingles','terror','1:00hr','adultos');


SELECT * FROM peliculas;

CREATE USER 'root'@'localhost' IDENTIFIED BY '';
GRANT ALL PRIVILEGES ON agenda_mvc.* TO 'root'@'localhost';
FLUSH PRIVILEGES;