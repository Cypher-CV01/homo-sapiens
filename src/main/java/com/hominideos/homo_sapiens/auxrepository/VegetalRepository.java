package com.hominideos.homo_sapiens.auxrepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hominideos.homo_sapiens.aux.Vegetal;

public interface VegetalRepository extends MongoRepository<Vegetal, String> {

}
