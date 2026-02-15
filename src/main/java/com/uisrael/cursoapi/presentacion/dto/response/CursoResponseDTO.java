package com.uisrael.cursoapi.presentacion.dto.response;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class CursoResponseDTO {

	private int idCurso;
	private String nombre;
	private String descripcion;
	private int duracion;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Boolean  estado; // true: activo ; false: eliminado
	private Date fechaInicio;
	private CategoriaResponseDTO fkCategoria;

	
}
