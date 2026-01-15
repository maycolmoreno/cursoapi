package com.uisrael.cursoapi.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.cursoapi.infraestructura.persinstencia.jpa.CursoJpa;


public interface ICursoJpaRepositorio extends JpaRepository<CursoJpa, Integer> {

}
