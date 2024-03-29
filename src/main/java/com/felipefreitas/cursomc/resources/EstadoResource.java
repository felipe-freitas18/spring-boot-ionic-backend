package com.felipefreitas.cursomc.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipefreitas.cursomc.domain.Cidade;
import com.felipefreitas.cursomc.domain.Estado;
import com.felipefreitas.cursomc.dto.CidadeDTO;
import com.felipefreitas.cursomc.dto.EstadoDTO;
import com.felipefreitas.cursomc.services.CidadeService;
import com.felipefreitas.cursomc.services.EstadoService;

@RestController
@RequestMapping(value = "/estados")
public class EstadoResource {

	@Autowired
	private EstadoService estadoService;
	
	@Autowired
	private CidadeService cidadeService;
	
	@GetMapping
	public ResponseEntity<List<EstadoDTO>> findAll() {
		 List<Estado> list = estadoService.findAll();
		 List<EstadoDTO> listDto = list.stream().map(obj -> new EstadoDTO(obj)).collect(Collectors.toList());
		 return  ResponseEntity.ok().body(listDto);
	} 
	
	@GetMapping(value = "/{estadoId}/cidades")
	public ResponseEntity<List<CidadeDTO>> findCidades(@PathVariable(value = "estadoId") Integer estadoId) {
		 List<Cidade> list = cidadeService.findByEstado(estadoId);
		 List<CidadeDTO> listDto = list.stream().map(obj -> new CidadeDTO(obj)).collect(Collectors.toList());
		 return  ResponseEntity.ok().body(listDto);
	} 

}
