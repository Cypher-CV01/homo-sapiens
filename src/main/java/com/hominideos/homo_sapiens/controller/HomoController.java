package com.hominideos.homo_sapiens.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hominideos.homo_sapiens.model.Homo;
import com.hominideos.homo_sapiens.service.HomoService;

@RestController
@RequestMapping("/homo")
public class HomoController {
	
	@Autowired
	private HomoService services;
	
	@GetMapping("/new")
	Homo criarHomo() {
		Homo pessoa = services.criarHomo(86754);
		return pessoa;
		
	}
}
