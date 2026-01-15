package com.uisrael.cursoapi.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.cursoapi.dominio.entidades.Categoria;
import com.uisrael.cursoapi.presentacion.dto.request.CategoriaRequestDTO;
import com.uisrael.cursoapi.presentacion.dto.response.CategoriaResponseDTO;

@Mapper(componentModel = "spring")
public interface ICategoriaDtoMapper {

	Categoria toDomain(CategoriaRequestDTO dto); // de DTO a entidad de dominio

	CategoriaResponseDTO toResponseDto(Categoria categoria); // de entidad de dominio a DTO

}
