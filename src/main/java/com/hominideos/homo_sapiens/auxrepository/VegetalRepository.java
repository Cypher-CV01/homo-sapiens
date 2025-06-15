package com.hominideos.homo_sapiens.auxrepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hominideos.homo_sapiens.aux.Vegetal;

@Repository
public interface VegetalRepository extends MongoRepository<Vegetal, String> {

}
