DROP TABLE IF EXISTS Inscripciones;
DROP TABLE IF EXISTS Cursos;
DROP TABLE IF EXISTS Colegiados;

CREATE TABLE Colegiados (
    id_colegiado INT PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL,
    apellidos VARCHAR(30) NOT NULL,
    DNI VARCHAR(15) NOT NULL,
    direccion VARCHAR(50) NOT NULL,
    poblacion VARCHAR(30) NOT NULL,
    fecha_nacimiento DATE,
    cuenta_bancaria VARCHAR(30),
    titulacion VARCHAR(50),
    fecha_colegiacion DATE
);

CREATE TABLE Cursos (
    id_curso INT PRIMARY KEY,
    titulo VARCHAR(30) NOT NULL,
    descripcion VARCHAR(100),
    fecha_inicio DATE NOT NULL,
    fecha_fin DATE NOT NULL,
    duracion INT,
    plazas INT,
    estado VARCHAR(15) NOT NULL
);

CREATE TABLE Inscripciones (
    id_inscripcion INT PRIMARY KEY,
    id_colegiado INT NOT NULL,
    id_curso INT NOT NULL,
    fecha_inscripcion DATE,
    FOREIGN KEY (id_colegiado) REFERENCES Colegiados(id_colegiado) ON DELETE CASCADE,
    FOREIGN KEY (id_curso) REFERENCES Cursos(id_curso) ON DELETE CASCADE
);