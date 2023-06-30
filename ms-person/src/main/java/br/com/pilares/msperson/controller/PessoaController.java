package br.com.pilares.msperson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pilares.msperson.exception.PessoaException;
import br.com.pilares.msperson.exception.RecursoNaoEncontradoException;
import br.com.pilares.msperson.factory.PessoaFactory;
import br.com.pilares.msperson.model.dto.PessoaDTO;
import br.com.pilares.msperson.model.enums.TipoPessoa;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	private PessoaFactory pessoaFactory;
	
	public PessoaController( PessoaFactory pessoaFactory) {
		this.pessoaFactory = pessoaFactory;
	}
	
	@GetMapping("/{tipoPessoa}/{hash}")
	public PessoaDTO getByHash(@PathVariable String hash, @PathVariable TipoPessoa tipoPessoa) throws PessoaException, RecursoNaoEncontradoException {
		return this.pessoaFactory.buscar(tipoPessoa, hash);
	}
	
}
