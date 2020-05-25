package model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Funcinario extends Usuario {

	private static final long serialVersionUID = -7497415727008820468L;

	private String numeroFuncional;

	@OneToOne
	private PessoaFisica pessoaFisica;

	// enumm
	private TipoFuncionario tipoFuncionario;

	public String getNumeroFuncional() {
		return numeroFuncional;
	}

	public void setNumeroFuncional(String numeroFuncional) {
		this.numeroFuncional = numeroFuncional;
	}

	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}

	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

	public TipoFuncionario getTipoFuncionario() {
		return tipoFuncionario;
	}

	public void setTipoFuncionario(TipoFuncionario tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}

}
