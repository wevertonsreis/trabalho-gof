package br.com.trabalhogof.view.decorator;

import br.com.trabalhogof.view.command.Command;

public class AutenticacaoDecorator extends Decorator {

	public AutenticacaoDecorator(Command comandoASerDecorado) {
		super(comandoASerDecorado);
	}
	
	@Override
	public void execute() {
		if (autenticado()) {
			super.execute();			
		}
	}

	private boolean autenticado() {
		return false;
	}

}
