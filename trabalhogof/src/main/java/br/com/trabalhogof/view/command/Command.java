package br.com.trabalhogof.view.command;

public interface Command {

	/**
	 * 
	 * @param args Parametros a ser utilizado no comando
	 */
	public void execute(Object... args);
	
}
