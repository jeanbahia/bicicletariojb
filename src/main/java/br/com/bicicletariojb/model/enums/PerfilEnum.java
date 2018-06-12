package br.com.bicicletariojb.model.enums;

public enum PerfilEnum {

	PERFIL_CLIENTE(1, "Cliente"), PERFIL_ADMINISTRADOR(2, "Administrador");

	private Integer codigo;

	private String descricao;

	private PerfilEnum(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static PerfilEnum obterPorCodigo(Integer codigo) {

		for (PerfilEnum perfil : PerfilEnum.values()) {

			if (codigo.equals(perfil.getCodigo())) {
				return perfil;
			}
		}

		throw new IllegalArgumentException("Perfil inválido");
	}
}
