package com.hominideos.homo_sapiens.aux;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "vegetais")
@Data
public class Vegetal {
	
	@Id
	private String id;
	private TipoCaule caule;
	private TipoFolha folha;
	private String nome;
	private String cor;
	
	

}
