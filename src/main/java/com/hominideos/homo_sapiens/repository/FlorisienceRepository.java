package com.hominideos.homo_sapiens.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hominideos.homo_sapiens.model.FerramentaFlorisience;
import com.hominideos.homo_sapiens.model.Florisience;

@Repository
public interface FlorisienceRepository extends JpaRepository<Florisience, Long>{
	
	Florisience findOneByNomeAndSobrenome(String nome, String Sobrenome);
	
	Florisience findOneById(Long id);
	
	List<Florisience> findAllByAltura(FerramentaFlorisience ferramenta);
		
}
