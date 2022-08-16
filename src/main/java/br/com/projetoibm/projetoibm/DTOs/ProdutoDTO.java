package br.com.projetoibm.projetoibm.DTOs;

import javax.validation.constraints.NotBlank;

public class ProdutoDTO {
	@NotBlank
	private String nomeProduto;

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	
	

}
