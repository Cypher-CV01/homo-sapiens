package com.hominideos.homo_sapiens.utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class HomoUtils {

	public static Integer gerarTamanhoTriboAleatorio() {
		return RandomUtils.nextInt(3, 500);
	}

	public static String gerarSobrenome(String sobrenome) {
		return RandomStringUtils.randomAlphabetic(30);
	}

}
