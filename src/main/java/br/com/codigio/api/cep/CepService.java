package br.com.codigio.api.cep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CepService {
	@Autowired
	private CepRepository repository;
	
	public Cep findByCep(String cep) {		
		Cep entity = repository.findByCep(cep);
		
		// Verifica se há o '- até' no logradouro, nesse caso deve desconsiderar o '- até' do logradouro.
		if(entity != null && entity.getLogradouro().contains("- até")) {
			String[] parts = entity.getLogradouro().split("-");
			
			if(parts.length > 0) {
				entity.setLogradouro(parts[0].trim());
			}
		}
		
		return entity;
	}
}
