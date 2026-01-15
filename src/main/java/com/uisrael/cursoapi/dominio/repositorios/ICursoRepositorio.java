package com.uisrael.cursoapi.dominio.repositorios;

import java.util.List;
import java.util.Optional;

import com.uisrael.cursoapi.dominio.entidades.Curso;

public interface ICursoRepositorio {
	Curso guardar(Curso curso);

	Optional<Curso> buscarPorId(int id);

	List<Curso> listarTodos();

	void eliminar(int id);

}
