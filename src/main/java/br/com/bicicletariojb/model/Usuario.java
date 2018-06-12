package br.com.bicicletariojb.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.com.bicicletariojb.model.enums.PerfilEnum;

@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nome;

	@Column(unique = true)
	private String CPF;

	@ElementCollection
	@CollectionTable(name = "TELEFONE")
	private Set<String> telefone;

	private Integer perfil;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_endereco")
	private Endereco endereco;

	@OneToMany(mappedBy = "usuario")
	private List<Bicicleta> bicicletas;

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCPF() {
		return CPF;
	}

	public PerfilEnum getPerfil() {
		return PerfilEnum.obterPorCodigo(perfil);
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public void setPerfil(PerfilEnum perfil) {
		this.perfil = perfil.getCodigo();
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Bicicleta> getBicicletas() {
		return bicicletas;
	}

	public void setBicicletas(List<Bicicleta> bicicletas) {
		this.bicicletas = bicicletas;
	}

	public Set<String> getTelefone() {
		return telefone;
	}

	public void setTelefone(Set<String> telefone) {
		this.telefone = telefone;
	}

}
