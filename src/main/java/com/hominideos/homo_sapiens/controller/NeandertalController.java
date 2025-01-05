package com.hominideos.homo_sapiens.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
