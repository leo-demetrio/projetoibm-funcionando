package br.com.projetoibm.projetoibm.DTOs;

import javax.validation.constraints.NotBlank;

public class ProdutoDTO {
	@NotBlank
	private String nome;

	@NotBlank
	private int pedido_id;
	
	

	public int getPedido_id() {
		return pedido_id;
	}

	public void setPedido_id(int pedido_id) {
		this.pedido_id = pedido_id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	

}
