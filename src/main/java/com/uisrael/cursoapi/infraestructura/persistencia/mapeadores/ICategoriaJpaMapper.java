package com.uisrael.cursoapi.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.cursoapi.dominio.entidades.Categoria;
import com.uisrael.cursoapi.infraestructura.persistencia.jpa.CategoriaJpa;

@Mapper(componentModel = "spring")
public interface ICategoriaJpaMapper {

	Categoria toDomain(CategoriaJpa entity);

	CategoriaJpa toEntity(Categoria curso);

}
