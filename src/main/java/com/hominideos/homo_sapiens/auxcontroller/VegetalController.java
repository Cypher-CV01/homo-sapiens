package com.hominideos.homo_sapiens.auxcontroller;

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

import com.hominideos.homo_sapiens.aux.TipoCaule;
import com.hominideos.homo_sapiens.aux.TipoFolha;
import com.hominideos.homo_sapiens.aux.Vegetal;
import com.hominideos.homo_sapiens.auxservice.VegetalService;

@RestController
@RequestMapping("/vegetal")
public class VegetalController {

	@Autowired
	private VegetalService service;
	
	@GetMapping("/listar-todos")
	public List<Vegetal> listarVegetal() {
		return service.listarVegetal();
	}
	
	@PostMapping("/new")
	public Vegetal criarVegetal(@RequestParam String nome, @RequestParam TipoFolha tipoFolha, @RequestParam TipoCaule tipoCauled, @RequestParam String cor) {
		return service.criarVegetal(nome, tipoFolha, tipoCauled, cor);
	}
	
	
	@PutMapping("/atualizar-vegetal")
	public Vegetal atualizarVegetal(@RequestBody Vegetal vegetal) {
		return service.atualizarVegetal(vegetal);
	}
	
	@DeleteMapping("/delete-vegetal")
	public ResponseEntity<String> deleteVegetal(@RequestBody String id) {
		try {
			service.deleteVegetal(id);
			return new ResponseEntity<String>("Vegetal excluído com sucesso", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		
	}
}
