package com.hominideos.homo_sapiens.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hominideos.homo_sapiens.model.Neandertal;
import java.util.List;


@Repository
public interface NeandertalRepository extends JpaRepository<Neandertal, Long> {

	List<Neandertal> findByTamanhoTriboIs(Integer tamanho);
	
	Neandertal findOneByNomeAndSobrenome(String nome, String sobrenome);
	
	Neandertal findOneById(Long id);
	
	
}





