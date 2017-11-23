package br.com.trabalhogof.view.command;

import br.com.trabalhogof.view.facade.ReservaFacade;

public class ReservarLivroCommand implements Command {

	public void execute() {
		//TODO CONTINUAR
		ReservaFacade.reservarLivro(null, null);
	}

}
