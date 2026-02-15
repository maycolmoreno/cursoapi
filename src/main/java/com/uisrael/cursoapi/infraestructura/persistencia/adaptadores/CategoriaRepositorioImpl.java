package com.uisrael.cursoapi.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.cursoapi.dominio.entidades.Categoria;
import com.uisrael.cursoapi.dominio.repositorios.ICategoriaRepositorio;
import com.uisrael.cursoapi.infraestructura.persistencia.jpa.CategoriaJpa;
import com.uisrael.cursoapi.infraestructura.persistencia.mapeadores.ICategoriaJpaMapper;
import com.uisrael.cursoapi.infraestructura.repositorios.ICategoriaJpaRepositorio;

public class CategoriaRepositorioImpl implements ICategoriaRepositorio {

	private final ICategoriaJpaRepositorio jpaRepository;
	private final ICategoriaJpaMapper entityMapper;

	public CategoriaRepositorioImpl(ICategoriaJpaRepositorio jpaRepository, ICategoriaJpaMapper entityMapper) {
		this.jpaRepository = jpaRepository;
		this.entityMapper = entityMapper;
	}

	@Override
	public Categoria guardar(Categoria categoria) {
		CategoriaJpa entity = entityMapper.toEntity(categoria);
		CategoriaJpa guardado = jpaRepository.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Categoria> buscarPorId(int  id) {
		return jpaRepository.findById(id).map(entityMapper::toDomain);
	}

	@Override
	public List<Categoria> listarTodos() {
		return jpaRepository.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int id) {
		jpaRepository.deleteById(id);
	}

}
