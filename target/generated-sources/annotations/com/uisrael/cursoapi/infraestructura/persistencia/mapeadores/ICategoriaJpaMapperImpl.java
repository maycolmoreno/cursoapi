package com.uisrael.cursoapi.infraestructura.persistencia.mapeadores;

import com.uisrael.cursoapi.dominio.entidades.Categoria;
import com.uisrael.cursoapi.infraestructura.persinstencia.jpa.CategoriaJpa;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-15T17:32:20-0500",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.43.0.v20250819-1513, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class ICategoriaJpaMapperImpl implements ICategoriaJpaMapper {

    @Override
    public Categoria toDomain(CategoriaJpa entity) {
        if ( entity == null ) {
            return null;
        }

        int idCategoria = 0;
        String nombre = null;
        String descripcion = null;
        boolean estado = false;

        idCategoria = entity.getIdCategoria();
        nombre = entity.getNombre();
        descripcion = entity.getDescripcion();
        estado = entity.isEstado();

        Categoria categoria = new Categoria( idCategoria, nombre, descripcion, estado );

        return categoria;
    }

    @Override
    public CategoriaJpa toEntity(Categoria curso) {
        if ( curso == null ) {
            return null;
        }

        CategoriaJpa categoriaJpa = new CategoriaJpa();

        categoriaJpa.setDescripcion( curso.getDescripcion() );
        categoriaJpa.setEstado( curso.isEstado() );
        categoriaJpa.setIdCategoria( curso.getIdCategoria() );
        categoriaJpa.setNombre( curso.getNombre() );

        return categoriaJpa;
    }
}
