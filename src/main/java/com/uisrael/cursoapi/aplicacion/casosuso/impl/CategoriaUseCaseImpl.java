package com.uisrael.cursoapi.aplicacion.casosuso.impl;

import java.util.List;

import com.uisrael.cursoapi.aplicacion.casosuso.entradas.ICategoriaUseCase;
import com.uisrael.cursoapi.dominio.entidades.Categoria;
import com.uisrael.cursoapi.dominio.repositorios.ICategoriaRepositorio;

public class CategoriaUseCaseImpl implements ICategoriaUseCase {
	
	private final ICategoriaRepositorio repositorio;
	
	

	public CategoriaUseCaseImpl(ICategoriaRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public Categoria crear(Categoria categoria) {
		return repositorio.guardar(categoria);
	}

	@Override
	public Categoria obtenerPorId(int id) {
		return repositorio.buscarPorId(id).orElseThrow(() -> new RuntimeException("Categoria no encontrada"));
	}

	@Override
	public List<Categoria> listar() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int id) {
		repositorio.eliminar(id);
		
	}
	
	

}
