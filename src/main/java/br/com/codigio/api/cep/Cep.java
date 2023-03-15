package br.com.codigio.api.cep;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "cep")
@Getter
@Setter
@NoArgsConstructor
public class Cep implements Serializable {
	private static final long serialVersionUID = 1L;

	private String cep;

	@Id
	@Column(name = "CEP", length = 8)
	public String getCep() {
		return cep;
	}

	private String cidade;

	@Column(name = "CIDADE")
	public String getCidade() {
		return cidade;
	}

	private String uf;

	@Column(name = "UF", length = 2)
	public String getUf() {
		return uf;
	}

	private String bairro;

	@Column(name = "BAIRRO")
	public String getBairro() {
		return bairro;
	}

	private String logradouro;

	@Column(name = "LOGRADOURO")
	public String getLogradouro() {
		return logradouro;
	}
}
