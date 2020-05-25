package model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Editora extends DefaultEntity<Editora> {

	private static final long serialVersionUID = 5378236340719215637L;
	
	@OneToOne
	private PessoaJuridica pessoaJuridica;

	public PessoaJuridica getPessoaJuridica() {
		return pessoaJuridica;
	}

	public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}

}
