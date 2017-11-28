package br.com.trabalhogof.domain.entity;

import br.com.trabalhogof.domain.to.LivroTO;

/**
 * Classe que representa um livro virtual
 */
public class LivroVirtual extends Livro {
	
	/**
	 * 
	 * @param livroTO
	 */
	public LivroVirtual(LivroTO livroTO) {
		super(livroTO);
		super.setTipo(TipoLivro.VIRTUAL);
	}

	/**
	 * Livro virtual sempre esta disponivel
	 */
	@Override
	public boolean disponivel() {
		return true;
	}

}