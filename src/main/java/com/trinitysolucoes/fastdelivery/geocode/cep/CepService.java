package com.trinitysolucoes.fastdelivery.geocode.cep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CepService {
	@Autowired
	private CepRepository repository;
	
	public Cep findByCep(String cep) {		
		return repository.findByCep(cep);
	}
}
