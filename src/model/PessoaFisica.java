package model;

import javax.persistence.Entity;

@Entity
public class PessoaFisica extends Pessoa {

	private static final long serialVersionUID = -2932537216652614442L;
	
	private String cpf;
	private String rg;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

}
