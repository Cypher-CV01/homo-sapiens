package com.hominideos.homo_sapiens.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hominideos.homo_sapiens.model.Denisovano;
import com.hominideos.homo_sapiens.model.DentesDenisovano;

@Repository
public interface DenisovanoRepository extends JpaRepository<Denisovano, Long>{
	
	Denisovano findOneByNomeAndSobrenome(String nome, String Sobrenome);
	
	Denisovano findOneById(Long id);
	
	List<Denisovano> findAllByDentes(DentesDenisovano dentes);
	
}
