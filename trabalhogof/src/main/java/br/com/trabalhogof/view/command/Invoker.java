package br.com.trabalhogof.view.command;
import java.util.HashMap;
import java.util.Map;

import br.com.trabalhogof.view.decorator.AutenticacaoDecorator;

public class Invoker {
	
	private static Map<String, Command> comandos = new HashMap<>();

	static{
		comandos.put("ReservarLivro", new ReservarLivroCommand());
		comandos.put("ListarReservas", new ListarReservasCommand());
		comandos.put("CancelarReserva", new CancelarReservaCommand());
	}

	private Invoker() {}
	
	/**
	 * Responsavel por invocar o comando
	 * 
	 * @param command Comando a ser executado
	 * @param args Parametros a ser utilizado no comando
	 */
	public static void invoke(String command, Object args) {
		Command c = comandos.get(command);
		AutenticacaoDecorator autenticacaoDecorator = new AutenticacaoDecorator(c);
		autenticacaoDecorator.execute(args);
	}
	
}