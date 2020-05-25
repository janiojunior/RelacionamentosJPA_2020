package model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Autor extends DefaultEntity<Autor>{

	private static final long serialVersionUID = -72838024393519994L;
	
	@OneToOne
	private PessoaFisica pessoaFisica;

	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}

	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}
	
}
