package br.com.trabalhogof.view.command;
import java.util.HashMap;
import java.util.Map;

public class Invoker {
	
	private static Map<String, Command> comandos = new HashMap<String, Command>();

	static{
		comandos.put("ReservarLivro", new ReservarLivroCommand());
		comandos.put("ListarReservas", new ListarReservasCommand());
		comandos.put("CancelarReserva", new CancelarReservaCommand());
	}

	public static void invoke(String command){
		Command c = comandos.get(command);
		c.execute();
	}
	
}
