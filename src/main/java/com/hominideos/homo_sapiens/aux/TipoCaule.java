package com.hominideos.homo_sapiens.aux;

public enum TipoCaule {
	AEREO("É caule do tipo aéreo", 1),
	SUBTERRANEO("É caule do tipo subterrâneo", 2),
	AQUATICO("É caule do tipo aquático", 3);
	
	private int ordem;	
	private String descricao;

	TipoCaule(String descricao, int ordem) {
		this.descricao = descricao;
		this.ordem = ordem;
	}	
	
	public int getOrdem() {
		return ordem;
	}
	
	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
