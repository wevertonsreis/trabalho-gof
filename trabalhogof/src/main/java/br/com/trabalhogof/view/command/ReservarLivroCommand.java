package br.com.trabalhogof.view.command;

import br.com.trabalhogof.domain.to.UsuarioTO;
import br.com.trabalhogof.view.facade.ReservaFacade;

/**
 * Classe que representa o comando de reservar um livro
 */
public class ReservarLivroCommand implements Command {

	@Override
	public void execute(Object... args) {
		Long idLivro = (Long) args[0];
		UsuarioTO usuarioTO = (UsuarioTO) args[1];
		ReservaFacade.reservarLivro(idLivro, usuarioTO);
	}

}
