package com.uisrael.cursoapi.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.cursoapi.infraestructura.persistencia.jpa.CursoJpa;


public interface ICursoJpaRepositorio extends JpaRepository<CursoJpa, Integer> {

}
