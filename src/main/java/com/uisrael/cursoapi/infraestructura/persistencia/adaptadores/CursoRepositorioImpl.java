package com.uisrael.cursoapi.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.cursoapi.dominio.entidades.Curso;
import com.uisrael.cursoapi.dominio.repositorios.ICursoRepositorio;
import com.uisrael.cursoapi.infraestructura.persistencia.jpa.CursoJpa;
import com.uisrael.cursoapi.infraestructura.persistencia.mapeadores.ICursoJpaMapper;
import com.uisrael.cursoapi.infraestructura.repositorios.ICursoJpaRepositorio;

public class CursoRepositorioImpl implements ICursoRepositorio {

	private final ICursoJpaRepositorio jpaRepository;
	private final ICursoJpaMapper entityMapper;

	public CursoRepositorioImpl(ICursoJpaRepositorio jpaRepository, ICursoJpaMapper entityMapper) {
		this.jpaRepository = jpaRepository;
		this.entityMapper = entityMapper;
	}


	@Override
	public Curso guardar(Curso curso) {
		CursoJpa entity = entityMapper.toEntity(curso);
		CursoJpa guardado = jpaRepository.save(entity); //insert
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Curso> buscarPorId(int id) {
		return jpaRepository.findById(id).map(entityMapper::toDomain);
	}

	@Override
	public List<Curso> listarTodos() {
		return jpaRepository.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int id) {
		jpaRepository.deleteById(id);
	}

}
