package com.usjtECommerce.USJT.model;

import java.io.Serializable;

public class Comentario implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id_comentario;
	
	private Integer codUser;
	private Integer produto;
	
	
	private String dataComentario;
	private String nome;
	private String comentario;
	
	
	
	
	
	public Comentario() {
		super();
	}
	public long getId_comentario() {
		return id_comentario;
	}
	public void setId_comentario(long id_comentario) {
		this.id_comentario = id_comentario;
	}
	public Integer getCodUser() {
		return codUser;
	}
	public void setCodUser(Integer codUser) {
		this.codUser = codUser;
	}
	public Integer getProduto() {
		return produto;
	}
	public void setProduto(Integer produto) {
		this.produto = produto;
	}
	public String getDataComentario() {
		return dataComentario;
	}
	public void setDataComentario(String dataComentario) {
		this.dataComentario = dataComentario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
