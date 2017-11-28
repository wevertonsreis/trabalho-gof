package br.com.trabalhogof.domain.entity;

import br.com.trabalhogof.domain.to.LivroTO;

/**
 * CLasse que representa um livro fisico
 */
public class LivroFisico extends Livro {

	/**
	 * 
	 * @param livroTO
	 */
	public LivroFisico(LivroTO livroTO) {
		super(livroTO);
		super.setTipo(TipoLivro.FISICO);
	}
	
}
