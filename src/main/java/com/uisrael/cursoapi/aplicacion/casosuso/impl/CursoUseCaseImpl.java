
package com.uisrael.cursoapi.aplicacion.casosuso.impl;

import java.util.List;

import com.uisrael.cursoapi.aplicacion.casosuso.entradas.ICursoUseCase;
import com.uisrael.cursoapi.dominio.entidades.Curso;
import com.uisrael.cursoapi.dominio.repositorios.ICursoRepositorio;


public class CursoUseCaseImpl implements ICursoUseCase {

    private final ICursoRepositorio repositorio;

    public CursoUseCaseImpl(ICursoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Curso crear(Curso curso) {
        return repositorio.guardar(curso);
    }

    @Override
    public Curso obtenerPorId(int id) {
        // Reemplazar "-&gt;" por "->" y usar Optional correctamente
        return repositorio.buscarPorId(id).orElseThrow(() -> new RuntimeException("Curso no encontrado"));
        // Recomendación: usar una excepción propia (ver abajo).
    }

    @Override
    public List<Curso> listar() {
        return repositorio.listarTodos();
    }

    @Override
    public void eliminar(int id) {
        repositorio.eliminar(id);
    }
    
        @Override
        public Curso actualizarFechaYCategoria(Integer id, java.sql.Date fechaInicio, com.uisrael.cursoapi.dominio.entidades.Categoria fkCategoria) {
            Curso existente = obtenerPorId(id);
            existente.setFechaInicio(fechaInicio);
            existente.setFkCategoria(fkCategoria);
            return repositorio.guardar(existente);
        }
}
