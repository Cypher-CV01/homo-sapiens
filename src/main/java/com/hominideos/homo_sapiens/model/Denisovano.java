package com.hominideos.homo_sapiens.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@DiscriminatorValue("Denisovano")
@ToString(callSuper = true)
@Getter
@Setter

public class Denisovano extends Homo{
	
	private String genetica;
	private DentesDenisovano dentes;
	
}
