package com.br.swagger.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.br.swagger.domain.familia.FamiliaResponse;
import com.br.swagger.enums.Pais;
import com.br.swagger.enums.TipoMoradia;

@Service
public class FamiliaService {

	public List<FamiliaResponse> listarResponse() {
		
		return cadastroDeFamilias();
		
	}
	
	private List<FamiliaResponse> cadastroDeFamilias() {
		
		FamiliaResponse familiaDosSantosIwama = new FamiliaResponse(
				"Familia dos Santos Iwama"
				, Pais.BRASIL
				, Pais.EUA
				, TipoMoradia.CASA
				, 3);
		
		FamiliaResponse familiaOsumi = new FamiliaResponse(
				"Familia Osumi",
				Pais.BRASIL
				, Pais.BRASIL
				, TipoMoradia.APARTAMENTO
				, 5);
		
		return Arrays.asList(familiaDosSantosIwama, familiaOsumi);
	}
	
}
