package com.fatec.produto.model;

public class Catalogo {
	private Long id;
	private String descricao;
	private String categoria;
	private int quantidadeNoEstoque;
	private byte[] imagem;
	public Catalogo(Long id, String descricao, String categoria, int quantidadeNoEstoque, byte[] imagem) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.categoria = categoria;
		this.quantidadeNoEstoque = quantidadeNoEstoque;
		this.imagem = imagem;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getQuantidadeNoEstoque() {
		return quantidadeNoEstoque;
	}
	public void setQuantidadeNoEstoque(int quantidadeNoEstoque) {
		this.quantidadeNoEstoque = quantidadeNoEstoque;
	}
	public byte[] getImagem() {
		return imagem;
	}
	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}
	
}
