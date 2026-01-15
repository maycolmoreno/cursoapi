package com.uisrael.cursoapi.presentacion.mapeadores;

import com.uisrael.cursoapi.dominio.entidades.Curso;
import com.uisrael.cursoapi.presentacion.dto.request.CursoRequestDTO;
import com.uisrael.cursoapi.presentacion.dto.response.CursoResponseDTO;
import java.sql.Date;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-15T17:03:48-0500",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.43.0.v20250819-1513, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class ICursoDtoMapperImpl implements ICursoDtoMapper {

    @Override
    public Curso toDomain(CursoRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Date fechaInicio = null;
        int idCurso = 0;
        String nombre = null;
        String descripcion = null;
        int duracion = 0;
        boolean estado = false;

        fechaInicio = dto.getFechaInicio();
        idCurso = dto.getIdCurso();
        nombre = dto.getNombre();
        descripcion = dto.getDescripcion();
        duracion = dto.getDuracion();
        estado = dto.isEstado();

        Curso curso = new Curso( idCurso, nombre, descripcion, duracion, fechaInicio, estado );

        return curso;
    }

    @Override
    public CursoResponseDTO toResponseDto(Curso curso) {
        if ( curso == null ) {
            return null;
        }

        CursoResponseDTO cursoResponseDTO = new CursoResponseDTO();

        cursoResponseDTO.setIdCurso( curso.getIdCurso() );
        cursoResponseDTO.setNombre( curso.getNombre() );
        cursoResponseDTO.setDescripcion( curso.getDescripcion() );
        cursoResponseDTO.setDuracion( curso.getDuracion() );
        cursoResponseDTO.setEstado( curso.isEstado() );
        cursoResponseDTO.setFechaInicio( curso.getFechaInicio() );

        return cursoResponseDTO;
    }
}
