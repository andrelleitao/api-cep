package com.trinitysolucoes.fastdelivery.geocode.cep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface CepRepository extends JpaRepository<Cep, String>, JpaSpecificationExecutor<Cep> {
	@Query(value = "SELECT c FROM Cep c WHERE c.cep = ?1")
	Cep findByCep(String cep);
}
