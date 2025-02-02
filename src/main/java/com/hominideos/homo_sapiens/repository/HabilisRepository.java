package com.hominideos.homo_sapiens.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hominideos.homo_sapiens.model.Habilis;
import com.hominideos.homo_sapiens.model.FerramentaHabilis;
import java.util.List;


@Repository 
public interface HabilisRepository extends JpaRepository<Habilis, Long>{
	
	Habilis findOneByNomeAndSobrenome(String nome, String sobrenome);
	
	Habilis findOneById(Long id);
	
	List<Habilis> findAllByHabilidade(FerramentaHabilis habilidade);
	
}	



