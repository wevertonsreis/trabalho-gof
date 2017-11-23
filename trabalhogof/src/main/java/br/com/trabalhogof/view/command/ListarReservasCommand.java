package br.com.trabalhogof.view.command;

import br.com.trabalhogof.view.facade.ReservaFacade;

public class ListarReservasCommand implements Command {

	public void execute() {
		//TODO IMPLEMENTAR
		ReservaFacade.listarReservas(null);
	}

}
