package com.usjtECommerce.USJT.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Pedido {
	private Integer id;
	private Integer codUSer;
	private Integer codProduto;
	private Integer codCompra;
	private String dataPedido;
	private Double precoCompra;
	private Double precoVenda;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCodUSer() {
		return codUSer;
	}
	public void setCodUSer(Integer codUSer) {
		this.codUSer = codUSer;
	}
	public Integer getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(Integer codProduto) {
		this.codProduto = codProduto;
	}
	public Integer getCodCompra() {
		return codCompra;
	}
	public void setCodCompra(Integer codCompra) {
		this.codCompra = codCompra;
	}
	public String getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
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
	
	
}
