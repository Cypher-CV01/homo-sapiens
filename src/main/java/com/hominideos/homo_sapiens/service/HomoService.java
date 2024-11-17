package com.hominideos.homo_sapiens.service;

import org.springframework.stereotype.Service;

import com.hominideos.homo_sapiens.model.Homo;

@Service	
public class HomoService {
	
	public Homo criarHomo(long tamanhoCranio) {
		Homo pessoa = new Homo();
		pessoa.setTamanhoCranio(tamanhoCranio);
		
		Homo cearense = new Homo();
		cearense.setTamanhoCranio(1700);
		
		System.out.println("o tamanho medio do cranio de um ser humano, fica em media de 1300 cm³ a 1400 cm³");
		System.out.println("o tamanho do cranio de um cearense é em media de " + cearense.getTamanhoCranio());
		
		return pessoa;
		
	}
}

