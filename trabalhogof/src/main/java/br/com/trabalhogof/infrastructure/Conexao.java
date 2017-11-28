package br.com.trabalhogof.infrastructure;

/**
 * Singleton
 */
public class Conexao {
	
	private static Conexao instance;
	
	/**
	 * Construtor privado
	 */
	private Conexao() {}
	
	/**
	 * Retorna a instancia da conexao
	 * 
	 * @return
	 */
	public static Conexao getInstance() {
		if (instance == null) {
			instance = new Conexao();
		}
		return instance;
	}
	
	/**
	 * Acao responsavel por abrir a conexao
	 */
	public void abrir() {
		System.out.println("Abrindo conexão");
	}
	
	/**
	 * Acao responsavel por fechar a conexao
	 */
	public void fechar() {
		System.out.println("Fechando conexão");
	}
	
}