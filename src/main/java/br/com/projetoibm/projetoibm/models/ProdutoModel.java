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
    int id;
    
    private String nome;

	@JsonIgnore
    @ManyToOne
	@JoinColumn(name = "pedido_id")
    private PedidoModel pedido;

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


	public void setPedido(PedidoModel pedido) {
		this.pedido = pedido;
	}

    
}
