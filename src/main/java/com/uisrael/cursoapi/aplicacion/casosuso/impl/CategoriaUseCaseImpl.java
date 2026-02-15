package com.uisrael.cursoapi.aplicacion.casosuso.impl;

import java.util.List;
import java.util.Optional;

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
        // VALIDACIÓN 1: El nombre no puede ser null o vacío
        if (categoria.getNombre() == null || categoria.getNombre().trim().isEmpty()) {
            throw new RuntimeException("El nombre de la categoría es obligatorio");
        }
        return repositorio.guardar(categoria);
	}

	@Override
	public Optional<Categoria> buscarPorId(int id) {
		return repositorio.buscarPorId(id);
	}

	@Override
	public List<Categoria> listar() {
		return repositorio.listarTodos();
	}

	
	
	@Override
	public void eliminar(int id) {
		repositorio.eliminar(id);

	}

	/*
	 * @Override public Categoria actualizar(int id, Categoria entrada) { // 1)
	 * buscar existente Categoria existente = categoriaRepo.buscarPorId(id)
	 * .orElseThrow(() -> new NoSuchElementException("Categoria " + id +
	 * " no existe"));
	 * 
	 * // 2) aplicar cambios (reglas del dominio)
	 * existente.setNombre(entrada.getNombre());
	 * existente.setDescripcion(entrada.getDescripcion());
	 * existente.setEstado(entrada.isEstado());
	 * 
	 * // 3) persistir return categoriaRepo.guardar(existente); }
	 */


}
