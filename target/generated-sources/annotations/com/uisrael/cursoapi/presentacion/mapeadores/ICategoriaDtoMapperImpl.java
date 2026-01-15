package com.uisrael.cursoapi.presentacion.mapeadores;

import com.uisrael.cursoapi.dominio.entidades.Categoria;
import com.uisrael.cursoapi.presentacion.dto.request.CategoriaRequestDTO;
import com.uisrael.cursoapi.presentacion.dto.response.CategoriaResponseDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-15T17:03:48-0500",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.43.0.v20250819-1513, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class ICategoriaDtoMapperImpl implements ICategoriaDtoMapper {

    @Override
    public Categoria toDomain(CategoriaRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        int idCategoria = 0;
        String nombre = null;
        String descripcion = null;
        boolean estado = false;

        idCategoria = dto.getIdCategoria();
        nombre = dto.getNombre();
        descripcion = dto.getDescripcion();
        estado = dto.isEstado();

        Categoria categoria = new Categoria( idCategoria, nombre, descripcion, estado );

        return categoria;
    }

    @Override
    public CategoriaResponseDTO toResponseDto(Categoria categoria) {
        if ( categoria == null ) {
            return null;
        }

        CategoriaResponseDTO categoriaResponseDTO = new CategoriaResponseDTO();

        categoriaResponseDTO.setIdCategoria( categoria.getIdCategoria() );
        categoriaResponseDTO.setNombre( categoria.getNombre() );
        categoriaResponseDTO.setDescripcion( categoria.getDescripcion() );
        categoriaResponseDTO.setEstado( categoria.isEstado() );

        return categoriaResponseDTO;
    }
}
