package com.hominideos.homo_sapiens.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hominideos.homo_sapiens.model.Neandertal;
import com.hominideos.homo_sapiens.service.HomoService;

@RestController
@RequestMapping("/homos")
public class HomoController {

	@Autowired
	private HomoService services;

	@PostMapping("/new")
	public Neandertal criarNeandertal() {
		Neandertal florence = services.criarNeandertal(1400.0f, 80.0f, 83.0f, 28.5f, "tipo de primata de cabeça grande", "bípedi");
		return florence;
	}
	
}

