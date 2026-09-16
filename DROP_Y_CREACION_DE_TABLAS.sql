


-- DROP DE LAS TABLAS
DROP TABLE auditorias;
DROP TABLE intentos;
DROP TABLE perfil_recurso_permiso;
DROP TABLE perfiles;
DROP TABLE permisos;
DROP TABLE recursos;
DROP TABLE sesiones;
DROP TABLE usuarios;

CREATE TABLE PERFILES (
    id_perfil INT,
    nombre_perfil VARCHAR(100),
    descripcion VARCHAR(255)
);


CREATE TABLE USUARIOS (
    id_usuario INT,
    nombre VARCHAR(255),
    email VARCHAR(255),
    contrasena VARCHAR(255),
    id_perfil INT,
    fecha_creacion TIMESTAMP DEFAULT now(),
    ultimo_login TIMESTAMP
);



CREATE TABLE PERMISOS (
    id_permiso INT,
    nombre_permiso VARCHAR(100)
);


CREATE TABLE RECURSOS (
    id_recurso INT,
    nombre_recurso VARCHAR(255),
    nivel_sensibilidad INT,
    id_usuario INT-- Propietario o creador del recurso
);

	

CREATE TABLE SESIONES (
    id_sesion INT,
    fecha_inicio TIMESTAMP  ,
    fecha_cierre TIMESTAMP,
    ip_origen VARCHAR(45), 
    activa BOOLEAN  DEFAULT TRUE,
    id_usuario INT
);



CREATE TABLE INTENTOS (
    id_intento INT ,
    fecha_intento TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    exitoso BOOLEAN,
    ip_origen VARCHAR(45),
    id_usuario INT 
);


CREATE TABLE AUDITORIAS (
    id_auditoria INT,
    accion VARCHAR(255),
    fecha_hora TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    ip_origen VARCHAR(45),
    resultado VARCHAR(255),
    id_usuario INT,
    id_recurso INT
 
);

CREATE TABLE PERFIL_RECURSO_PERMISO (
    id_perfil_permiso_recurso INT,
    id_permiso INT ,
    id_recurso INT,
    id_perfil INT
);

