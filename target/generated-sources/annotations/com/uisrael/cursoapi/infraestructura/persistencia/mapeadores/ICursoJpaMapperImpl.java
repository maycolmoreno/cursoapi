package com.uisrael.cursoapi.infraestructura.persistencia.mapeadores;

import com.uisrael.cursoapi.dominio.entidades.Curso;
import com.uisrael.cursoapi.infraestructura.persinstencia.jpa.CursoJpa;
import java.sql.Date;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-15T17:34:46-0500",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.43.0.v20250819-1513, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class ICursoJpaMapperImpl implements ICursoJpaMapper {

    @Override
    public Curso toDomain(CursoJpa entity) {
        if ( entity == null ) {
            return null;
        }

        Date fechaInicio = null;
        int idCurso = 0;
        String nombre = null;
        String descripcion = null;
        int duracion = 0;
        boolean estado = false;

        fechaInicio = entity.getFechaInicio();
        idCurso = entity.getIdCurso();
        nombre = entity.getNombre();
        descripcion = entity.getDescripcion();
        duracion = entity.getDuracion();
        estado = entity.isEstado();

        Curso curso = new Curso( idCurso, nombre, descripcion, duracion, fechaInicio, estado );

        return curso;
    }

    @Override
    public CursoJpa toEntity(Curso curso) {
        if ( curso == null ) {
            return null;
        }

        CursoJpa cursoJpa = new CursoJpa();

        cursoJpa.setDescripcion( curso.getDescripcion() );
        cursoJpa.setDuracion( curso.getDuracion() );
        cursoJpa.setEstado( curso.isEstado() );
        cursoJpa.setFechaInicio( curso.getFechaInicio() );
        cursoJpa.setIdCurso( curso.getIdCurso() );
        cursoJpa.setNombre( curso.getNombre() );

        return cursoJpa;
    }
}
