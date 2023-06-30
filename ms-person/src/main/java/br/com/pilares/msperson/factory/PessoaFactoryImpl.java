package br.com.pilares.msperson.factory;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import br.com.pilares.msperson.exception.PessoaException;
import br.com.pilares.msperson.exception.RecursoNaoEncontradoException;
import br.com.pilares.msperson.model.dto.PessoaDTO;
import br.com.pilares.msperson.model.enums.Erro;
import br.com.pilares.msperson.model.enums.TipoPessoa;
import br.com.pilares.msperson.service.PessoaService;

@Service
public class PessoaFactoryImpl implements PessoaFactory {

	private PessoaService pessoaService;
	
	public PessoaFactoryImpl(PessoaService pessoaService) {
		this.pessoaService = pessoaService;
	}
	
	@Override
	public PessoaDTO buscar(TipoPessoa tipoPessoa, String hash) throws PessoaException, RecursoNaoEncontradoException {
		if(tipoPessoa.equals(TipoPessoa.FISICA)) {
			return pessoaService.buscarPessoaFisica(hash);
		} else if(tipoPessoa.equals(TipoPessoa.JURIDICA)) {
			return pessoaService.buscarPessoaJuridica(hash);
		}
		throw  new PessoaException(Erro.TIPO_PESSOA_NAO_ENCONTRADA);
	}
	
	
	
}
