package com.uisrael.cursoapi.dominio.entidades;

import java.io.Serializable;

public class Categoria implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final int idCategoria;
	private final String nombre;
	private final String descripcion;
	private final Boolean estado;
	public Categoria(int idCategoria, String nombre, String descripcion, Boolean estado) {
		this.idCategoria = idCategoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public Boolean getEstado() {
		return estado;
	}
	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", estado=" + estado + "]";
	}

	

	
}
