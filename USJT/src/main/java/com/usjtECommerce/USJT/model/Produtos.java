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
public class Produtos implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codUser;
	private String nome;
	private String marca;
	private String img;
	private Double precoCompra;
	private Double precoVenda;
	private Integer codFornecedor;
	private Integer codCategoria;
	
	
	
	
	
	
	
}
