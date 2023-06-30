package br.com.pilares.msperson.exception;

import br.com.pilares.msperson.model.enums.Erro;

public class PessoaException extends Exception {

	private static final long serialVersionUID = 1L;

	public PessoaException(Erro erro) {
		super(erro.toString());
	}
	
}
