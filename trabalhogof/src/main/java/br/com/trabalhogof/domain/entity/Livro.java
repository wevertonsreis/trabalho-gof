package br.com.trabalhogof.domain.entity;

import br.com.trabalhogof.domain.reserva.entity.Reserva;

public class Livro {
	
	private String identificador;
	private String titulo;
	private Reserva reserva;
	
	public boolean disponivel() {
		//TODO IMPLEMENTAR
		return false;
	}
	
	public void reservar(Usuario usuario) {
		reserva.getStatus().reservar(usuario);
	}
	
	public void baixarReserva(Usuario usuario) {
		reserva.getStatus().baixarReserva(usuario);
	}
	
	public boolean possuiReserva(Usuario usuario) {
		return reserva.getStatus().possuiReserva(usuario);
	}
	
	public void cancelarReserva(Usuario usuario) {
		reserva.getStatus().cancelarReserva(usuario);
	}
	
}
