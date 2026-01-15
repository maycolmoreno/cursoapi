package com.uisrael.cursoapi.aplicacion.casosuso.entradas;

import java.util.List;

import com.uisrael.cursoapi.dominio.entidades.Categoria;


public interface ICategoriaUseCase {
	
	Categoria crear (Categoria categoria);
	Categoria obtenerPorId(int id);
	List<Categoria> listar();
	void eliminar(int id);

}
