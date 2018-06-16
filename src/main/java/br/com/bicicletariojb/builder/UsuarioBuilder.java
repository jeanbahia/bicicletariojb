package br.com.bicicletariojb.builder;

import java.util.Set;

import br.com.bicicletariojb.model.Endereco;
import br.com.bicicletariojb.model.Usuario;
import br.com.bicicletariojb.model.enums.PerfilEnum;

public class UsuarioBuilder {

	private Usuario usuario;

	public UsuarioBuilder() {
		this.usuario = new Usuario();
	}

	public UsuarioBuilder nome(String nome) {
		this.usuario.setNome(nome);
		return this;
	}

	public UsuarioBuilder cpf(String cpf) {
		this.usuario.setCpf(cpf);
		return this;
	}

	public UsuarioBuilder telefones(Set<String> telefones) {
		this.usuario.setTelefone(telefones);
		return this;
	}

	public UsuarioBuilder perfil(PerfilEnum perfil) {
		this.usuario.setPerfil(perfil);
		return this;
	}
	
	public UsuarioBuilder endereco(Endereco endereco) {
		this.usuario.setEndereco(endereco);
		return this;
	}

	public Usuario build() {
		return this.usuario;
	}
}
