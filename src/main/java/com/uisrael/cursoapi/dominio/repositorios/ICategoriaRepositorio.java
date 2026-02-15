package com.uisrael.cursoapi.dominio.repositorios;

import java.util.List;
import java.util.Optional;

import com.uisrael.cursoapi.dominio.entidades.Categoria;

public interface ICategoriaRepositorio {
	Categoria guardar(Categoria categoria);

	Optional<Categoria> buscarPorId(int  id);

	List<Categoria> listarTodos();

	void eliminar(int id);

}
