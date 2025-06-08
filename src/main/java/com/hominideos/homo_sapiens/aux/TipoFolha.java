package com.hominideos.homo_sapiens.aux;

public enum TipoFolha {
	SIMPLES("Folha com apenas uma lâmina por pecíolo"),
    COMPOSTA("Folha dividida em várias folíolos por pecíolo"),

    OPOSTA("Folhas dispostas aos pares, uma de cada lado do caule"),
    ALTERNADA("Folhas que se alternam nos nós do caule"),
    VERTICILADA("Mais de duas folhas surgem do mesmo nó, formando um círculo"),

    OVAL("Folha com formato oval, semelhante a um ovo"),
    LANCEOLADA("Folha em forma de lança, mais larga no meio e afilada nas pontas"),
    CORDIFORME("Folha com formato de coração"),
    PALMADA("Folha com lóbulos que se espalham a partir de um ponto central"),
    LINEAR("Folha longa e estreita, como uma fita"),

    BORDA_LISA("Margem da folha sem cortes ou serrilhas"),
    BORDA_SERRILHADA("Margem com pequenas serras ou dentes"),
    BORDA_LOBADA("Margem com reentrâncias largas e arredondadas"),
    BORDA_ONDULADA("Margem com ondulações suaves"),

    COMESTIVEL_CRUA("Pode ser consumida crua, como em saladas"),
    COMESTIVEL_COZIDA("Deve ser cozida antes de ser consumida"),
    AROMATICA("Possui aroma marcante, usada como tempero"),
    MEDICINAL("Utilizada em preparos medicinais ou chás"),
    TOXICA("Potencialmente tóxica ou venenosa para humanos");

	private String descricao;

	TipoFolha(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	
}
