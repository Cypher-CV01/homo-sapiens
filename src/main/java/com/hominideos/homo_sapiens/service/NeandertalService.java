package com.hominideos.homo_sapiens.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hominideos.homo_sapiens.model.Neandertal;
import com.hominideos.homo_sapiens.repository.NeandertalRepository;
import com.hominideos.homo_sapiens.utils.HomoUtils;

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

	public Neandertal criarNeandertal(String nome, String sobrenome, Integer tamanhoTribo) {
		var individuo = new Neandertal();
		individuo.setNome(nome);
		individuo.setSobrenome(HomoUtils.gerarSobrenome(sobrenome));
		individuo.setTamanhoTribo(HomoUtils.gerarTamanhoTriboAleatorio());
		return repository.save(individuo);
	}

	public List<Neandertal> findByTamanhoTribo(Integer tamanho) {
		return repository.findByTamanhoTriboIs(tamanho);
	}

	public Neandertal atualizarNeandertal(Neandertal individuo) {
		var veioDoBanco = repository.findOneById(individuo.getId());
		veioDoBanco.setBreveDescring(individuo.getBreveDescring());
		veioDoBanco.setCmBraco(individuo.getCmBraco());
		veioDoBanco.setCmCubicoCranio(individuo.getCmCubicoCranio());
		veioDoBanco.setCmPe(individuo.getCmPe());
		veioDoBanco.setNome(individuo.getNome());
		veioDoBanco.setPeso(individuo.getPeso());
		veioDoBanco.setPostura(individuo.getPostura());
		veioDoBanco.setSobrenome(individuo.getSobrenome());
		veioDoBanco.setTamanhoTribo(individuo.getTamanhoTribo());
		return repository.save(veioDoBanco);
	}

	public void excluirNeandertal(Long id) {
		var exeisteNoBanco = repository.findOneById(id);
		if (exeisteNoBanco == null) {
			throw new RuntimeException("Neasndertal não encontrado no banco de dados");
		} else {
			repository.deleteById(id);
		}
	}

}
