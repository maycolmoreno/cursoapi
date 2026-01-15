package com.uisrael.cursoapi.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.uisrael.cursoapi.aplicacion.casosuso.entradas.ICategoriaUseCase;
import com.uisrael.cursoapi.aplicacion.casosuso.entradas.ICursoUseCase;
import com.uisrael.cursoapi.aplicacion.casosuso.impl.CategoriaUseCaseImpl;
import com.uisrael.cursoapi.aplicacion.casosuso.impl.CursoUseCaseImpl;
import com.uisrael.cursoapi.dominio.repositorios.ICategoriaRepositorio;
import com.uisrael.cursoapi.dominio.repositorios.ICursoRepositorio;
import com.uisrael.cursoapi.infraestructura.persistencia.adaptadores.CategoriaRepositorioImpl;
import com.uisrael.cursoapi.infraestructura.persistencia.adaptadores.CursoRepositorioImpl;
import com.uisrael.cursoapi.infraestructura.persistencia.mapeadores.ICategoriaJpaMapper;
import com.uisrael.cursoapi.infraestructura.persistencia.mapeadores.ICursoJpaMapper;
import com.uisrael.cursoapi.infraestructura.repositorios.ICategoriaJpaRepositorio;
import com.uisrael.cursoapi.infraestructura.repositorios.ICursoJpaRepositorio;

@Configuration
public class ConfiguracionGeneral {

	@Bean
	ICursoUseCase cursoUseCase(ICursoRepositorio repositorio) {
		return new CursoUseCaseImpl(repositorio);
	}
	
	@Bean
	ICategoriaUseCase categoriaUseCase(ICategoriaRepositorio repositorio) {
		return new CategoriaUseCaseImpl(repositorio);
	}
	
	@Bean
	ICursoRepositorio cursoRepositorio(ICursoJpaRepositorio jpaRepositorio, ICursoJpaMapper mapper) {
		return new CursoRepositorioImpl(jpaRepositorio, mapper);
	}
	
	@Bean
	ICategoriaRepositorio categoriaRepositorio(ICategoriaJpaRepositorio jpaRepositorio, ICategoriaJpaMapper mapper) {
		return new CategoriaRepositorioImpl(jpaRepositorio, mapper);
	}
}
