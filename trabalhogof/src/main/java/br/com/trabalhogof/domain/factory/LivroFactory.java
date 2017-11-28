package br.com.trabalhogof.domain.factory;

import br.com.trabalhogof.domain.entity.Livro;
import br.com.trabalhogof.domain.entity.LivroFisico;
import br.com.trabalhogof.domain.entity.LivroVirtual;
import br.com.trabalhogof.domain.entity.TipoLivro;
import br.com.trabalhogof.domain.to.LivroTO;

/**
 * Responsavel por fabricar livros
 */
public class LivroFactory {
	
	private LivroFactory() {}

	/**
	 * Metodo responsavel por criar o livro
	 * 
	 * @param livroTO
	 * @return
	 */
	public static Livro createLivro(LivroTO livroTO) {
		if (TipoLivro.FISICO.name().equals(livroTO.getTipo()))
			return new LivroFisico(livroTO);	
		
		if (TipoLivro.VIRTUAL.name().equals(livroTO.getTipo()))
			return new LivroVirtual(livroTO);	
		
		return null;
	}
	
}
