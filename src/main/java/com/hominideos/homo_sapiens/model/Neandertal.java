package com.hominideos.homo_sapiens.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("neandertal")

public class Neandertal extends Homo {
	
	private Integer tamanhoTribo;
	
	
	public Integer getTamanhoTribo() {
		return tamanhoTribo;
	}

	public void setTamanhoTribo(Integer tamanhoTribo) {
		this.tamanhoTribo = tamanhoTribo;
	}

	@Override
	public String toString() {
		return "Neandertal [tamanhoTribo=" + tamanhoTribo + ", getCmCubicoCranio()=" + getCmCubicoCranio()
				+ ", getCmBraco()=" + getCmBraco() + ", getPeso()=" + getPeso() + ", getCmPe()=" + getCmPe()
				+ ", getBreveDescring()=" + getBreveDescring() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}  
	
	
	
}
