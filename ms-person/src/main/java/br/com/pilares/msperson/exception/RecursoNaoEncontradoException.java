package br.com.pilares.msperson.exception;

import br.com.pilares.msperson.model.enums.Erro;

public class RecursoNaoEncontradoException extends Exception {

	private static final long serialVersionUID = 1L;

	public RecursoNaoEncontradoException() {
		super(Erro.RECURSO_NAO_ENCONTRADO.toString());
	}
	

}
