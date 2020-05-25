package model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item extends DefaultEntity<Item> {

	private static final long serialVersionUID = -2961793617648362170L;

	private float valor;

	private int quantidade;

	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "idcarrinho", nullable=false)
	private Carrinho carrinho;

//	@ManyToOne
	private Livro livro;

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
}
