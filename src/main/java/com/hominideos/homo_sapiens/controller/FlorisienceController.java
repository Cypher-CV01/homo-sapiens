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
import com.hominideos.homo_sapiens.model.FerramentaFlorisience;
import com.hominideos.homo_sapiens.model.Florisience;
import com.hominideos.homo_sapiens.service.FlorisienceService;

@RestController
@RequestMapping("/florisience")
public class FlorisienceController {

	@Autowired
	private FlorisienceService service;
	
	@GetMapping("/buscar-florisience")
	public List<Florisience> buscarFlorisience(){
		return service.buscarFlorisience();
	}
	
	@PostMapping("/novo-florisience")
	public Florisience criarFlorisience(@RequestParam String nome, @RequestParam String sobrenome, @RequestParam FerramentaFlorisience ferramenta, @RequestParam Float altura) {

		return service.criarFLorisience(nome, sobrenome, ferramenta, altura, null);
	}
	
	@PutMapping("/atualizar-florisience")
	public Florisience atualizarFlorisience(@RequestBody Florisience florisience) {

		return service.atualizarFlorisience(florisience);
	}
	
	@DeleteMapping("/deletar-florisience")
	public ResponseEntity<String> deletarFlorisience(@RequestParam Long id) {
		try {
			service.deletarFlorisience(id);
			return new ResponseEntity<String>("Florisience deletado com sucesso", HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
