package com.uisrael.cursoapi.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.cursoapi.aplicacion.casosuso.entradas.ICursoUseCase;
import com.uisrael.cursoapi.presentacion.dto.request.CursoRequestDTO;
import com.uisrael.cursoapi.presentacion.dto.response.CursoResponseDTO;
import com.uisrael.cursoapi.presentacion.mapeadores.ICursoDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/curso")
public class CursoControlador {

	private final ICursoUseCase cursoUseCase;
	private final ICursoDtoMapper mapper;

	public CursoControlador(ICursoUseCase cursoUseCase, ICursoDtoMapper mapper) {
		this.cursoUseCase = cursoUseCase;
		this.mapper = mapper;
	}

	@GetMapping
	public List<CursoResponseDTO> listar() {
		return cursoUseCase.listar().stream().map(mapper::toResponseDto).toList();
	}

	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public CursoResponseDTO crear(@Valid @RequestBody CursoRequestDTO request) {
		return mapper.toResponseDto(cursoUseCase.crear(mapper.toDomain(request)));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable int id) {
		cursoUseCase.eliminar(id);
		return ResponseEntity.noContent().build();
	}

	@GetMapping("/buscarid/{idCurso}")
	public CursoResponseDTO obtenerPorId(@PathVariable("idCurso") int idCurso) {
		return mapper.toResponseDto(cursoUseCase.obtenerPorId(idCurso));
	}

}
