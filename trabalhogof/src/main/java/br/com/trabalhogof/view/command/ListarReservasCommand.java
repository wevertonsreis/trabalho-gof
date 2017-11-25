package br.com.trabalhogof.view.command;

import br.com.trabalhogof.domain.to.UsuarioTO;
import br.com.trabalhogof.view.facade.ReservaFacade;

/**
 * Classe que representa o comando de listar as reservas
 */
public class ListarReservasCommand implements Command {

	@Override
	public void execute(Object... args) {
		UsuarioTO usuarioTO = (UsuarioTO) args[0];
		ReservaFacade.listarReservas(usuarioTO);
	}

}