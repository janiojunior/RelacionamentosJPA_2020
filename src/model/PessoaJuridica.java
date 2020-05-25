package model;

import javax.persistence.Entity;

@Entity
public class PessoaJuridica extends Pessoa {

	private static final long serialVersionUID = -1593685098285546692L;

	private String cnpj;

	private String razaoSocial;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	
}
