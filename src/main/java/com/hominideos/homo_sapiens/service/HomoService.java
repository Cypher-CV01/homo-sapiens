package com.hominideos.homo_sapiens.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hominideos.homo_sapiens.model.Habilis;
import com.hominideos.homo_sapiens.model.Neandertal;
import com.hominideos.homo_sapiens.repository.NeandertalRepository;

@Service
public class HomoService {
	
	@Autowired
	private NeandertalRepository repository;

	public Neandertal criarNeandertal(Float cmCubicoCranio, Float cmBraco, Float peso, Float cmPe, String breveDescring, String postura) {

		Neandertal florence = new Neandertal();
		florence.setCmCubicoCranio(cmCubicoCranio);
		florence.setCmBraco(cmBraco);
		florence.setPeso(peso);
		florence.setCmPe(cmPe);
		florence.setBreveDescring(breveDescring);
		florence.setPostura(postura);

//		repository.save(florence);

		Neandertal cicero = new Neandertal();
		cicero.setCmCubicoCranio(1700.0f);
		cicero.setCmBraco(80.0f);
		cicero.setCmPe(cmPe);
		cicero.setPeso(peso);
		cicero.setBreveDescring(breveDescring);
		cicero.setPostura(postura);

		repository.save(cicero);

		Neandertal arthur = new Neandertal();
		arthur.setCmBraco(60.0f);
		arthur.setCmCubicoCranio(1500.0f);
		arthur.setPeso(78.0f);
		arthur.setCmPe(38.0f);
		arthur.setBreveDescring("tipo de ser humano, que gosta de dinossauros");
		arthur.setPostura(postura);
		
		System.out.println("o tamanho medio do cranio de um ser humano, fica em media de 1300 cm³ a 1400 cm³");
		System.out.println("o tamanho do cranio do cicero é de " + cicero.getCmCubicoCranio()
				+ " centimetros cubicos, vulgarmente conhecido como cabeção");
		System.out.println("o tamanho do braço do cicero é igual a " + cicero.getCmBraco() + " centimetros");
		System.out.println(arthur.toString());

		return florence;

	}
	public Habilis criarHabilis(Float cmCubicoCranio, Float cmBraco, Float peso, Float cmPe, String breveDescring, String postura) {
		
		Habilis Darel = new Habilis();
		
		Darel.setCmCubicoCranio(1700.0f);
		Darel.setCmBraco(80.0f);
		Darel.setCmPe(cmPe);
		Darel.setPeso(peso);
		Darel.setBreveDescring(breveDescring);
		Darel.setPostura(postura);
		
		return null;
		
	}

}
