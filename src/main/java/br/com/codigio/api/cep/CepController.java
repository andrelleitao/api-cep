package br.com.codigio.api.cep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.codigio.api.util.StringUtils;

@RestController
public class CepController {
	@Autowired
	private CepService service;
	
    private CepResource toResource(Cep entity) {
        return new CepResource(entity);
    }
    
    @CrossOrigin
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