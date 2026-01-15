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

	public Curso(int idCurso, String nombre, String descripcion, int duracion,Date fechaInicio, boolean estado) {
		this.idCurso = idCurso;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.duracion = duracion;
		this.estado = estado;
		this.fechaInicio =fechaInicio;
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

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Override
	public String toString() {
		return "Curso [idCurso=" + idCurso + ", nombre=" + nombre + ", descripcion=" + descripcion + ", duracion="
				+ duracion + ", fechaInicio=" + fechaInicio + ", estado=" + estado + "]";
	}
	
	
	
	

}
