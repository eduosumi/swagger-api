package com.br.swagger.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.br.swagger.domain.familia.FamiliaResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Pacote Familia")
interface FamiliaSwagger {

	@ApiOperation(value = "Descricao do valor", notes = "Lista as familias")
	@ApiResponses({
		@ApiResponse(code = 200, message = "Sucesso", response = FamiliaResponse.class)
		, @ApiResponse(code = 500, message = "Erro interno")
	})
	ResponseEntity<List<FamiliaResponse>> listar();
	
}
