package br.com.pilares.msperson.model.dto;

import br.com.pilares.msperson.model.entities.PessoaFisica;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PessoaFisicaDTO extends PessoaDTO{
	
	private String nomeCompleto;
	private String cpf;
	
	public PessoaFisicaDTO(PessoaFisica pessoaFisica) {
		this.hash = pessoaFisica.getHash();
		this.nomeCompleto = pessoaFisica.getNomeCompleto();
		this.cpf = pessoaFisica.getCpf();
	}

}
