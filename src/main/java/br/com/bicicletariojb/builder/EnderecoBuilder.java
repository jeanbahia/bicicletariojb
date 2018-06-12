package br.com.bicicletariojb.builder;

import br.com.bicicletariojb.model.Endereco;

public class EnderecoBuilder {

	private Endereco endereco;

	public EnderecoBuilder() {
		endereco = new Endereco();
	}

	public EnderecoBuilder uf(String uf) {
		this.endereco.setUf(uf);
		return this;
	}

	public EnderecoBuilder bairro(String bairro) {
		this.endereco.setBairro(bairro);
		return this;
	}

	public EnderecoBuilder rua(String rua) {
		this.endereco.setRua(rua);
		return this;
	}

	public EnderecoBuilder logradouro(String logradouro) {
		this.endereco.setLogradouro(logradouro);
		return this;
	}

	public EnderecoBuilder complemento(String complemento) {
		this.endereco.setComplemento(complemento);
		return this;
	}

	public EnderecoBuilder numero(String numero) {
		this.endereco.setNumero(numero);
		return this;
	}

	public Endereco build() {
		return this.endereco;
	}
}
