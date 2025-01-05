package com.hominideos.homo_sapiens.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hominideos.homo_sapiens.model.Neandertal;
import com.hominideos.homo_sapiens.repository.NeandertalRepository;

// Classe anotada como @Service do Spring
// Ela pode ser carregada por outras classes para ser usada sempre que necessário
@Service
public class NeandertalService {

	// A Anotação @Autowired indica que a classe (ou a interface Repository) 
	// deve ser carregada para usar dentro da classe
	@Autowired
	private NeandertalRepository repository;

	// Método que lista todos os Neandertais 
	// que estiverem cadastrados no banco de dados
	public List<Neandertal> listarNeandertais() {
		return repository.findAll();

	}

}
