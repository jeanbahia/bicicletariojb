package br.com.bicicletariojb.model.dto;

import br.com.bicicletariojb.model.Bicicleta;

public class BicicletaDTO {

	private Long id;

	private String modelo;

	private String cor;

	public BicicletaDTO() {
	}

	public BicicletaDTO(Bicicleta bicicleta) {
		this.id = bicicleta.getId();
		this.modelo = bicicleta.getModelo();
		this.cor = bicicleta.getCor();
	}

	public long getId() {
		return id;
	}

	public String getModelo() {
		return modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}
