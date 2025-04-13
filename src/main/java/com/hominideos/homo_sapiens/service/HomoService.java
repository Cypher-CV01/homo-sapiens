package com.hominideos.homo_sapiens.service;

import org.springframework.stereotype.Service;

import com.hominideos.homo_sapiens.model.Denisovano;
import com.hominideos.homo_sapiens.model.Estatura;
import com.hominideos.homo_sapiens.model.Florisience;
import com.hominideos.homo_sapiens.model.Habilis;
import com.hominideos.homo_sapiens.model.Homo;

@Service
public class HomoService {
	
	public void definirEstatura(Homo hominideo, Float altura) {
		
		try {
	        if (altura == null) {
	            throw new IllegalArgumentException("A altura não pode ser nula.");
	        }
	        if (hominideo instanceof Habilis) {
	        	estaturaHabilis(hominideo, altura);
	        }
	        else if (hominideo instanceof Denisovano) {
	        	estaturaDenisovano(hominideo, altura);
	        }
	        else if (hominideo instanceof Florisience) {
	        	estaturaFlorisience(hominideo, altura);
	        }
	        else {
	        	estaturaNeandertal(hominideo, altura);
	        }

	    } catch (Exception e) {
	        System.out.println("Ocorreu um erro ao tentar definir a estatura: " + e.getMessage());
	    }
		
		
	}
	
	private void estaturaDenisovano(Homo hominideo, Float altura) {
        if (altura <= 1.40) {
            hominideo.setEstatura(Estatura.BAIXO);
        } else if (altura >= 1.41 && altura <= 1.70) {
            hominideo.setEstatura(Estatura.MEDIANO);
        } else {
            hominideo.setEstatura(Estatura.ALTO);
        }
	}

	private void estaturaHabilis(Homo hominideo, Float altura) {
		
        if (altura <= 1.40) {
            hominideo.setEstatura(Estatura.BAIXO);
        } else if (altura >= 1.41 && altura <= 1.70) {
            hominideo.setEstatura(Estatura.MEDIANO);
        } else {
            hominideo.setEstatura(Estatura.ALTO);
        }
	}
	
	private void estaturaFlorisience(Homo hominideo, Float altura) {
		
		if (altura <= 0.50) {
            hominideo.setEstatura(Estatura.BAIXO);
        } else if (altura >= 0.51 && altura <= 0.80) {
            hominideo.setEstatura(Estatura.MEDIANO);
        } else {
            hominideo.setEstatura(Estatura.ALTO);
        }
	
	}
	
	private void estaturaNeandertal(Homo hominideo, Float altura) {
		if (altura <= 1.20) {
            hominideo.setEstatura(Estatura.BAIXO);
        } else if (altura >= 1.21 && altura <= 1.70) {
            hominideo.setEstatura(Estatura.MEDIANO);
        } else {
            hominideo.setEstatura(Estatura.ALTO);
        }
		
	}
	
}
