package com.hominideos.homo_sapiens.auxservice;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hominideos.homo_sapiens.aux.TipoCaule;
import com.hominideos.homo_sapiens.aux.TipoFolha;
import com.hominideos.homo_sapiens.aux.Vegetal;
import com.hominideos.homo_sapiens.auxrepository.VegetalRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class VegetalService {
	
	private VegetalRepository repository;
	
	public List<Vegetal> listarVegetal() {
		return repository.findAll();
	}

	public Vegetal criarVegetal(String nome, TipoFolha tipoFolha, TipoCaule tipoCaule, String cor) {
		var vegetal = new Vegetal();
		vegetal.setNome(nome);
		vegetal.setFolha(tipoFolha);
		vegetal.setCaule(tipoCaule);
		vegetal.setCor(cor);
		return repository.save(vegetal);
	}
	
	public Vegetal atualizarVegetal(Vegetal vegetal) {
		var optVegetal = repository.findById(vegetal.getId());
		if(optVegetal.isEmpty()){
			throw new RuntimeException("Vegetal não encontrado com este ID");
		}
		Vegetal veg  = optVegetal.get();
		//veg = vegetal
		
		veg.setNome(vegetal.getNome());
		veg.setFolha(vegetal.getFolha());
		veg.setCaule(vegetal.getCaule());
		veg.setCor(vegetal.getCor());
		
		return veg;
	}


	public Optional<Vegetal> findById(String id) {
		return repository.findById(id);
	}

	public void deleteVegetal(String id) {
		var existeNoBanco = repository.findById(id);
		if (existeNoBanco == null) {
			throw new RuntimeException("Vegetal não encontrado no banco de dados");
		}else {
			repository.deleteById(null);
		}	

	}

	

}
