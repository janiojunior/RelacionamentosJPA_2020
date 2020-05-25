package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Cliente extends Usuario {

	private static final long serialVersionUID = 5572237389426652489L;

	@OneToOne
	private Pessoa pessoa;

	@ManyToMany
	private List<Livro> listaDesejo;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Livro> getListaDesejo() {
		return listaDesejo;
	}

	public void setListaDesejo(List<Livro> listaDesejo) {
		this.listaDesejo = listaDesejo;
	}

}
