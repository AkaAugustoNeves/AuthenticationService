package br.com.pilares.msperson.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pilares.msperson.model.entities.Pessoa;
import br.com.pilares.msperson.model.entities.PessoaFisica;

public interface PessoaFisicaRepository extends JpaRepository<Pessoa, Long>{
	
	Optional<PessoaFisica> findByHash(String hash);
	
}