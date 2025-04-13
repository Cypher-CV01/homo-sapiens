package com.hominideos.homo_sapiens.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hominideos.homo_sapiens.model.Neandertal;
import com.hominideos.homo_sapiens.repository.NeandertalRepository;
import com.hominideos.homo_sapiens.utils.HomoUtils;
//import com.hominideos.homo_sapiens.model.Estatura;

// Classe anotada como @Service do Spring
// Ela pode ser carregada por outras classes para ser usada sempre que necessário
@Service
public class NeandertalService extends HomoService{

	// A Anotação @Autowired indica que a classe (ou a interface Repository)
	// deve ser carregada para usar dentro da classe
	@Autowired
	private NeandertalRepository repository;

	// Método que lista todos os Neandertais
	// que estiverem cadastrados no banco de dados
	public List<Neandertal> listarNeandertais() {
		return repository.findAll();

	}

	public Neandertal criarNeandertal(String nome, String sobrenome, Integer tamanhoTribo, Float altura, String estatura) {
	    var neandertal = new Neandertal();
	    neandertal.setNome(nome);
	    neandertal.setSobrenome(HomoUtils.gerarSobrenome(sobrenome));
	    neandertal.setTamanhoTribo(HomoUtils.gerarTamanhoTriboAleatorio());
	    neandertal.setAltura(altura);
	  	definirEstatura(neandertal, altura);
	  	
	  	return repository.save(neandertal);
	}


	public List<Neandertal> findByTamanhoTribo(Integer tamanho) {
		return repository.findByTamanhoTriboIs(tamanho);
	}

	public Neandertal atualizarNeandertal(Neandertal individuo) {
		var neandertalDoBanco = repository.findOneById(individuo.getId());
		neandertalDoBanco.setBreveDescring(individuo.getBreveDescring());
		neandertalDoBanco.setCmBraco(individuo.getCmBraco());
		neandertalDoBanco.setCmCubicoCranio(individuo.getCmCubicoCranio());
		neandertalDoBanco.setCmPe(individuo.getCmPe());
		neandertalDoBanco.setNome(individuo.getNome());
		neandertalDoBanco.setPeso(individuo.getPeso());
		neandertalDoBanco.setPostura(individuo.getPostura());
		neandertalDoBanco.setSobrenome(individuo.getSobrenome());
		neandertalDoBanco.setTamanhoTribo(individuo.getTamanhoTribo());
		return repository.save(neandertalDoBanco);
	}

	public void excluirNeandertal(Long id) {
		var neandertalNoBanco = repository.findOneById(id);
		if (neandertalNoBanco == null) {
			throw new RuntimeException("Neasndertal não encontrado no banco de dados");
		} else {
			repository.deleteById(id);
		}
	}
	
	public Neandertal salvarNoBanco(Neandertal neander) {
		return repository.save(neander);
	}

}
