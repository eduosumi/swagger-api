package com.br.swagger.domain.familia;

import java.io.Serializable;

import com.br.swagger.enums.Pais;
import com.br.swagger.enums.TipoMoradia;

public class FamiliaResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;

	private Pais paisOrigem;
	
	private Pais paisAtual;
	
	private TipoMoradia tipoMoradia;
	
	private int qtdIntegrantes;
	
	public FamiliaResponse(String nome, Pais paisOrigem, Pais paisAtual, TipoMoradia tipoMoradia, int qtdIntegrantes) {
		this.nome = nome;
		this.paisOrigem = paisOrigem;
		this.paisAtual = paisAtual;
		this.tipoMoradia = tipoMoradia;
		this.qtdIntegrantes = qtdIntegrantes;
	}
	
	public String getNome() {
		return nome;
	}

	public Pais getPaisOrigem() {
		return paisOrigem;
	}

	public Pais getPaisAtual() {
		return paisAtual;
	}

	public TipoMoradia getTipoMoradia() {
		return tipoMoradia;
	}

	public int getQtdIntegrantes() {
		return qtdIntegrantes;
	}
	
}
