package br.com.pilares.msperson.model.dto;

import br.com.pilares.msperson.model.entities.PessoaJuridica;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PessoaJuridicaDTO extends PessoaDTO{

	private String nomeFantasia;
	private String cnpj;
	
	public PessoaJuridicaDTO(PessoaJuridica pessoaJuridica) {
		this.hash = pessoaJuridica.getHash();
		this.nomeFantasia = pessoaJuridica.getNomeFantasia();
		this.cnpj = pessoaJuridica.getCnpj();
	}

	
}
