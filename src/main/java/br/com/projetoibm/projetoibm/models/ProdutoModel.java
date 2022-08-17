package br.com.projetoibm.projetoibm.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="produto")

public class ProdutoModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nome;
    private String desc_produto;
    private Double preco_produto;
    private boolean generico_produto;

	@JsonIgnore
    @ManyToOne
	@JoinColumn(name = "pedido_id", referencedColumnName = "id")
    private PedidoModel pedido;

    public ProdutoModel(Object o, String nome, double preco_produto, boolean generico_produto, String desc_produto, PedidoModel pedido) {
    	this.nome = nome;
		this.preco_produto = preco_produto;
		this.generico_produto = generico_produto;
		this.desc_produto = desc_produto;
		this.pedido = pedido;
	}

	public ProdutoModel() {

	}

	public PedidoModel getPedido() {
		return pedido;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

	public String getDesc_produto() {
		return desc_produto;
	}

	public void setDesc_produto(String desc_produto) {
		this.desc_produto = desc_produto;
	}

	public Double getPreco_produto() {
		return preco_produto;
	}

	public void setPreco_produto(Double preco_produto) {
		this.preco_produto = preco_produto;
	}

	public boolean isGenerico_produto() {
		return generico_produto;
	}

	public void setGenerico_produto(boolean generico_produto) {
		this.generico_produto = generico_produto;
	}

	public void setPedido(PedidoModel pedido) {
		this.pedido = pedido;
	}

    
}
