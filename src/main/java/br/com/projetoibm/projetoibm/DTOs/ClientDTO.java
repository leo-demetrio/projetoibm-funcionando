package br.com.projetoibm.projetoibm.DTOs;

import javax.validation.constraints.NotBlank;

public class ClientDTO {
	@NotBlank
	private String nomeClient;
	@NotBlank
	private String cpfClient;	
	@NotBlank
	private String emailClient;	
	@NotBlank
	private String telClient;
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
	
	
	
}
