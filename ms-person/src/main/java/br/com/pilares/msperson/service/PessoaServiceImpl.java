package br.com.pilares.msperson.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.pilares.msperson.exception.RecursoNaoEncontradoException;
import br.com.pilares.msperson.model.dto.PessoaFisicaDTO;
import br.com.pilares.msperson.model.dto.PessoaJuridicaDTO;
import br.com.pilares.msperson.model.entities.PessoaFisica;
import br.com.pilares.msperson.model.entities.PessoaJuridica;
import br.com.pilares.msperson.repository.PessoaFisicaRepository;
import br.com.pilares.msperson.repository.PessoaJuridicaRepository;

@Service
public class PessoaServiceImpl implements PessoaService {

	private PessoaFisicaRepository pessoaFisicaRepository;
	private PessoaJuridicaRepository pessoaJuridicaRepository;
		
	public PessoaServiceImpl(PessoaFisicaRepository pessoaFisicaRepository, PessoaJuridicaRepository pessoaJuridicaRepository) {
		this.pessoaFisicaRepository = pessoaFisicaRepository;
		this.pessoaJuridicaRepository = pessoaJuridicaRepository;
	}
	
	@Override
	public PessoaFisicaDTO buscarPessoaFisica(String hash) throws RecursoNaoEncontradoException {
		Optional<PessoaFisica> pessoaFisica = pessoaFisicaRepository.findByHash(hash);
		if(pessoaFisica.isPresent()) {
			return new PessoaFisicaDTO(pessoaFisica.get());
		}
		throw new RecursoNaoEncontradoException();
	}
	
	@Override
	public PessoaJuridicaDTO buscarPessoaJuridica(String hash) throws RecursoNaoEncontradoException {
		Optional<PessoaJuridica> pessoaJuridica = pessoaJuridicaRepository.findByHash(hash);
		if(pessoaJuridica.isPresent()) {
			return new PessoaJuridicaDTO(pessoaJuridica.get());
		}
		throw new RecursoNaoEncontradoException();
	}
	
}