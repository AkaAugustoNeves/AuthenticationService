package br.com.pilares.msperson.model.dto;

import br.com.pilares.msperson.model.enums.Erro;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErroDTO {
	
	private Long id;
	private String mensagem;

	public ErroDTO(Erro erro) {
		this.id = erro.getId();
		this.mensagem = erro.getMensagem();
	}
	
}
