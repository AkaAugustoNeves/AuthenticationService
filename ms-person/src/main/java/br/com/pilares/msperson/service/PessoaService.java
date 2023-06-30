package br.com.pilares.msperson.service;

import br.com.pilares.msperson.exception.RecursoNaoEncontradoException;
import br.com.pilares.msperson.model.dto.PessoaFisicaDTO;
import br.com.pilares.msperson.model.dto.PessoaJuridicaDTO;

public interface PessoaService {

	public PessoaFisicaDTO buscarPessoaFisica(String hash) throws RecursoNaoEncontradoException;
	public PessoaJuridicaDTO buscarPessoaJuridica(String hash) throws RecursoNaoEncontradoException;
	
}