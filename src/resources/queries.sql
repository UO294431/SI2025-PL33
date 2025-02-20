--Consultar el nombre de los colegiados y el titulo de los cursos  junto a su descripcion
SELECT c.nombre AS Colegiado, c1.titulo AS Curso , c1.descripcion
FROM Colegiados c
JOIN Inscripciones i ON c.id_colegiado = i.id_colegiado
JOIN Cursos c1 ON i.id_curso = c1.id_curso;

--Consultar quien tiene como poblacion Sevilla
SELECT nombre , poblacion
FROM Colegiados 
WHERE poblacion="Sevilla";

--Consultar el nombre , apellidos , titulacion y curso de los que su titulacion es Ingenieria Informatica
SELECT c.nombre, c.apellidos, c.titulacion, c1.titulo AS curso
FROM Colegiados c
JOIN Inscripciones i ON c.id_colegiado = i.id_colegiado
JOIN Cursos c1 ON i.id_curso = c1.id_curso
WHERE c.titulacion = "Ingeniería Informática";

--Consultar los colegiados cuyo id sea mayor a 2
SELECT nombre ,apellidos, poblacion
FROM Colegiados 
WHERE id_colegiado>2;