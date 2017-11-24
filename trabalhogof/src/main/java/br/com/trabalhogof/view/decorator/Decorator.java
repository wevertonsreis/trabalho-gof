package br.com.trabalhogof.view.decorator;

import br.com.trabalhogof.view.command.Command;

public abstract class Decorator implements Command {

	private Command command;
	
	public Decorator(Command comandoASerDecorado){
		this.command = comandoASerDecorado;
	}
	
	@Override
	public void execute() {
		command.execute();
	}
	
}
