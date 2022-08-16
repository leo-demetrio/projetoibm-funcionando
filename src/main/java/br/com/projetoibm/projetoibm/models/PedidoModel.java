package br.com.projetoibm.projetoibm.models;


import java.util.HashSet;
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
	
    @ManyToOne()
    private ClientModel cliente;

	@OneToMany(cascade = CascadeType.ALL, mappedBy="cliente")
	private Set<ProdutoModel> produtos = new HashSet<>();

	public int getId() {
		return id;
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

	public Set<ProdutoModel> getProdutos() {
		return produtos;
	}

	public void setProdutos(Set<ProdutoModel> produtos) {
		this.produtos = produtos;
	}
    
    
}
