package com.usjtECommerce.USJT.model;

import java.io.Serializable;

public class Fornecedor implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id_fornecedor;

	private Integer codUser;
	private String nome;
	private String cnpj;
	private String telefone;
	private String ramal;
	private String email;
	private String observacoes;
	
	
	
	
	public Fornecedor() {
		super();
	}
	public Integer getId_fornecedor() {
		return id_fornecedor;
	}
	public void setId_fornecedor(Integer id_fornecedor) {
		this.id_fornecedor = id_fornecedor;
	}
	public Integer getCodUser() {
		return codUser;
	}
	public void setCodUser(Integer codUser) {
		this.codUser = codUser;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getRamal() {
		return ramal;
	}
	public void setRamal(String ramal) {
		this.ramal = ramal;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
}
