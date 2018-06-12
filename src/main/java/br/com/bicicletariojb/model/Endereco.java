package br.com.bicicletariojb.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Endereco implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String uf;

	private String bairro;

	private String rua;

	private String logradouro;

	private String complemento;

	private String numero;

	@OneToMany(mappedBy = "endereco")
	private List<Usuario> usuarios;

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

	public String getNumero() {
		return numero;
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

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}
