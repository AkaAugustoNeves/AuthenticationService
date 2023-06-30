package br.com.pilares.msperson.factory;

import br.com.pilares.msperson.exception.PessoaException;
import br.com.pilares.msperson.exception.RecursoNaoEncontradoException;
import br.com.pilares.msperson.model.dto.PessoaDTO;
import br.com.pilares.msperson.model.enums.TipoPessoa;

public interface PessoaFactory {	
	
	public PessoaDTO buscar(TipoPessoa tipoPessoa, String hash) throws PessoaException, RecursoNaoEncontradoException;

}
