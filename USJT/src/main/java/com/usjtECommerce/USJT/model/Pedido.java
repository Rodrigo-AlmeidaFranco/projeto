package com.usjtECommerce.USJT.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Pedido implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codUSer;
	private Integer codProduto;
	private Integer codCompra;
	private String dataPedido;
	private Double precoCompra;
	private Double precoVenda;
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
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
