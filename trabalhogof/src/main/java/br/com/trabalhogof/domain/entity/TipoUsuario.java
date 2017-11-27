package br.com.trabalhogof.domain.entity;

import java.util.List;

import br.com.trabalhogof.domain.EstrategiaReserva;

public enum TipoUsuario implements EstrategiaReserva {
	
	PADRAO {
		@Override
		public boolean podeReservar(List<Reserva> reservas) {
			
			if(reservas == null)
				return true;
			
			int reservasAtiva = 0;
			for (Reserva reserva : reservas) {
				if (reserva.isAtiva())
					reservasAtiva++;
			}
			
			return reservasAtiva < 2;	
		}
	},
	
	ESPECIAL {
		@Override
		public boolean podeReservar(List<Reserva> reservas) {
			if(reservas == null)
				return true;
			
			int reservasAtiva = 0;
			for (Reserva reserva : reservas) {
				if (reserva.isAtiva())
					reservasAtiva++;
			}
			
			return reservasAtiva < 10;	
		}

	};

}