package br.com.projetoibm.projetoibm.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pedido")
public class PedidoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	@JsonIgnore
    @ManyToOne()
    private ClientModel cliente;

	@OneToMany(mappedBy = "pedido")
	private List<ProdutoModel> produtos = new ArrayList<>();

	public List<ProdutoModel> getProdutos() {
		return produtos;
	}

	public int getId() {
		return id;
	}

	public void setProdutos(List<ProdutoModel> produtos) {
		this.produtos = produtos;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ClientModel getCliente() {
		return cliente;
	}

	public void setCliente(ClientModel cliente) {
		this.cliente = cliente;
	}


}
