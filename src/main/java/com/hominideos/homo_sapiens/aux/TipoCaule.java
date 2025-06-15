package com.hominideos.homo_sapiens.aux;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoCaule {
	AEREO("É caule do tipo aéreo", 1),
	SUBTERRANEO("É caule do tipo subterrâneo", 2),
	AQUATICO("É caule do tipo aquático", 3);

	private String descricao;
	private int ordem;

}
