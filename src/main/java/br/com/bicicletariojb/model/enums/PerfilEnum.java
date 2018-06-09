package br.com.bicicletariojb.model.enums;

public enum PerfilEnum {

	PERFIL_CLIENTE("1", "Cliente"), 
	PERFIL_ADMINISTRADOR("2", "Administrador");

	private String codigo;

	private String descricao;

	private PerfilEnum(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public PerfilEnum obterPorCodigo(String codigo) {

		for (PerfilEnum perfil : PerfilEnum.values()) {

			if (codigo.equals(perfil.getCodigo())) {
				return perfil;
			}
		}
		
		throw new IllegalArgumentException("Perfil inválido");
	}
}
