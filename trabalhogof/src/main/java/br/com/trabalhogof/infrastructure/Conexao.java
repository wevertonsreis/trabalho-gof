package br.com.trabalhogof.infrastructure;

public class Conexao {
	
	private static Conexao instance;

	private Conexao() {}
	
	public static Conexao getInstance() {
		if (instance == null) {
			instance = new Conexao();
		}
		return instance;
	}
	
	public void abrir() {
		System.out.println("Abrindo conexão");
	}
	
	public void fechar() {
		System.out.println("Fechando conexão");
	}
	
}