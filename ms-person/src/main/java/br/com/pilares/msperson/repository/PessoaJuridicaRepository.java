package br.com.pilares.msperson.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pilares.msperson.model.entities.Pessoa;
import br.com.pilares.msperson.model.entities.PessoaJuridica;

public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Long>{

	Optional<PessoaJuridica> findByHash(String hash);
	
}