package com.uisrael.cursoapi.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CategoriaRequestDTO {
	
	@NotNull
	private int idCategoria;
	@NotBlank
	private String nombre;
	@NotBlank
	private String descripcion;
	@NotNull
	private Boolean estado;

}
