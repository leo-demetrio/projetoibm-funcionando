package br.com.projetoibm.projetoibm.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="produto")
public class ProdutoModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProduto;
    
	@Column(nullable = false, unique = true, length = 80)
    private String nomeProduto;
	@Column(nullable = false, unique = false)
    private Double precoProduto;
	@Column(nullable = false, unique = false)
    private boolean Generico;
	
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idPedido")
    private PedidoModel pedido;

    public ProdutoModel() {
    }

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

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

	public PedidoModel getPedido() {
		return pedido;
	}

	public void setPedido(PedidoModel pedido) {
		this.pedido = pedido;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    
}
