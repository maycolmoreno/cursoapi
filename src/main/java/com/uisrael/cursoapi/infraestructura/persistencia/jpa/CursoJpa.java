package com.uisrael.cursoapi.infraestructura.persistencia.jpa;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "cap_curso")
public class CursoJpa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCurso;
	@Column(name = "cur_nombre", length = 80)
	private String nombre;
	private String descripcion;
	private int duracion;
	private Date fechaInicio;
	private Boolean estado;
	
	@ManyToOne
	@JoinColumn(name="fkCategoria")
	private CategoriaJpa fkCategoria;

}
