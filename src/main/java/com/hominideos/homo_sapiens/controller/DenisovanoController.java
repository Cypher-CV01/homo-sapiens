package com.hominideos.homo_sapiens.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hominideos.homo_sapiens.model.Denisovano;
import com.hominideos.homo_sapiens.model.DentesDenisovano;
import com.hominideos.homo_sapiens.service.DenisovanoService;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/denisovanos")
public class DenisovanoController {

	@Autowired
	private DenisovanoService service;

	@GetMapping("/buscar-denisovano")
	public List<Denisovano> buscarDenisovano() {
		return service.buscarDenisovano();
	}

	@PostMapping("/novo-denisovano")
	public Denisovano criarDenisovano(@RequestParam String nome, @RequestParam String sobrenome,
			@RequestParam String genetica, @RequestParam DentesDenisovano dentes) {

		return service.criarDenisovano(nome, sobrenome, dentes);
	}

	@PutMapping("/atualizar-denisovano")
	public Denisovano atualizarDenisovano(@RequestBody Denisovano denisovano) {

		return service.atualizarDenisovano(denisovano);
	}

	@DeleteMapping("/deletar-denisovano")
	public ResponseEntity<String> deletarDenisovano(@RequestParam Long id) {
		try {
			service.deletarDenisovano(id);
			return new ResponseEntity<String>("Denisovano deletado com sucesso", HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

}
