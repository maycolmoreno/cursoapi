package com.uisrael.cursoapi.presentacion.dto.request;

import java.sql.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CursoRequestDTO {

	@NotNull
	private int idCurso;
	@NotBlank
	private String nombre;
	@NotBlank
	private String descripcion;
	@NotNull
	private int duracion;
	@NotBlank
	private boolean estado;
	@NotBlank
	private Date fechaInicio;
}
