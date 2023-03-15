package com.trinitysolucoes.fastdelivery.geocode.cep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.trinitysolucoes.fastdelivery.geocode.util.StringUtils;

@RestController
public class CepController {
	@Autowired
	private CepService service;
	
    private CepResource toResource(Cep entity) {
        return new CepResource(entity);
    }
    
    @GetMapping("/{cep}")
    public ResponseEntity<CepResource> findByCep(@PathVariable("cep") String cep) {
    	cep = StringUtils.removeNonNumericCharacter(cep);
    	Cep obj = service.findByCep(cep);
    	
    	if(obj == null) {
    		return ResponseEntity.notFound().build();
    	}
    	
    	return ResponseEntity.ok(toResource(obj));
    }
}