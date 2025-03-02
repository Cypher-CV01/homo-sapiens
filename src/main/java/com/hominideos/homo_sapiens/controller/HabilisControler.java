package com.hominideos.homo_sapiens.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hominideos.homo_sapiens.model.FerramentaHabilis;
import com.hominideos.homo_sapiens.model.Habilis;
import com.hominideos.homo_sapiens.service.HabilisService;


@RestController
@RequestMapping("/habilis")
public class HabilisControler {
	
	@Autowired
	private HabilisService service;
	
	@GetMapping("/buscar-habilis")
	public List<Habilis> buscarHabilis() {
		return service.buscarHabilis(); 
	}
	
	@PostMapping("/novo-habilis")
	public Habilis criarHabilis(@RequestParam String nome, @RequestParam String sobrenome, @RequestParam FerramentaHabilis habilidade) {
	
		return service.criarHabilis(nome, sobrenome, habilidade);
	}
	
	@PutMapping("/atualizar-habilis")
	public Habilis atualizarHabilis(@RequestBody Habilis habilis) {
		
		return service.atualizarHabilis(habilis);
	}
	
	@DeleteMapping("/deletar-habilis")
	public ResponseEntity<String> deletarHabilis(@RequestParam Long id){
		try {
			service.deletarHabilis(id);
			return new ResponseEntity<String>("Habilis deletado com sucesso", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		
	}
	

	

}
