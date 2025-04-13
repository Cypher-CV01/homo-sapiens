package com.hominideos.homo_sapiens.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
	
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private FerramentaHabilis habilidade;

}
