package com.hominideos.homo_sapiens.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hominideos.homo_sapiens.model.FerramentaHabilis;
import com.hominideos.homo_sapiens.model.Habilis;
import com.hominideos.homo_sapiens.repository.HabilisRepository;

@Service
public class HabilisService {

	@Autowired
	private HabilisRepository repository;
	
	public List<Habilis> buscarHabilis(){
		return repository.findAll();
	}
		
	public Habilis criarHabilis(String nome, String sobrenome, FerramentaHabilis habilidade) {
		var habilis = new Habilis();
		habilis.setNome(nome);
		habilis.setSobrenome(sobrenome);
		habilis.setHabilidade(habilidade);

		return repository.save(habilis);
	} 

	public Habilis atualizarHabilis(Habilis individuo) {
		var habilisDoBanco = repository.findOneById(individuo.getId());
		habilisDoBanco.setBreveDescring(individuo.getBreveDescring());
		habilisDoBanco.setCmBraco(individuo.getCmBraco());
		habilisDoBanco.setCmCubicoCranio(individuo.getCmCubicoCranio());
		habilisDoBanco.setCmPe(individuo.getCmPe());
		habilisDoBanco.setNome(individuo.getNome());
		habilisDoBanco.setPeso(individuo.getPeso());
		habilisDoBanco.setPostura(individuo.getPostura());
		habilisDoBanco.setSobrenome(individuo.getSobrenome());
		habilisDoBanco.setTamanhoGrupo(individuo.getTamanhoGrupo());
		habilisDoBanco.setHabilidade(individuo.getHabilidade());
		return repository.salvar(habilisDoBanco);
	}

	public void deletarHabilis(Long id) {
		var habilisNoBanco = repository.findOneById(id);
		if (habilisNoBanco == null) {
			throw new RuntimeException("Habilis inexistente nos registros.");
		} else {
			repository.deleteById(id);
		}
	}
	
}
