package com.hominideos.homo_sapiens.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hominideos.homo_sapiens.model.FerramentaFlorisience;
import com.hominideos.homo_sapiens.model.Florisience;
import com.hominideos.homo_sapiens.repository.FlorisienceRepository;

@Service
public class FlorisienceService {
	
	@Autowired
	private FlorisienceRepository repository;
	
	public List<Florisience> buscarFlorisience() {
		return repository.findAll();	
	}
	
	public Florisience criarFLorisience (String nome, String sobrenome, FerramentaFlorisience ferramenta, Float altura, String estatura) {
		var florisience = new Florisience();
		florisience.setNome(nome);
		florisience.setSobrenome(sobrenome);
		florisience.setFerramenta(ferramenta);
		florisience.setAltura(altura);
		
		try {
	        if (altura == null) {
	            throw new IllegalArgumentException("A altura não pode ser nula.");
	        }
	        if (altura <= 0.50) {
	            florisience.setEstatura("baixo");
	        } else if (altura >= 0.51 && altura <= 0.80) {
	            florisience.setEstatura("mediando");
	        } else {
	            florisience.setEstatura("alto");
	        }
	    } catch (Exception e) {
	        System.out.println("Ocorreu um erro ao tentar definir a estatura: " + e.getMessage());
	    }
		
		return repository.save(florisience);
	}
	
	public Florisience atualizarFlorisience(Florisience individuo) {
		var florisienceDoBanco = repository.findOneById(individuo.getId());
		florisienceDoBanco.setBreveDescring(individuo.getBreveDescring());
		florisienceDoBanco.setCmBraco(individuo.getCmBraco());
		florisienceDoBanco.setCmCubicoCranio(individuo.getCmCubicoCranio());
		florisienceDoBanco.setCmPe(individuo.getCmPe());
		florisienceDoBanco.setAltura(individuo.getAltura());
		florisienceDoBanco.setFerramenta(individuo.getFerramenta());
		florisienceDoBanco.setNome(individuo.getNome());
		florisienceDoBanco.setSobrenome(individuo.getSobrenome());
		florisienceDoBanco.setPeso(individuo.getPeso());
		florisienceDoBanco.setPostura(individuo.getPostura());

		return repository.save(florisienceDoBanco);
	
	}
	
	public void deletarFlorisience(Long id) {
		var florisienceNoBanco = repository.findOneById(id);
		if (florisienceNoBanco == null) {
			throw new RuntimeException("Florisience Não existe no banco");
		} else {
			repository.deleteById(id);
		}

	}

}




