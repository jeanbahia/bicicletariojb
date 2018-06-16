package br.com.bicicletariojb.model.dto;

import java.util.Set;

import javax.persistence.Column;

import br.com.bicicletariojb.model.Usuario;

public class UsuarioDTO {

	private Long id;

	private String nome;

	private Set<String> telefone;

	private Integer perfil;

	@Column(unique = true)
	private String cpf;

	private EnderecoDTO endereco;

	public UsuarioDTO() {
	}

	public UsuarioDTO(Usuario usuario) {

		this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.telefone = usuario.getTelefone();
		this.perfil = usuario.getPerfil().getCodigo();
		this.cpf = usuario.getCpf();

		if (usuario.getEndereco() != null) {
			this.endereco = new EnderecoDTO(usuario.getEndereco());
		}
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Set<String> getTelefone() {
		return telefone;
	}

	public Integer getPerfil() {
		return perfil;
	}

	public String getCpf() {
		return cpf;
	}

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(Set<String> telefone) {
		this.telefone = telefone;
	}

	public void setPerfil(Integer perfil) {
		this.perfil = perfil;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}

}