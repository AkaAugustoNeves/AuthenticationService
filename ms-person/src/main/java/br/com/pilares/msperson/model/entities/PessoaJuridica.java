package br.com.pilares.msperson.model.entities;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PessoaJuridica extends Pessoa{
	
	private String cnpj;
	private String nomeFantasia;

}
