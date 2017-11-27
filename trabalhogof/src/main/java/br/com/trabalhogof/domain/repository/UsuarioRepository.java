package br.com.trabalhogof.domain.repository;

import br.com.trabalhogof.domain.entity.Usuario;

public class UsuarioRepository {

	private UsuarioRepository() {}

	public static Usuario findAguardandoLivro(Long idLivro) {
		Usuario u5 = new Usuario(null);
		u5.setNome("TESTE 5");
		
		Usuario u4 = new Usuario(u5);
		u4.setNome("TESTE 4");
		
		Usuario u3 = new Usuario(u4);
		u3.setNome("TESTE 3");
		
		Usuario u2 = new Usuario(u3);
		u2.setNome("TESTE 2");
		
		Usuario u1 = new Usuario(u2);
		u1.setNome("TESTE 1");
		
		return u1;
	}
	
	public static void main(String[] args) {
		
		Usuario usuario = findAguardandoLivro(null);
		
		System.out.println(usuario.tomarEmprestimo());
		
	}
	
}
