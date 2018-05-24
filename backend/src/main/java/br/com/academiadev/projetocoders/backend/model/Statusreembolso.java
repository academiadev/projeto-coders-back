package br.com.academiadev.projetocoders.backend.model;

public enum Statusreembolso {
	AGUARDANDO("AGUARDANDO", "aguardando"), APROVADO("APROVADO", "aprovado"), RECUSADO("RECUSADO", "recusado");

	private String id;
	private String descricao;

	private Statusreembolso(String id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
