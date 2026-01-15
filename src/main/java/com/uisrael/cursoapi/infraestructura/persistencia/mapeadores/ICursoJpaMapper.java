package com.uisrael.cursoapi.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.cursoapi.dominio.entidades.Curso;
import com.uisrael.cursoapi.infraestructura.persinstencia.jpa.CursoJpa;

@Mapper(componentModel = "spring")
public interface ICursoJpaMapper {

	Curso toDomain(CursoJpa entity);

	CursoJpa toEntity(Curso curso);

}
