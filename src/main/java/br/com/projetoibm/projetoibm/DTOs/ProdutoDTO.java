package br.com.projetoibm.projetoibm.DTOs;

import javax.validation.constraints.NotBlank;

public class ProdutoDTO {
	@NotBlank
	private String nomeProduto;
	@NotBlank
	private Double precoProduto;
	@NotBlank
	private boolean Generico;
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public Double getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}
	public boolean isGenerico() {
		return Generico;
	}
	public void setGenerico(boolean generico) {
		Generico = generico;
	}
	
	

}
