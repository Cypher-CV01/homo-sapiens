package com.hominideos.homo_sapiens.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hominideos.homo_sapiens.model.Neandertal;

@Repository
public interface NeandertalRepository extends JpaRepository<Neandertal, Long> {

}
