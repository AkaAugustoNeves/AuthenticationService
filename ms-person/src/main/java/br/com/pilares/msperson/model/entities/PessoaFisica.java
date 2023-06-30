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
public class PessoaFisica extends Pessoa{
	
	private String cpf;
	private String nomeCompleto;

}