package br.com.trabalhogof;

import java.util.Scanner;

import br.com.trabalhogof.view.command.Invoker;

public class Cliente {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha um dos comandos:");
		System.out.println("1 - Reservar Livro");
		System.out.println("2 - Listar Reservas");
		System.out.println("3 - Cancelar Reserva");
		System.out.print("Opção:");
		
		int commando = scanner.nextInt();
		scanner.close();
		
		switch (commando) {
		case 1:
			Invoker.invoke("ReservarLivro");
			break;
		case 2:
			Invoker.invoke("ListarReservas");
			break;
		case 3:
			Invoker.invoke("CancelarReserva");
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
	}
	
}
