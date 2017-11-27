package br.com.trabalhogof.domain.adapter;

import br.com.trabalhogof.domain.entity.Usuario;

public class AutenticacaoAdapter {
	
	private Usuario usuario;

	public AutenticacaoAdapter(Usuario usuario) {
		super();
		this.usuario = usuario;
	}
	
	/**
	 * Metodo responsavel por adaptar o modo de autenticacao
	 */
	public void autenticar() {
		System.out.println("Iniciando autenticacao do usuario");
		System.out.println("login: " + usuario.getLogin());
		System.out.println("senha: " + usuario.getSenha());
		System.out.println("Finalizando autenticacao do usuario");
	}
	
}
