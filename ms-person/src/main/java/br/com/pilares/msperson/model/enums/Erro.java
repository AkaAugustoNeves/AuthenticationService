package br.com.pilares.msperson.model.enums;

import lombok.Getter;

@Getter
public enum Erro {
	
	PESSOA_FISICA_NAO_ENCONTRADA(0L, "Erro! Pessoa Física não encontrada."),
	PESSOA_JURIDICA_NAO_ENCONTRADA(1L, "Erro! Pessoa Juridica não encontrada."),
	TIPO_PESSOA_NAO_ENCONTRADA(2L, "Erro! Inconsistencia no tipo de pessoa."), 
	RECURSO_NAO_ENCONTRADO(3L, "Erro! Recurso não encontrado.");
	
	private Erro(Long id, String mensagem) {
		this.id = id;
		this.mensagem = mensagem;
	}
	
	private Long id;
	private String mensagem;
	
	public static Erro getErroByString(String erro) {
		switch (erro) {
			case "PESSOA_FISICA_NAO_ENCONTRADA":
				return Erro.PESSOA_FISICA_NAO_ENCONTRADA;
			case "PESSOA_JURIDICA_NAO_ENCONTRADA":
				return Erro.PESSOA_JURIDICA_NAO_ENCONTRADA;
			case "TIPO_PESSOA_NAO_ENCONTRADA":
				return Erro.TIPO_PESSOA_NAO_ENCONTRADA;
			case "RECURSO_NAO_ENCONTRADO":
				return Erro.RECURSO_NAO_ENCONTRADO;
		default:
			throw new IllegalArgumentException("String inválida: " + erro);
		}
	}

}
