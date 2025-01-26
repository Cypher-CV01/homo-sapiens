package com.hominideos.homo_sapiens.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hominideos.homo_sapiens.model.Neandertal;
import com.hominideos.homo_sapiens.service.NeandertalService;


// A classe anotada com @RestController do Spring permite criar 'endpoints' para a API REST
// Cria uma URL nova para a API REST, com operações proprias implementadas na classe
@RestController
@RequestMapping("/neandertais")
public class NeandertalController {

	// Carregada a classe de serviço com o @Autowired
	@Autowired
	private NeandertalService service;

	@GetMapping("/listar-todos")
	public List<Neandertal> listarNeandertais() {
		return service.listarNeandertais();
	}
	
	@PostMapping("/novo-neandertal")
	public Neandertal criarNeandertal(@RequestParam String nome, @RequestParam String sobrenome, @RequestParam Integer tamanhoTribo){
		return service.criarNeandertal(nome, sobrenome, tamanhoTribo);
	}
	
	@GetMapping("/listar-tamanho-tribo/{size}")
	public List<Neandertal> findByTamanhoTribo(@PathVariable("size") Integer tamanho) {
		return service.findByTamanhoTribo(tamanho);
	}
	
	
	
}

