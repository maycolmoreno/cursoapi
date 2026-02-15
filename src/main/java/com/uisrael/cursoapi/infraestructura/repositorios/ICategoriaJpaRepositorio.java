package com.uisrael.cursoapi.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.cursoapi.infraestructura.persistencia.jpa.CategoriaJpa;


public interface ICategoriaJpaRepositorio extends JpaRepository<CategoriaJpa, Integer>{

}
