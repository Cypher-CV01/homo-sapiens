package com.hominideos.homo_sapiens.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.hominideos.homo_sapiens.aux.Vegetal;
import com.hominideos.homo_sapiens.auxrepository.VegetalRepository;

@Configuration
@EnableMongoRepositories(basePackageClasses = { Vegetal.class, VegetalRepository.class })
public class MongoConfig {

}
