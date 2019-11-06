package com.usjtECommerce.USJT.model;

import java.io.Serializable;

public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id_usuario;
	private Integer direito;
	private Integer acesso;
	private String login;
	private String senha;
	private String nome;
	
	
	
	public Usuario() {
		super();
	}
	public int getId_usuario() {
		return id_usuario;
	}
	
	
	public Integer getDireito() {
		return direito;
	}
	public void setDireito(Integer direito) {
		this.direito = direito;
	}
	public Integer getAcesso() {
		return acesso;
	}
	public void setAcesso(Integer acesso) {
		this.acesso = acesso;
	}
	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	


	
	
	
}
