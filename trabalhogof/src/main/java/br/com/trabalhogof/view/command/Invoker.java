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
	
	public static void invoke(String command) {
		Command c = comandos.get(command);
		AutenticacaoDecorator decorator = new AutenticacaoDecorator(c);
		decorator.execute();
	}
	
}
