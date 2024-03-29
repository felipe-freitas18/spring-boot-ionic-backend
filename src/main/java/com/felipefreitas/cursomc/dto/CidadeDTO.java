package com.felipefreitas.cursomc.dto;

import java.io.Serializable;

import com.felipefreitas.cursomc.domain.Cidade;

public class CidadeDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;

	public CidadeDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public CidadeDTO(Cidade obj) {
		this.id = obj.getId();
		this.nome = obj.getNome();
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
