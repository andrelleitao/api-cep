package br.com.codigio.api.cep;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CepResource {
    private String cep;
    private String cidade;
    private String uf;
    private String bairro;
    private String logradouro;

    public CepResource (Cep entity) {
        if (entity != null) {
            setCep(entity.getCep());
            setCidade(entity.getCidade());
            setUf(entity.getUf());
            setBairro(entity.getBairro());
            setLogradouro(entity.getLogradouro());
        }
    }
}
