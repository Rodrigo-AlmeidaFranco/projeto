package com.usjtECommerce.USJT.model;

import java.io.Serializable;


public class Acesso implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Long id_acesso;
	private Integer codigo;
	public String nome;
	private String descricao;
	
	
	
	
	
	public Acesso() {
		super();
	}
	
	
	public Long getId_acesso() {
		return id_acesso;
	}
	public void setId_acesso(Long id_acesso) {
		this.id_acesso = id_acesso;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	

	
	
}
