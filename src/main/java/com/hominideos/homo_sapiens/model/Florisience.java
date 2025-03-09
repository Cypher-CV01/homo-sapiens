package com.hominideos.homo_sapiens.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@DiscriminatorValue("Florisience")
@ToString(callSuper = true)
@Getter
@Setter
public class Florisience extends Homo {

	private Float altura;
	private FerramentaFlorisience ferramenta;

}
