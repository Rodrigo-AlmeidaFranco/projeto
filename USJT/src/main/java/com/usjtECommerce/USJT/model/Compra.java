package com.usjtECommerce.USJT.model;

import java.io.Serializable;

public class Compra extends Produtos{
	private static final long serialVersionUID = 1L;
	private long id_compra;
	private Integer codUser;
	private Integer id_pedido;
	private String dataCompra;
	private Double precoCompra;
	private Double precoVenda;
	
	
	
	
	public Compra() {
		super();
	}
	public long getId_compra() {
		return id_compra;
	}
	public void setId_compra(long id_compra) {
		this.id_compra = id_compra;
	}
	public Integer getCodUser() {
		return codUser;
	}
	public void setCodUser(Integer codUser) {
		this.codUser = codUser;
	}
	public String getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}
	public Double getPrecoCompra() {
		return precoCompra;
	}
	public void setPrecoCompra(Double precoCompra) {
		this.precoCompra = precoCompra;
	}
	public Double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Integer getId_pedido() {
		return id_pedido;
	}
	public void setId_pedido(Integer id_pedido) {
		this.id_pedido = id_pedido;
	}

	
	
	
}
