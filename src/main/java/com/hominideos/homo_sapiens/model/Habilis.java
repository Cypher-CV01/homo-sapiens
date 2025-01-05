package com.hominideos.homo_sapiens.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Habilis")
public class Habilis extends Homo {
	
	private Integer tamanhoGrupo;
	private FerramentaHabilis habilidade;

	public Integer getTamanhoGrupo() {
		return tamanhoGrupo;
	}

	public void setTamanhoGrupo(Integer tamanhoGrupo) {
		this.tamanhoGrupo = tamanhoGrupo;
	}
	
	public FerramentaHabilis getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(FerramentaHabilis habilidade) {
		this.habilidade = habilidade;
	}

	@Override
	public String toString() {
		return "Habilis [tamanhoGrupo=" + tamanhoGrupo + ", habilidade=" + habilidade + ", getCmCubicoCranio()="
				+ getCmCubicoCranio() + ", getCmBraco()=" + getCmBraco() + ", getPeso()=" + getPeso() + ", getCmPe()="
				+ getCmPe() + ", getBreveDescring()=" + getBreveDescring() + ", getId()=" + getId() + ", getPostura()="
				+ getPostura() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}	

}
