package br.com.trabalhogof.domain.reserva.entity;

import br.com.trabalhogof.domain.entity.Usuario;

public abstract class Status {

	public abstract void reservar(Usuario usuario) ;
	
	public abstract void baixarReserva(Usuario usuario);
	
	public abstract boolean possuiReserva(Usuario usuario);
	
	public abstract void cancelarReserva(Usuario usuario) ;
	
}