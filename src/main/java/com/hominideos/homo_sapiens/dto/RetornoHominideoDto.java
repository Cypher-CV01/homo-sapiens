package com.hominideos.homo_sapiens.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RetornoHominideoDto {
	
	private Long id;
	private LocalDateTime dataHora; 
	private Boolean resultado;
	private String descricao;
	private TipoHomo tipoHomo;

}
