package com.itb.inf2em.comercio.model;

public class Produto {

	private Long id;
	private String nome;
	private String descricao;
	private String codigoBarras;
	private double preco;
	
	// public: Acesso liberado para todas as classes. 
	
		// private: Acesso liberado apenas dentro da própria classe, ou seja, apenas
		//          os métodos da referida classe tem acesso.
		
		// Métodos Setter's - Atribuir dados aos atributos
		// Métodos Getter's - Recuperar dados dos atributos
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	

}
