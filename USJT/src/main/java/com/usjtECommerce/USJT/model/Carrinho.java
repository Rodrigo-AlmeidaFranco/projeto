package com.usjtECommerce.USJT.model;

public class Carrinho {
	
	private Long Id_usuario;
	private Integer id_produto;
	
	
	
	
	
	public Carrinho() {
		super();
	}
	public Long getId_usuario() {
		return Id_usuario;
	}
	public void setId_usuario(Long id_usuario) {
		Id_usuario = id_usuario;
	}
	public Integer getId_produto() {
		return id_produto;
	}
	public void setId_produto(Integer id_produto) {
		this.id_produto = id_produto;
	}
	
	
}
