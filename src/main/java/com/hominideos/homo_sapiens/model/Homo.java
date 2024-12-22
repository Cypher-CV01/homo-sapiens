package com.hominideos.homo_sapiens.model;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "especie", discriminatorType = DiscriminatorType.STRING)
public abstract class Homo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Float cmCubicoCranio;
	private Float cmBraco;
	private Float peso;
	private Float cmPe;
	private String breveDescring;

	public Float getCmCubicoCranio() {
		return cmCubicoCranio;
	}

	public void setCmCubicoCranio(Float cmCubicoCranio) {
		this.cmCubicoCranio = cmCubicoCranio;
	}

	public Float getCmBraco() {
		return cmBraco;
	}

	public void setCmBraco(Float cmBraco) {
		this.cmBraco = cmBraco;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public Float getCmPe() {
		return cmPe;
	}

	public void setCmPe(Float cmPe) {
		this.cmPe = cmPe;
	}

	public String getBreveDescring() {
		return breveDescring;
	}

	public void setBreveDescring(String breveDescring) {
		this.breveDescring = breveDescring;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
