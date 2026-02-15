package com.uisrael.cursoapi.dominio.entidades;

import java.io.Serializable;
import java.sql.Date;

public class Curso implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int idCurso;
	private final String nombre;
	private final String descripcion;
	private final int duracion;
	private Date fechaInicio;
	private final boolean estado; // verificar si es activo o falso
	
	private Categoria fkCategoria;
	public Curso(int idCurso, String nombre, String descripcion, int duracion, Date fechaInicio, boolean estado,
			Categoria fkCategoria) {
		this.idCurso = idCurso;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.duracion = duracion;
		this.fechaInicio = fechaInicio;
		this.estado = estado;
		this.fkCategoria = fkCategoria;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Categoria getFkCategoria() {
		return fkCategoria;
	}
	public void setFkCategoria(Categoria fkCategoria) {
		this.fkCategoria = fkCategoria;
	}
	public int getIdCurso() {
		return idCurso;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public int getDuracion() {
		return duracion;
	}
	public boolean isEstado() {
		return estado;
	}
	@Override
	public String toString() {
		return "Curso [idCurso=" + idCurso + ", nombre=" + nombre + ", descripcion=" + descripcion + ", duracion="
				+ duracion + ", fechaInicio=" + fechaInicio + ", estado=" + estado + ", fkCategoria=" + fkCategoria
				+ "]";
	}
	
	
}
