package br.com.bicicletariojb.builder;

import br.com.bicicletariojb.model.Bicicleta;
import br.com.bicicletariojb.model.Usuario;

public class BicicletaBuilder {

	private Bicicleta bicicleta;

	public BicicletaBuilder() {
		this.bicicleta = new Bicicleta();
	}

	public BicicletaBuilder modelo(String modelo) {
		this.bicicleta.setModelo(modelo);
		return this;
	}

	public BicicletaBuilder cor(String cor) {
		this.bicicleta.setCor(cor);
		return this;
	}
	
	public BicicletaBuilder usuario(Usuario usuario) {
		this.bicicleta.setUsuario(usuario);
		return this;
	}

	public Bicicleta build() {
		return this.bicicleta;
	}
}
