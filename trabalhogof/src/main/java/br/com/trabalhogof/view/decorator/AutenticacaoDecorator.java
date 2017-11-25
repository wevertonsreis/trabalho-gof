package br.com.trabalhogof.view.decorator;

import br.com.trabalhogof.view.command.Command;

/**
 * Classe responsavel por verificar esta autenticado para
 * realizar o comando
 */
public class AutenticacaoDecorator extends Decorator {

	public AutenticacaoDecorator(Command comandoASerDecorado) {
		super(comandoASerDecorado);
	}
	
	@Override
	public void execute(Object... args) {
		if (autenticado()) {
			super.execute(args);
		}
	}
	
	/**
	 * Retorna verdadeiro se o usuario esta autenticado
	 * 
	 * @return
	 */
	private boolean autenticado() {
		return true;
	}

}