package br.com.trabalhogof.domain;

import java.util.List;

import br.com.trabalhogof.domain.entity.Reserva;

public interface EstrategiaReserva {
	
	public boolean podeReservar(List<Reserva> reservas);
	
}
