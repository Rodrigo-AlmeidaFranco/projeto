package com.usjtECommerce.USJT.model;

import java.io.Serializable;
import java.util.List;

public class Produtos implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id_produto;
	
    private List<Comentario> comentario;
	
	private Integer codUser;
	private String nome;
	private String marca;
	private String descricao;
	private String img;
	private Double precoCompra;
	private Double precoVenda;
	private Integer codFornecedor;
	private Integer codCategoria;
	
	
	
	
	public Produtos() {
		super();
	}
	public Integer getId_produto() {
		return id_produto;
	}
	public void setId_produto(Integer id_produto) {
		this.id_produto = id_produto;
	}
	public List<Comentario> getComentario() {
		return comentario;
	}
	public void setComentario(List<Comentario> comentario) {
		this.comentario = comentario;
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
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
	
}
