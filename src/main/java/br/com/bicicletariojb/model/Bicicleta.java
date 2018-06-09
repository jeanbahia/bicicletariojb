package br.com.bicicletariojb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Bicicleta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;

	private String modelo;

	private String cor;

	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	public long getId() {
		return Id;
	}

	public String getModelo() {
		return modelo;
	}

	public String getCor() {
		return cor;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setId(long id) {
		Id = id;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
