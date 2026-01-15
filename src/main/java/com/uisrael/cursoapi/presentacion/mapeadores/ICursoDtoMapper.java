package com.uisrael.cursoapi.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.cursoapi.dominio.entidades.Curso;
import com.uisrael.cursoapi.presentacion.dto.request.CursoRequestDTO;
import com.uisrael.cursoapi.presentacion.dto.response.CursoResponseDTO;

@Mapper(componentModel = "spring")
public interface ICursoDtoMapper {

	Curso toDomain(CursoRequestDTO dto); // de DTO a entidad de dominio

	CursoResponseDTO toResponseDto(Curso curso); // de entidad de dominio a DTO

}
