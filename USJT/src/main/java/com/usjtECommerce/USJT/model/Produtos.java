package com.usjtECommerce.USJT.model;

public class Produtos {
	private Integer Id;
	private Integer codUser;
	private String produto;
	private Double precoCompra;
	private Double precoVenda;
	private Integer codFornecedor;
	private Integer codCategoria;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Integer getCodUser() {
		return codUser;
	}
	public void setCodUser(Integer codUser) {
		this.codUser = codUser;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
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
	public Integer getCodFornecedor() {
		return codFornecedor;
	}
	public void setCodFornecedor(Integer codFornecedor) {
		this.codFornecedor = codFornecedor;
	}
	public Integer getCodCategoria() {
		return codCategoria;
	}
	public void setCodCategoria(Integer codCategoria) {
		this.codCategoria = codCategoria;
	}
	
	
	
	
}
