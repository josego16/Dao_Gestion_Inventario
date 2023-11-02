CREATE TABLE usuario(
    id  INT PRIMARY KEY,
    username VARCHAR(15) UNIQUE NOT NULL,
    password VARCHAR(64) NOT NULL,
    email VARCHAR(20) NOT NULL,
    nombre VARCHAR(20) NOT NULL,
    apellidos VARCHAR(20) NOT NULL,
    telefono INT(9) NOT NULL
);
CREATE TABLE instalacion(
    id INT PRIMARY KEY,
    nombre VARCHAR(20) UNIQUE NOT NULL,
    descripcion VARCHAR(200) NOT NULL
);
CREATE TABLE horario(
    id INT PRIMARY KEY,
    hora_inicio VARCHAR(10) NOT NULL,
    hora_fin VARCHAR(10) NOT NULL,
    instalacion INT,
    FOREIGN KEY (instalacion) REFERENCES instalacion(id)

);
CREATE TABLE reserva(
    id INT PRIMARY KEY,
    usuario INT,
    horario INT,
    fecha DATE NOT NULL,
    FOREIGN KEY (usuario) REFERENCES usuario(id),
    FOREIGN KEY (horario) REFERENCES horario(id)
);
