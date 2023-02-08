package br.com.carlosguilherme.entities;

import br.com.carlosguilherme.annotations.Tabela;

public class TipoTabela {

	@Tabela(value = "getTipo")
	private String tipo;
	
	private String descricao;

		
	public TipoTabela() {
		
	}
	
	
	public TipoTabela(String tipo, String descricao) {
		super();
		this.tipo = tipo;
		this.descricao = descricao;
		
	}


	public String getTipo() {
		return tipo;
	}

	public void setNome(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	

	
}
