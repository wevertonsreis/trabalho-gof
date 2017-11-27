package br.com.trabalhogof.domain;

public abstract class UsuarioHandler {

	private UsuarioHandler proximoUsuarioHandler;
	
	public UsuarioHandler(UsuarioHandler proximoUsuarioHandler) {
		super();
		this.proximoUsuarioHandler = proximoUsuarioHandler;
	}
	
	public boolean tomarEmprestimo() {
		if (podeTomarEmprestimo()) {
			return true;
		} else {
			if (proximoUsuarioHandler != null) {
				proximoUsuarioHandler.tomarEmprestimo();
			}			
		}
		return false;
	}
	
	public abstract boolean podeTomarEmprestimo();
	
}
