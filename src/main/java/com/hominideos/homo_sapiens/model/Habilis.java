package com.hominideos.homo_sapiens.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@DiscriminatorValue("Habilis")
@ToString(callSuper = true)
@Getter
@Setter
public class Habilis extends Homo {

	private Integer tamanhoGrupo;
	private FerramentaHabilis habilidade;

}
