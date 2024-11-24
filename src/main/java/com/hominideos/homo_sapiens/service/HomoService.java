package com.hominideos.homo_sapiens.service;

import org.springframework.stereotype.Service;

import com.hominideos.homo_sapiens.model.Homo;

@Service	
public class HomoService {
	
	public Homo criarHomo(long tamanhoCranio, long tamanhoBraco, long peso) {
		
		Homo florence = new Homo();
		florence.setCmCubicoCranio(tamanhoCranio);
		florence.setCmBraco(tamanhoBraco);
		florence.setPeso(peso);
		
		Homo cicero = new Homo();
		cicero.setCmCubicoCranio(1700);
		cicero.setCmBraco(80);
		
		System.out.println("o tamanho medio do cranio de um ser humano, fica em media de 1300 cm³ a 1400 cm³");
		System.out.println("o tamanho do cranio do cicero é de " + cicero.getCmCubicoCranio() + " centimetros cubicos, vulgarmente conhecido como cabeção");
		System.out.println("o tamanho do braço do cicero é igual a " + cicero.getCmBraco() + " centimetros");

		return florence;
		
	}
	
}

