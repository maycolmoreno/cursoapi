package com.uisrael.cursoapi.presentacion.dto.request;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CursoRequestDTO {

	private int idCurso;

	@NotBlank(message = "El nombre del curso es obligatorio")
	private String nombre;
	@NotBlank
	private String descripcion;
	@NotNull
	@Min(value = 1, message = "La duración debe ser mayor a 0")
	private int duracion;
	@NotNull
	private Boolean estado;
	@NotNull(message = "La fecha de inicio es obligatoria")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaInicio;
	@NotNull(message = "La categoría es obligatoria")
	private CategoriaRequestDTO fkCategoria;
}
