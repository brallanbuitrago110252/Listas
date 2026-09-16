/*---------------------------------
                 CONSTRAINTS
------------------------------------*/

-- CONSTRAINT TABLA PERFILES
	CONSTRAINT pk_id_perfil PRIMARY KEY(id_perfil)
	CONSTRAINT notNull_nombrePerfil not null (nombre_perfil)
	CONSTRAINT notNull_nombrePerfil not null (descripcion)

-- CONSTRAINT TABLA USUARIOS
	CONSTRAINT pk_id_usuario PRIMARY KEY (id_usuario)
	CONSTRAINT nn_nombre NOT NULL (nombre)
	CONSTRAINT nn_email NOT NULL(email)
	CONSTRAINT unq_email UNIQUE (email)
	CONSTRAINT nn_Fecha_creacion NOT NULL(fecha_creacion)
	CONSTRAINT fk_usuario_perfil FOREIGN KEY (id_perfil) REFERENCES PERFILES(id_perfil)
    
-- CONSTRAINT TABLA PERMISOS
	CONSTRAINT PK_id_permiso PRIMARY KEY(id_permiso)
	CONSTRAINT notNull_nombre_Permiso not null (nombre_Permiso)

-- CONSTRAINT TABLA PERMISOS
	CONSTRAINT pk_recursos PRIMARY KEY (id_recurso)
	CONSTRAINT nn_nombre_recurso NOT NULL (nombre_recurso)
	CONSTRAINT nn_nivel_sensibilidad NOT NULL (nivel_sensibilidad)
    CONSTRAINT fk_recurso_usuario FOREIGN KEY (id_usuario) REFERENCES USUARIOS(id_usuario)
    
-- CONSTRAINT TABLA RECURSOS
	CONSTRAINT pk_recurso PRIMARY KEY (id_recurso)
    CONSTRAINT nn_nombre_recurso NOT NULL (nombre_recurso)
    CONSTRAINT nn_nivel_sensibilidad NOT NULL (nivel_sensibilidad)
    CONSTRAINT fk_usuario_perfil_recurso NOT NULL (id_usuario)

-- CONSTRAINT TABLA SESIONES
	CONSTRAINT pk_id_sesion PRIMARY KEY (id_sesion)
    CONSTRAINT nn_fecha_inicio NOT NULL (fecha_inicio)
    CONSTRAINT nn_activa NOT NULL (activa)
    CONSTRAINT fk_sesion_usuario FOREIGN KEY (id_usuario) REFERENCES USUARIOS(id_usuario)
    
 -- CONSTRAINT TABLA INTENTOS
	CONSTRAINT pk_id_intento PRIMARY KEY (id_intento)
	CONSTRAINT nn_fecha_intento NOT NULL (fecha_intento)
    CONSTRAINT nn_exitoso NOT NULL (exitoso)
    CONSTRAINT fk_id_usuario FOREIGN KEY (id_usuario) REFERENCES USUARIOS(id_usuario)


 -- CONSTRAINT TABLA AUDITORIAS
	CONSTRAINT pk_id_auditoria PRIMARY KEY (id_auditoria)
    CONSTRAINT nn_accion NOT NULL (accion)
    CONSTRAINT nn_fecha_hora NOT NULL (fecha_hora)
    CONSTRAINT nn_resultado NOT NULL (resultado)
    CONSTRAINT fk_auditoria_id_usuario FOREIGN KEY (id_usuario) REFERENCES USUARIOS(id_usuario)
    CONSTRAINT fk_auditoria_id_recurso FOREIGN KEY (id_recurso) REFERENCES RECURSOS(id_recurso)

-- CONSTRAINT TABLA PERFIL_RECURSO_PERMISO 
	CONSTRAINT pk_id_perfil_permiso_recurso PRIMARY KEY (id_permiso_recurso)
    CONSTRAINT nn_id_permiso NOT NULL (id_permiso) 
    CONSTRAINT nn_id_recurso NOT NULL (id_recurso)
    CONSTRAINT nn_id_perfil NOT NULL (id_perfil)
	CONSTRAINT fk_prp_permiso FOREIGN KEY (id_permiso) REFERENCES PERMISOS(id_permiso),
    CONSTRAINT fk_prp_recurso FOREIGN KEY (id_recurso) REFERENCES RECURSOS(id_recurso),
    CONSTRAINT fk_prp_perfil FOREIGN KEY (id_perfil) REFERENCES PERFILES(id_perfil),
-- INDICE TABLA PERFIL_RECURSO_PERMISO
    CONSTRAINT uq_perfil_recurso_permiso UNIQUE (id_perfil, id_recurso, id_permiso) -- Evita duplicados lógicos

	
    

