package br.com.projetoibm.projetoibm.models;

import javax.persistence.Column;
import javax.persistence.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class ClientModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idClient;
	
	@Column(nullable = false, unique = false, length = 80)
	private String nomeClient;
	
	@Column(nullable = false, unique = true, length = 80)
	private String cpfClient;
	
	@Column(nullable = false, unique = true, length = 80)
	private String emailClient;
	
	@Column(nullable = false, unique = true, length = 80)
	private String telClient;
	
	@OneToMany(mappedBy = "cliente")
    private List<PedidoModel> pedidos = new ArrayList<PedidoModel>();

    public ClientModel() {
    }

    public List<PedidoModel> getPedidos() {
        return pedidos;
    }

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getNomeClient() {
		return nomeClient;
	}

	public void setNomeClient(String nomeClient) {
		this.nomeClient = nomeClient;
	}

	public String getCpfClient() {
		return cpfClient;
	}

	public void setCpfClient(String cpfClient) {
		this.cpfClient = cpfClient;
	}

	public String getEmailClient() {
		return emailClient;
	}

	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}

	public String getTelClient() {
		return telClient;
	}

	public void setTelClient(String telClient) {
		this.telClient = telClient;
	}

	public void setPedidos(List<PedidoModel> pedidos) {
		this.pedidos = pedidos;
	}

    
}
