package br.com.bicicletariojb.model.dto;

import br.com.bicicletariojb.model.Endereco;

public class EnderecoDTO {

	private Long id;

	private String uf;

	private String bairro;

	private String rua;

	private String logradouro;

	private String complemento;

	private String numero;

	public EnderecoDTO() {
	}

	public EnderecoDTO(Endereco endereco) {
		this.id = endereco.getId();
		this.uf = endereco.getUf();
		this.bairro = endereco.getBairro();
		this.rua = endereco.getRua();
		this.logradouro = endereco.getLogradouro();
		this.complemento = endereco.getComplemento();
		this.numero = endereco.getNumero();
	}

	public Long getId() {
		return id;
	}

	public String getUf() {
		return uf;
	}

	public String getBairro() {
		return bairro;
	}

	public String getRua() {
		return rua;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}
