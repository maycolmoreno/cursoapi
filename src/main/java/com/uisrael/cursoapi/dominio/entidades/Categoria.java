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
	private final boolean estado;

	public Categoria(int idCategoria, String nombre, String descripcion, boolean estado) {
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

	public boolean isEstado() {
		return estado;
	}
	
	

}
