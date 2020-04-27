package com.br.swagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.swagger.domain.familia.FamiliaResponse;
import com.br.swagger.service.FamiliaService;

@RestController
@RequestMapping(value = "/familias", produces = MediaType.APPLICATION_JSON_VALUE)
public class FamiliaController implements FamiliaSwagger {

	@Autowired
	public FamiliaService familiaService;
	
	@GetMapping
	public ResponseEntity<List<FamiliaResponse>> listar() {
		
		return ResponseEntity.ok(familiaService.listarResponse());
	}
	
}
