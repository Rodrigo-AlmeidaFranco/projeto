package com.usjtECommerce.USJT.model;

import java.io.Serializable;

public class Cliente implements Serializable{
	
	private long id;
	private Integer Id_codUser;
	private String nome;
	private String cpf;
	private String telefone;
	private String ramal;
	private String email;
	private String endereco;
	private String bairro;
	private String cidade;
	private String uf;
	private String dataNasc;
	
	
	
	
	
	public Cliente() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Integer getId_codUser() {
		return Id_codUser;
	}
	public void setId_codUser(Integer id_codUser) {
		Id_codUser = id_codUser;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	
	

	
}
