package com.uisrael.cursoapi.presentacion.dto.response;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CategoriaResponseDTO {
	
	private int idCategoria;
	@NotBlank(message = "El nombre de la categoría es obligatorio")
	private String nombre;
	private String descripcion;
	private Boolean estado;
	
	
}
