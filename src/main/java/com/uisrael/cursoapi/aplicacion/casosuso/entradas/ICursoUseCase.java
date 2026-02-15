package com.uisrael.cursoapi.aplicacion.casosuso.entradas;

import java.util.List;

import com.uisrael.cursoapi.dominio.entidades.Curso;

public interface ICursoUseCase {
	
	Curso crear (Curso curso);
	Curso obtenerPorId(int id);
	List<Curso> listar();
	void eliminar(int id);
    Curso actualizarFechaYCategoria(Integer id, java.sql.Date fechaInicio, com.uisrael.cursoapi.dominio.entidades.Categoria fkCategoria);

}
