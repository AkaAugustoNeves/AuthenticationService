package br.com.pilares.msperson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TesteController {

	@GetMapping
	public String teste() {
		System.out.println("essa instancia aqui");
		return "teste";
	}
	
}
