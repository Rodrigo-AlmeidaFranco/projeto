package com.usjtECommerce.USJT.model;

import java.io.Serializable;

public class Categoria implements Serializable{
	
	private Long id;
	private String nome;
	
	

	
	public Categoria() {
		super();
	}
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
	
	

	
	
}
