package br.com.trabalhogof.domain.entity;

import javax.persistence.Entity;

@Entity
public class Livro {
	
	private String identificador;
	private String titulo;
	
	public boolean disponivel() {
		//TODO IMPLEMENTAR
		return false;
	}
	
	public void reservar(Usuario usuario) {
		//TODO IMPLEMENTAR
	}
	
	public void baixarReserva(Usuario usuario) {
		//TODO IMPLEMENTAR
	}
	
	public boolean possuiReserva(Usuario usuario) {
		//TODO IMPLEMENTAR
		return false;
	}
	
	public void cancelarReserva(Usuario usuario) {
		//TODO IMPLEMENTAR
	}
	
}
