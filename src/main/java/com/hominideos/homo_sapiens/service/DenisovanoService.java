package com.hominideos.homo_sapiens.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hominideos.homo_sapiens.model.Denisovano;
import com.hominideos.homo_sapiens.model.DentesDenisovano;
import com.hominideos.homo_sapiens.repository.DenisovanoRepository;

@Service
public class DenisovanoService extends HomoService{

	@Autowired
	private DenisovanoRepository repository;

	public List<Denisovano> buscarDenisovano() {
		return repository.findAll();
	}

	public Denisovano criarDenisovano(String nome, String sobrenome, DentesDenisovano dentes, Float altura, String estatura) {
		var denisovano = new Denisovano();
		denisovano.setNome(nome);
		denisovano.setSobrenome(sobrenome);
		denisovano.setDentes(dentes);
		denisovano.setAltura(altura);
		definirEstatura(denisovano, altura);
						
		return repository.save(denisovano);
		
		
	}

	public Denisovano atualizarDenisovano(Denisovano individuo) {
		var denisovanoDoBanco = repository.findOneById(individuo.getId());
		denisovanoDoBanco.setBreveDescring(individuo.getBreveDescring());
		denisovanoDoBanco.setCmBraco(individuo.getCmBraco());
		denisovanoDoBanco.setCmCubicoCranio(individuo.getCmCubicoCranio());
		denisovanoDoBanco.setCmPe(individuo.getCmPe());
		denisovanoDoBanco.setDentes(individuo.getDentes());
		denisovanoDoBanco.setGenetica(individuo.getGenetica());
		denisovanoDoBanco.setNome(individuo.getNome());
		denisovanoDoBanco.setSobrenome(individuo.getSobrenome());
		denisovanoDoBanco.setPeso(individuo.getPeso());
		denisovanoDoBanco.setPostura(individuo.getPostura());

		return repository.save(denisovanoDoBanco);
	}

	public void deletarDenisovano(Long id) {
		var denisovanoNoBanco = repository.findOneById(id);
		if (denisovanoNoBanco == null) {
			throw new RuntimeException("Denisovano Não existe no banco");
		} else {
			repository.deleteById(id);
		}

	}
	
	public Denisovano salvarNoBanco(Denisovano denisovano) {
		return repository.save(denisovano);
	}
}
