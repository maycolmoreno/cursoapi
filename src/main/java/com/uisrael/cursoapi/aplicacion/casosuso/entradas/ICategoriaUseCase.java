package com.uisrael.cursoapi.aplicacion.casosuso.entradas;

import java.util.List;
import java.util.Optional;

import com.uisrael.cursoapi.dominio.entidades.Categoria;


public interface ICategoriaUseCase {

	Categoria crear(Categoria categoria);

	Optional<Categoria> buscarPorId(int id);

	List<Categoria> listar();

	void eliminar(int idCategoria);

	// Categoria actualizar(int id, Categoria categoria);

}
